<?php
/*
Plugin Name: StandardsReader
Plugin URI: 
Description: Creates a Wordpress taxonomy from XML standards documents that follow the Achievement Standards Network metadata scheme. Also enables creation of Learning Maps of taxonomy nodes
Version: 0.1
Author: LD4PE
Author URI: 
*/

defined( 'ABSPATH' ) or die( 'Plugin file cannot be accessed directly.' );

//PLUGIN SETUP - create database to store saved set info independently of user/post
global $sr_db_version;
$sr_db_version = '1.0';

//Dependencies
require_once 'lib/EasyRdf.php';
require_once 'lib/html_tag_helpers.php';
require_once 'LearningMaps.php';
require_once 'browse-index-widget.php';

//Create short term for namespaces used in competency and taxonomy files
EasyRdf_Namespace::set('rdf', 'http://www.w3.org/1999/02/22-rdf-syntax-ns#');
EasyRdf_Namespace::set('dcterms', 'http://purl.org/dc/terms/');


add_action('admin_menu', 'sr_admin_actions');//Creates the Standards Reader admin menu accessed from the dashboard > Settings > Standards Reader
add_action('admin_init', array( $this, 'register_settings' ));//Initializes plugin settings
add_action( 'init', 'add_custom_taxonomies', 0 );//Creates the Competency Index custom taxonomy
add_action( 'standards_resource_check','run_resource_check' );//Checks for new resources associated with Competency Index nodes in the remote repository at the interval specified in the plugin's settings page (in the WP dashboard)
add_action('widgets_init', 'register_browse_widget'); //registers the browse index widget with Wordpress
add_shortcode( 'competency_index', 'list_competencies'); // creates the competency_index shortcode, which is used to display the competency index
add_shortcode( 'topic_index', 'list_topics');// creates the topic_index shortcode, which is used to display the custom topics


add_action( 'wp_enqueue_scripts', 'local_scripts' );//adds all plugin-specific non-PHP files to WP
add_shortcode( 'competency_index_dev', 'list_competencies_dev');//development use onlu

//PLUGIN SETUP - create database on plugin activation
register_activation_hook( __FILE__, 'standardsreader_db_install' );

//create the plugin database
function standardsreader_db_install() {
	global $wpdb;
	global $sr_db_version;
	define( 'DIEONDBERROR', true );
	$wpdb->show_errors();
	
	$main_table_name = $wpdb->prefix . 'standardsreader_maps';
	$competency_table = $wpdb->prefix . 'standardsreader_map_comps';
	
	
	$charset_collate = $wpdb->get_charset_collate();

	$sql = "CREATE TABLE $main_table_name (
		id mediumint(9) NOT NULL AUTO_INCREMENT,
		user_id mediumint(9) NOT NULL,
		set_name tinytext NOT NULL,
		set_description text DEFAULT '' NOT NULL,
		set_public tinyint(1) DEFAULT 1 NOT NULL,
		set_deleted tinyint(1) DEFAULT 0 NOT NULL,
		set_created text DEFAULT '' NOT NULL,
		UNIQUE KEY id (id)
	) $charset_collate;";
	
	$compSql = "CREATE TABLE $competency_table (
		map_id mediumint(9) NOT NULL,
		comp_slug text DEFAULT '' NOT NULL, 
		order_comps mediumint(9) NOT NULL
	) $charset_collate;";

	require_once( ABSPATH . 'wp-admin/includes/upgrade.php' );
	$r1 = dbDelta( $sql );
	$r2 = dbDelta($compSql);
	
	echo $wpdb->print_error();

	add_option( 'standardsreader_db_version', $sr_db_version );
}

//PLUGIN SETUP - Registers the Browse Competency Index widget with WP
function register_browse_widget() {
	register_widget("browse_index_widget");	
}

//PLUGIN SETUP - Creates the plugin's settings menu
function sr_admin_actions() {  
	add_options_page("Standards Reader", "Standards Reader", "edit_published_posts", "sr_options", "sr_admin");
}

//PLUGIN SETUP - include the file that creates the settings page in the database		
function sr_admin() {  
	include('StandardsReader-admin.php');  
}

//PLUGIN SETTINGS - register the plugin settings
function register_settings() {
	register_setting(
		'StandardsReader_settings_group', // Option group
		'endpoint'); // Sanitize
	
	register_setting(
		'StandardsReader_settings_group', // Option group
		'check_interval'); // Sanitize
	
	register_setting('StandardsReader_settings_group', 'mapPage');
	register_setting('StandardsReader_settings_group', 'mapListing');
		 
}

//PLUGIN SETUP - queue the necessary scripts
function local_scripts() {
	wp_enqueue_script( 'sr-functions', plugins_url() . '/StandardsReader/lib/functions.js', array(), '1.0.0', true );
	wp_enqueue_style('sr-style', plugins_url() . '/StandardsReader/lib/styles.css');
}

/*
Displays the competency index
$atts = array of optional settings specified in shortcode
Optional settings are:
'target' = the HTML element in which to display associated content when a node is clicked
'src' = what to display when the broswer back button is pressed (should be in the URL, not specified in the shortcode)
'collapse' = whether to display the index with child nodes collapsed
'taxonomy' = the Wordpress name for the taxonomy to display (not the user-facing name)
'is_map_builder' = whether or not the taxonomy is being displayed as part of a learning map builder
*/
function list_competencies($atts) {
	$src = 'empty';
	
	if (isset($_GET['src']))
		$src = $_GET['src'];
	
	//set the settings values based on the the user-specified shortcode values or the defaults
	$a = shortcode_atts( array(
        'target' => 'empty',
		'src' => $src,
		'collapse' => false,
		'taxonomy' => 'asn_index',
		'is_map_builder' => false
    ), $atts );
	wp_localize_script( 'sr-functions', 'target_div', $a );//passes the settings values to functions.js
	
	$taxonomy     = $a['taxonomy'];
	$orderby      = 'slug';//order the competency index by the Wordpress slug
	$show_count   = $a['is_map_builder'] ? 0:1;//show the number of learning resources associated with this node if this is not for a map builder
	$pad_counts   = 1;//include the child node counts in the parent counts
	$hierarchical = 1;//the taxonomy is hierarchical
	$title        = '';//do not show an automatic title
	$empty        = 0;//show all nodes, even if they do not have associated resources
	
	$args = array(
	  'taxonomy'     => $taxonomy,
	  'orderby'      => $orderby,
	  'show_count'   => $show_count,
	  'pad_counts'   => $pad_counts,
	  'hierarchical' => $hierarchical,
	  'title_li'     => $title,
	  'hide_empty'   => $empty,
	  'echo' => 0
	);
	
	if ($a['is_map_builder']) { //if this is for the learning map builder, check that the user is logged in before displaying the index (must be logged in to use the map builder)
		if (is_user_logged_in())  { 
			$ret = '<div id="comp-list" class="comp-index-nav is-map">'.wp_list_categories( $args ).'</div>'; 
		}
		else $ret = '<a href="'.esc_attr(get_option('mapListing')).'"><< Show all Learning Maps</a>';
	} else { //if this is not for the learning map builder, display the index
		$collapse = ($a['collapse']) ? " " : " no-collapse";
		$ret = '<div id="comp-list" class="comp-index-nav not-map' . $collapse . '">'.wp_list_categories( $args ).'</div>';
	}
	
	return $ret;
}

/*
Display the topic index
$atts = array of optional settings specified in shortcode
Optional settings are:
'target' = the HTML element in which to display associated content when a node is clicked
'src' = what to display when the broswer back button is pressed (should be in the URL, not specified in the shortcode)
'collapse' = whether to display the index with child nodes collapsed
'taxonomy' = the Wordpress name for the taxonomy to display (not the user-facing name)
*/
function list_topics($atts) {
	$src = 'empty';
	
	if (isset($_GET['src']))
		$src = $_GET['src'];
	
	$a = shortcode_atts( array(
        'target' => 'empty',
		'src' => $src,
		'collapse' => false,
		'taxonomy' => 'asn_topic_index'
    ), $atts );
	wp_localize_script( 'sr-functions', 'target_div', $a );
	
	$taxonomy     = 'asn_topic_index';
	$orderby      = 'slug';
	$show_count   = 1;
	$pad_counts   = 1;
	$hierarchical = 1;
	$title        = '';
	$empty        = 0;
	
	$args = array(
	  'taxonomy'     => $taxonomy,
	  'orderby'      => $orderby,
	  'show_count'   => $show_count,
	  'pad_counts'   => $pad_counts,
	  'hierarchical' => $hierarchical,
	  'title_li'     => $title,
	  'hide_empty'   => $empty,
	  'echo' => 0
	);
	
	return '<div id="topic-list">'.wp_list_categories( $args ).'</div>';
}

/*
Development-only version of list_competencies()
*/
function list_competencies_dev($atts) {
	$src = 'empty';
	
	if (isset($_GET['src']))
		$src = $_GET['src'];
	
	$a = shortcode_atts( array(
        'target' => 'empty',
		'src' => $src,
		'collapse' => false
    ), $atts );
	wp_localize_script( 'sr-functions', 'target_div', $a );
	
	$taxonomy     = 'asn_index';
	$orderby      = 'slug';
	$show_count   = 1;
	$pad_counts   = 1;
	$hierarchical = 1;
	$title        = '';
	$empty        = 0;
	
	$args = array(
	  'taxonomy'     => $taxonomy,
	  'orderby'      => $orderby,
	  'show_count'   => $show_count,
	  'pad_counts'   => $pad_counts,
	  'hierarchical' => $hierarchical,
	  'title_li'     => $title,
	  'hide_empty'   => $empty,
	  'echo' => 0
	);
	
	return '<div id="comp-list">'.wp_list_categories( $args ).'</div>';
}

/*
Competency Index - Create a WP taxonomy from an uploaded document (dashboard > Settings > Standards Reader)
$standards = the uploaded Competency Index
*/
function build_taxonomy($standards) {
	$keys = array_keys($standards);
	$doc = get_document_level($keys);
	$docResource = substr(strrchr($keys[$doc],"/"),1);
	$isUpdate = false;
	//If the taxonomy exists, treat this as an update, otherwise create a new competency index
	if (check_existing_standards($docResource, true)) {
		echo "<p><b>This standard exists!</b></p>";
		$isUpdate = true;
	}
	else {
		echo "<p><b>A new competency index will be created for ".$standards[$keys[$doc]]["http://purl.org/dc/elements/1.1/title"][0]["value"]. "</b></p>";
		
	}
	parse_json_standards($standards, $doc, $isUpdate);
}

/*
Topic Index - Create a WP taxonomy from an uploaded document (dashboard > Settings > Standards Reader)
$topics = the uploaded Topic Index
*/
function build_index($topics) {
	$keys = array_keys($topics);
	print_r($topics[$keys[0]]);
	//get name of top level subject/topic
	if (count($keys) > 0) {
		$parts = explode("/", remove_last_slash($keys[0]));
		$topLevel = $parts[count($parts) - 1];
		$isUpdate = false;
		//If the topic index exists, treate this as an update. Otherwise, create new index
		if (check_existing_standards($topLevel, false)) {
			echo "<p><b>This subject index exists! Checking for updates...</b></p>";
			$isUpdate = true;
		}
		else {
			echo "<p><b>A new subject index will be created for ".$topics[$keys[0]]["http://purl.org/dc/elements/1.1/title"][0]["value"]. "</b></p>";
			
		}
		parse_json_topics($topics, $isUpdate);
	} else echo "<p>Could not read document!</p>";
	
	
}

/*
Creates a new WP custom taxonomy for the Topic Index
*/
function create_new_topic_index() {
	// Add new taxonomy
  $types = array('post','page','attachment','nav_menu_item', 'learning_resource');
  register_taxonomy('asn_topic_index', $types, array(
    'hierarchical' => true,
    'labels' => array(
      'name' => _x( 'ASN Topic Index', 'taxonomy general name' ),
      'singular_name' => _x( 'Topic', 'taxonomy singular name' ),
      'search_items' =>  __( 'Search Topics' ),
      'all_items' => __( 'All Topics' ),
      'parent_item' => __( 'Parent Topic' ),
      'parent_item_colon' => __( 'Parent Topic:' ),
      'edit_item' => __( 'Edit Topic' ),
      'update_item' => __( 'Update Topic' ),
      'add_new_item' => __( 'Add New Topic' ),
      'new_item_name' => __( 'New Topic Name' ),
      'menu_name' => __( 'Topic Index' ),
    ),
    //Slugs used for this taxonomy
    'rewrite' => array(
      'slug' => 'topic_index', 
      'with_front' => false,
      'hierarchical' => true 
    ),
  ));
}

//UTILITY FUNCTION - get rid of ending / in urls
function remove_last_slash($url) {
	if (substr($url,-1) == '/') {
		return substr($url, 0, strlen($url) - 1);
	}
	else return ($url);	
}

/*
Create/update the competency index from the uploaded JSON
$standards = the JSON read from the uploaded document
$doc = the document level element
$isUpdate = if this is an update to an existing taxonomy
*/
function parse_json_standards($standards, $doc, $isUpdate) {
	$failures = array();//contains nodes that could not be created because of missing parent.
	$keys = array_keys($standards);
	$newEntries = array();
	$updates = array();
	//process each node in the index in term
	for ($k = 0; $k < count($keys); $k++) {
		$key = $keys[$k];
		if (is_competency_node($key)) {
			$resourceSlug = substr(strrchr(remove_last_slash($key),"/"),1);
			$title = $standards[$key]["http://purl.org/dc/elements/1.1/title"][0]["value"];
			$description = $standards[$key]["http://purl.org/dc/terms/description"][0]["value"];
			$parentUri = remove_last_slash($standards[$key]["http://purl.org/gem/qualifiers/isChildOf"][0]["value"]);
			$parent = 0;
			$name = $description;
			if ($parentUri == null) {
				$name = $title;	
			}
			else {
				//find term_id of parent in the WP taxonomy;
				$parentSlug = substr(strrchr($parentUri,"/"),1);
				$term = get_term_by( "slug", $parentSlug, "asn_index");
				$description = '';
				//If parent was found, add this node to the parent. If not, add it to the list of failures.
				if ($term !== false) {
					$parent = (int)$term->term_id;
				}
				else {
					$failures[] = $k;
				}	
			}
			if (array_search($k,$failures) === false) {//if the node is not an orphan
				if (!check_existing_standards($resourceSlug, true)) { //if the node is not already in the index, insert it
					$cid = wp_insert_term(
						$name,
						"asn_index",
						array(
							'description' => $description,
							'slug' => $resourceSlug,
							'parent' => $parent
						)
					);
					if (is_wp_error( $cid ) ) //if adding the node produces an error, make sure the name is less than 200 characters long
					{
						if (strlen($name) > 200) {
							$description = $name;
							$name = substr($name, 0, 200);
							wp_insert_term(
								$name,
								"asn_index",
								array(
									'description' => $description,
									'slug' => $resourceSlug,
									'parent' => $parent
								)
							);
							echo $resourceSlug . " name had to be shortened!";
						}
					}
					if ($isUpdate) {
						$newEntries[] = array("Name" => $name, "Id" => $resourceSlug, "Parent" => $parent);
					}
				}
				else { //this node already exists so update with new values
					$term = get_term_by( "slug", $resourceSlug, "asn_index");
					$termUpdate = 0;
					if (html_entity_decode(substr($term->name, 0, 200)) != html_entity_decode($substr($name, 0, 200))) {
						$termUpdate++;
						wp_update_term($term->term_id, 'asn_index', array('name' => $substr($name, 0, 200)));
					}
					if (html_entity_decode($term->description) != html_entity_decode($description) && $name != html_entity_decode($description)) {
						$termUpdate++;
						wp_update_term($term->term_id, 'asn_index', array('description' => $description));
					}
					if (html_entity_decode($term->parent) != html_entity_decode($parent)) {
						$termUpdate++;
						wp_update_term($term->term_id, 'asn_index', array('parent' => $parent));
					}
					if ($termUpdate > 0)
						$updates[] = array("id" => $resourceSlug, "name" => $name);
				}
			}
		}
	}
	//notify the uploader of any nodes that were updated or failed
	if ($isUpdate && count($newEntries) > 0 || count($updates) > 0)
		notify_modifications($newEntries, $updates);
	if (count($failures) > 0) {
		echo "failures:";
		print_r($failures);	
	}
	
}

/*
Create/update the topic index from the uploaded JSON
$topics = the JSON read from the uploaded document
$isUpdate = if this is an update to an existing taxonomy
*/
function parse_json_topics($topics, $isUpdate) {
	$failures = array();//contains nodes that could not be created because of missing parent.
	$keys = array_keys($topics);
	$newEntries = array();
	$updates = array();
	//process each node in turn
	for ($k = 0; $k < count($keys); $k++) {
		$key = $keys[$k];
		echo '<br/>importing ' . $k;
		$resourceSlug = substr(strrchr(remove_last_slash($key),"/"),1);
		echo '<br/>slug ' . $resourceSlug;
		$title = $topics[$key]["http://www.w3.org/2004/02/skos/core#prefLabel"][0]["value"];
		if ($k == 0)
			$title = $topics[$key]["http://purl.org/dc/elements/1.1/title"][0]["value"];
		echo '<br/>title ' . $title . '<br/>';
		$parentUri = remove_last_slash($topics[$key]["http://www.w3.org/2004/02/skos/core#broader"][0]["value"]);
		$parent = 0;
		//If the uploaded document specifies a parent for this node...
		if ($parentUri != null) {
			$parentSlug = substr(strrchr($parentUri,"/"),1);
			echo '<br/>parentSlug ' . $parentSlug;
			$term = get_term_by( "slug", $parentSlug, "asn_topic_index");
			//if the parent is found in the taxonomy, set the parent. Otherwise record this as a failed entry
			if ($term !== false) {
				$parent = (int)$term->term_id;
			}
			else {
				$failures[] = $k;
			}	
		}
		//If this node is not a failed entry...
		if (array_search($k,$failures) === false) {
			//insert the node if it does not already exist. Otherwise, update the existing node with the values in the document
			if (!check_existing_standards($resourceSlug, false)) {
				$cid = wp_insert_term(
					$title,
					"asn_topic_index",
					array(
						'description' => $title,
						'slug' => $resourceSlug,
						'parent' => $parent
					)
				);
				if (is_wp_error( $cid ) )
				{
					echo " error: " . $cid->get_error_message();
					if (strlen($title) > 200) {
						$name = substr($title, 0, 200);
						wp_insert_term(
							$name,
							"asn_topic_index",
							array(
								'description' => $title,
								'slug' => $resourceSlug,
								'parent' => $parent
							)
						);
						echo $resourceSlug . " name had to be shortened!";
					}
				}
				if ($isUpdate) {
					$newEntries[] = array("Name" => $title, "Id" => $resourceSlug, "Parent" => $parent);
				}
			}
			else {
				$term = get_term_by( "slug", $resourceSlug, "asn_topic_index");
				$termUpdate = 0;
				if (html_entity_decode(substr($term->name, 0, 200)) != html_entity_decode($substr($title, 0, 200))) {
					$termUpdate++;
					wp_update_term($term->term_id, 'asn_topic_index', array('name' => $substr($title, 0, 200)));
				}
				if (html_entity_decode($term->description) != html_entity_decode($description) && $title != html_entity_decode($title)) {
					$termUpdate++;
					wp_update_term($term->term_id, 'asn_topic_index', array('description' => $title));
				}
				if (html_entity_decode($term->parent) != html_entity_decode($parent)) {
					$termUpdate++;
					wp_update_term($term->term_id, 'asn_topic_index', array('parent' => $parent));
				}
				if ($termUpdate > 0)
					$updates[] = array("id" => $resourceSlug, "name" => $title);
			}
		}
	}
	//Notify the uploader of any modifications and any failed nodes
	if ($isUpdate && count($newEntries) > 0 || count($updates) > 0)
		notify_modifications($newEntries, $updates);
	if (count($failures) > 0) {
		echo "failures:";
		print_r($failures);	
	}
	
}

/*
For either the competency index or the topic index, list the new or modified nodes in the dashboard > settings page
$new = new nodes
$updates = updated nodes
*/
function notify_modifications($new, $updates) {
	if (count($new) > 0) {
		echo "<p><b>New terms created:</b></p><ul>";
		for ($c = 0; $c < count($new); $c++) {
			echo "<li>" . $new[$c]["Id"] . ": " . $new[$c]["Name"] . "</li>";	
		}
		echo "</ul>";
	}
	if (count($updates) > 0) {
		echo "<p><b>The following terms were modified:</b></p><ul>";
		for ($u = 0; $u < count($updates); $u++) {
			echo "<li>" . $updates[$u]["id"] . ": " . $updates[$u]["name"] . "</li>";
		}
		echo "</ul>";
	}
}

/*
Check if a given node is a competency
$key = the node string to check
*/
function is_competency_node($key) {
	if (strpos($key,"http://asn.desire2learn.com/resources/") !== false && strpos($key, ".xml") === false)
		return true;
	else return false;	
}

/* 
Returns the index of the document level node (i.e. the name/id of the standards) in the uploaded document
$keys = all the keys in the uploaded document
*/
function get_document_level($keys) {
	for ($i = 0; $i < count($keys); $i++) {
		$resource = substr(strrchr($keys[$i],"/"),1);
		if (strpos($resource,".") === false && substr($resource,0,1) == "D") 
			return $i;
	}
	return -1;
}

/*
Checks if a node is in the competency/topic index
$slug = the Wordpress 'slug' to check
$isCompetency = whether to check the competency index or the topic index
*/
function check_existing_standards($slug, $isCompetency) {
	$tax;
	if ($isCompetency)
		$tax = "asn_index";
	else $tax = "asn_topic_index";
	$term = get_term_by( "slug", $slug, $tax);
	if ($term !== false) {
	  return true;
	}
	else return false;	
}

//Creates the Competency Index custom taxonomy and adds it to Wordpress
function add_custom_taxonomies() {
  // Add new taxonomy
  $types = array('post','page','attachment','nav_menu_item', 'learning_resource');
  register_taxonomy('asn_index', $types, array(
    'hierarchical' => true,
    'labels' => array(
      'name' => _x( 'ASN Index', 'taxonomy general name' ),
      'singular_name' => _x( 'Competency', 'taxonomy singular name' ),
      'search_items' =>  __( 'Search Competencies' ),
      'all_items' => __( 'All Competencies' ),
      'parent_item' => __( 'Parent Competency' ),
      'parent_item_colon' => __( 'Parent Competency:' ),
      'edit_item' => __( 'Edit Competency' ),
      'update_item' => __( 'Update Competency' ),
      'add_new_item' => __( 'Add New Competency' ),
      'new_item_name' => __( 'New Competency Name' ),
      'menu_name' => __( 'Competency Index' ),
    ),
    //Slugs used for this taxonomy
    'rewrite' => array(
      'slug' => 'competency_index', 
      'with_front' => false,
      'hierarchical' => true 
    ),
  ));
  add_custom_post_type();
  create_new_topic_index();
  add_metadata_taxonomies();
}

/*
Creates the metadata taxonomies for use with learning resources
*/
function add_metadata_taxonomies() {
	/*
	Educational use: http://schema.org/educationalUse e.g. http://purl.org/dcx/lrmi-vocabs/edUse/instruction
Educational audience: http://schema.org/EducationalAudience e.g. http://purl.org/dcx/lrmi-vocabs/educationalAudienceRole/student
Interactivity type: http://schema.org/interactivityType e.g. http://purl.org/dcx/lrmi-vocabs/interactivityType/expositive (active, expositive, or mixed)
Proficiency level: http://schema.org/proficiencyLevel (Beginner, Expert)
	*/
	add_educational_use();
	add_educational_audience();
	add_interactivity_type();
	add_proficiency_level();
}

//Creates the custom taxonomy for educational use
function add_educational_use() {
	// Add new taxonomy
  $types = array('post','page','attachment','nav_menu_item', 'learning_resource');
  register_taxonomy('asn_educational_use', $types, array(
    'hierarchical' => false,
    'labels' => array(
      'name' => _x( 'Educational Use', 'taxonomy general name' ),
      'singular_name' => _x( 'Educational Use', 'taxonomy singular name' ),
      'search_items' =>  __( 'Search Educational Uses' ),
      'all_items' => __( 'All Educational Uses' ),
      'parent_item' => __( 'Parent Educational Use' ),
      'parent_item_colon' => __( 'Parent Educational Use:' ),
      'edit_item' => __( 'Edit Educational Use' ),
      'update_item' => __( 'Update Educational Use' ),
      'add_new_item' => __( 'Add New Educational Use' ),
      'new_item_name' => __( 'New Educational Use Name' ),
      'menu_name' => __( 'Educational Use' ),
    ),
    //Slugs used for this taxonomy
    'rewrite' => array(
      'slug' => 'educational_use', 
      'with_front' => false,
      'hierarchical' => false 
    ),
  ));	
}

//Creates the custom taxonomy for educational audience
function add_educational_audience() {
	$types = array('post','page','attachment','nav_menu_item', 'learning_resource');
  register_taxonomy('asn_educational_audience', $types, array(
    'hierarchical' => false,
    'labels' => array(
      'name' => _x( 'Educational Audience', 'taxonomy general name' ),
      'singular_name' => _x( 'Educational Audience', 'taxonomy singular name' ),
      'search_items' =>  __( 'Search Educational Audiences' ),
      'all_items' => __( 'All Educational Audiences' ),
      'parent_item' => __( 'Parent Educational Audience' ),
      'parent_item_colon' => __( 'Parent Educational Audience:' ),
      'edit_item' => __( 'Edit Educational Audience' ),
      'update_item' => __( 'Update Educational Audience' ),
      'add_new_item' => __( 'Add New Educational Audience' ),
      'new_item_name' => __( 'New Educational Audience Name' ),
      'menu_name' => __( 'Educational Audience' ),
    ),
    //Slugs used for this taxonomy
    'rewrite' => array(
      'slug' => 'educational_audience', 
      'with_front' => false,
      'hierarchical' => false 
    ),
  ));
}

//Creates the custom taxonomy for interactivity type
function add_interactivity_type() {
	$types = array('post','page','attachment','nav_menu_item', 'learning_resource');
  register_taxonomy('asn_interactivity_type', $types, array(
    'hierarchical' => false,
    'labels' => array(
      'name' => _x( 'Interactivity Type', 'taxonomy general name' ),
      'singular_name' => _x( 'Interactivity Type', 'taxonomy singular name' ),
      'search_items' =>  __( 'Search Interactivity Types' ),
      'all_items' => __( 'All Interactivity Types' ),
      'parent_item' => __( 'Parent Interactivity Type' ),
      'parent_item_colon' => __( 'Parent Interactivity Type:' ),
      'edit_item' => __( 'Edit Interactivity Type' ),
      'update_item' => __( 'Update Interactivity Type' ),
      'add_new_item' => __( 'Add New Interactivity Type' ),
      'new_item_name' => __( 'New Interactivity Type Name' ),
      'menu_name' => __( 'Interactivity Type' ),
    ),
    //Slugs used for this taxonomy
    'rewrite' => array(
      'slug' => 'interactivity_type', 
      'with_front' => false,
      'hierarchical' => false 
    ),
  ));
}

//Creates the custom taxonomy for proficiency level
function add_proficiency_level() {
	$types = array('post','page','attachment','nav_menu_item', 'learning_resource');
  register_taxonomy('asn_proficiency_level', $types, array(
    'hierarchical' => false,
    'labels' => array(
      'name' => _x( 'Proficiency Level', 'taxonomy general name' ),
      'singular_name' => _x( 'Proficiency Level', 'taxonomy singular name' ),
      'search_items' =>  __( 'Search Proficiency Levels' ),
      'all_items' => __( 'All Proficiency Levels' ),
      'parent_item' => __( 'Parent Proficiency Levele' ),
      'parent_item_colon' => __( 'Parent Proficiency Level:' ),
      'edit_item' => __( 'Edit Proficiency Level' ),
      'update_item' => __( 'Update Proficiency Level' ),
      'add_new_item' => __( 'Add New Proficiency Level' ),
      'new_item_name' => __( 'New Proficiency Level Name' ),
      'menu_name' => __( 'Proficiency Level' ),
    ),
    //Slugs used for this taxonomy
    'rewrite' => array(
      'slug' => 'proficiency_level', 
      'with_front' => false,
      'hierarchical' => false 
    ),
  ));
}

//Creates the Learning Resource custom post type in Wordpress
function add_custom_post_type() {
	register_post_type( 'learning_resource',
    array(
      'labels' => array(
        'name' => __( 'Learning Resources' ),
        'singular_name' => __( 'Learning Resource' )
      ),
      'public' => true,
      'has_archive' => true,
    )
  );
}

/*
This function sets the time interval for checking for learning resource additions and updates in the remote repository
$int = the time in hours. If $int == 0, do not automatically check for updates
*/
function update_interval_schedule($int) {
	//check schedule exists, remove it, add new one	
	wp_clear_scheduled_hook('standards_resource_check');	
	if ($int > 0)
		wp_schedule_single_event( time() + 3600 * $int, 'standards_resource_check' );
}

/*
Schedules the automatic check for learning resource additions and updates in the remote repository
*/
function run_resource_check() {
	log_event('resource check begun');
	$int = get_option('check_interval ',24);
	if ($int > 0) {
		wp_schedule_single_event( time() + 3600 * $int, 'standards_resource_check' );
		log_event('next check in ' . $int . ' hours');
	}
	resource_import(true);
	
}

/*
Logs any automatic checks for learning resource additions/updates in the remote repository
Logged to a .txt file in the plugin directory
*/
function log_event($action) {
	$now = new DateTime();	
	file_put_contents(WP_PLUGIN_DIR."/StandardsReader/cron_log.txt", "|" . $now->format('Y-m-d H:i:s') . " ". $action . "\r\n", FILE_APPEND | LOCK_EX);
}

/*
Imports learning resources from the remote repository
$doFilter = true if this is an automatic, scheduled update. Makes it possible to only check for changes since the last import
*/
function resource_import($doFilter) {
	echo 'importing ' . $doFilter;
	if ($doFilter) {
		log_event('checking last day');
		$today = new DateTime();
		$opt = get_option('check_interval ',24);//gets the current time interval for automatic check
		$daysToCheck = ceil($opt/24);
		$start = new DateTime();
		$interval = new DateInterval('P'.$daysToCheck.'D');
		$start->sub($interval);
		$filter = 'dcterms:created ?date.
		 FILTER (?date > "'.$start->format('Y-m-d').'"^^xsd:date)
		 FILTER (?date < "'. $today->format('Y-m-d').'"^^xsd:date)';
	} else $filter = 'dcterms:created ?date;';
	$sparql = new EasyRdf_Sparql_Client(esc_attr(get_option( 'endpoint')));
	log_event('creating query for ' . $filter);
	//Get the resources
	$result = $sparql->query(
        'SELECT COUNT(?s) as ?totalRecords {
		 ?s rdf:type <http://schema.org/CreativeWork>;
		 
		   '.$filter.'
		}'
    );
	$urls = array();
	//import each page of results...
	foreach ($result as $row) {
       echo intval($row->totalRecords->getValue()) . ' records to import ';
	   get_urls(intval($row->totalRecords->getValue()), 0, $urls, $filter);
    }
	echo ' import completed';
	log_event('import completed');
}

/*
Gets the URLs of the resources to import from the remote repository
$count = number of records to import
$start = the record to start with (limited to 50 records at a time)
$urls = empty array in which to store records
$filter = date range
*/
function get_urls($count, $start, $urls, $filter) {
	if ($start < $count) {
		$sparql = new EasyRdf_Sparql_Client(esc_attr(get_option( 'endpoint')));
		$result = $sparql->query(
			'SELECT distinct ?url ?date WHERE {
				  ?url rdf:type <http://schema.org/CreativeWork>;
				  '.$filter.'
				}
				ORDER BY DESC(?date)
				LIMIT 50
				OFFSET ' . $start
		);
		foreach ($result as $row) {
			echo '<br/>adding to array: '. $row->url;
			array_push($urls, $row->url);
		}
		get_urls($count, $start += 50, $urls, $filter);
	} else {
		process_urls($urls);	
	}
	
	
}

/*
Begin to process the learning resource urls
$urls = array of urls to process
*/
function process_urls($urls) {
	if (count($urls) > 0) {
		echo '<p>Getting url:'.$urls[0].', '. count($urls) .' remaining</p>';
		get_url_info($urls[0], $urls);
	}
}

/*
RDF returned by remote repository often contains illegal characters that break automatic parsing via the EasyRDF library.
This function determines whether the learning resource is "clean" or "broken" and routes it to the appropriate function for parsing and import
$url = the URL to process
$urls = the full list of URLs to import
*/
function get_url_info($url, $urls) {
	$sparql = new EasyRdf_Sparql_Client(esc_attr(get_option( 'endpoint')));
	
	try {
		echo '<br/>Selecting '.$url;
		$result = $sparql->query(
		'SELECT * WHERE {
		  GRAPH <'.$url.'> { ?subject ?predicate ?object.}
		}'
		); 
		parse_clean_graph($result,$urls);
		
	}
	catch (Exception $e) {
		echo '<br/>Error '.$e;
		if (!function_exists('curl_init')){
			die('CURL is not installed!');
		}
		$queryUrl = esc_attr(get_option( 'endpoint')). '?'
		. 'query=SELECT+*+WHERE+%7B%0D%0A++GRAPH+%3C'.$url.'%3E+%7B+%3Fsubject+%3Fpredicate+%3Fobject.%7D%0D%0A%7D'
		. '&output=json';

		$ch= curl_init();
		curl_setopt($ch, CURLOPT_URL, $queryUrl);
		curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);
		$result = json_decode(str_replace('\\",','\\"",', curl_exec($ch)), true);
		curl_close($ch);
		parse_broken_graph($result["results"]["bindings"],$urls);
	}
	
}

/*
Prepares a learning resource to create/update a post in WP - used for "clean" resources that play well with EasyRDF
$result = the RDF for the resource
$urls = the full array of resource URLs
*/
function parse_clean_graph($result, $urls) {
	$resource = array();
	$resource['competencies'] = array();//array to store competencies associated with the resource
	$resource['topics'] = array();//array to store topics associated with the resource
	$resource['about'] = array();//array to store the 'about' info associated with the resource
	//pull out the appropriate content and prepare the learning resource for import/update
	foreach ($result as $row) {
		if (strpos($row->predicate, "http://schema.org/") !== false) {
			$key = str_replace("http://schema.org/", "", $row->predicate);
			if ($key == 'description' || $key == 'dateCreated'  || $key == 'license' || $key == 'author' || $key == 'publisher'
			 || $key == 'timeRequired')
				$resource[$key] = $row->object;
			else if ($key == 'name') {
				$resource['title'] = $row->object;
				$resource['url'] = $row->subject;
			}
			else if ($key == 'targetUrl') {
				$slug = strtolower(substr(strrchr($row->object,"/"),1));
				$tax = get_term_by("slug", $slug, "asn_index");
				if ($tax !== false) {
					array_push($resource['competencies'], (int)$tax->term_id );
				}
			}
			else if ($key == 'about')
				array_push($resource['about'], $row->object);
			else if ($key == 'inLanguage')
				$resource['language'] = $row->object;
			else if ($key == 'interactivityType')
				$resource['interactivityType'] = substr(strrchr($row->object,"/"),1);
			else if ($key == 'educationalUse')
				$resource['educationalUse'] = substr(strrchr($row->object,"/"),1);
			else if ($key == 'EducationalAudience')
				$resource['educationalAudience'] = substr(strrchr($row->object,"/"),1);
			else if ($key == 'proficiencyLevel')
				$resource['proficiencyLevel'] = substr(strrchr($row->object,"/"),1);
		}
		 else if (strpos($row->predicate, "http://purl.org/dc/terms/") !== false) {
			$key = str_replace("http://purl.org/dc/terms/", "", $row->predicate);
			if ($key == 'subject') {
				$slug = strtolower(substr(strrchr(remove_last_slash($row->object),"/"),1));
				$tax = get_term_by("slug", $slug, "asn_topic_index");
				if ($tax !== false) {
					array_push($resource['topics'], (int)$tax->term_id );
				}
			}
		}
			
	}
	finish_import($resource, $urls);
	
}

/*
Prepares a learning resource to create/update a post in WP - used for "broken" resources that need manual parsing
$result = the RDF for the resource
$urls = the full array of resource URLs
*/
function parse_broken_graph($result, $urls) {
	$resource = array();
	$resource['competencies'] = array();//array to store competencies associated with the resource
	$resource['topics'] = array();//array to store topics associated with the resource
	$resource['about'] = array();//array to store the 'about' info associated with the resource
	//pull out the appropriate content and prepare the learning resource for import/update
	foreach ($result as $row) {
		if (strpos($row["predicate"]["value"], "http://schema.org/") !== false) {
			$key = str_replace("http://schema.org/", "", $row["predicate"]["value"]);
			if ($key == 'description' || $key == 'dateCreated'  || $key == 'license' || $key == 'author' || $key == 'publisher'
			 || $key == 'timeRequired')
				$resource[$key] = $row["object"]["value"];
			else if ($key == 'name') {
				$resource['title'] = $row["object"]["value"];
				$resource['url'] = $row["subject"]["value"];
			}
			else if ($key == 'targetUrl') {
				$slug = strtolower(substr(strrchr($row["object"]["value"],"/"),1));
				$tax = get_term_by("slug", $slug, "asn_index");
				if ($tax !== false) {
					array_push($resource['competencies'], (int)$tax->term_id );
				}
			}
			else if ($key == 'about')
				array_push($resource['about'], $row["object"]["value"]);
			else if ($key == 'inLanguage')
				$resource['language'] = $row["object"]["value"];
			else if ($key == 'interactivityType')
				$resource['interactivityType'] = substr(strrchr($row["object"]["value"],"/"),1);
			else if ($key == 'EducationalAudience')
				$resource['educationalAudience'] = substr(strrchr($row["object"]["value"],"/"),1);
			else if ($key == 'educationalUse')
				$resource['educationalUse'] = substr(strrchr($row["object"]["value"],"/"),1);
			else if ($key == 'proficiencyLevel')
				$resource['proficiencyLevel'] = substr(strrchr($row["object"]["value"],"/"),1);
		} else if (strpos($row["predicate"]["value"], "http://purl.org/dc/terms/") !== false) {
			$key = str_replace("http://purl.org/dc/terms/", "", $row["predicate"]["value"]);
			if ($key == 'subject') {
				$slug = strtolower(substr(strrchr(remove_last_slash($row["object"]["value"]),"/"),1));
				$tax = get_term_by("slug", $slug, "asn_topic_index");
				if ($tax !== false) {
					
					array_push($resource['topics'], (int)$tax->term_id );
				}
			}
		}
		
	}
	finish_import($resource, $urls);
}

/*
Finish the preparation of the learning resource's WP post
$resource = the content for the resource
$urls = the full array of resource URLs
*/
function finish_import($resource, $urls) {
	array_shift($urls);
	if ($resource['title'] == "") {
				echo "blank!<br/>";
			}
	if (isset($resource['dateCreated'])) {
		$resource['dateCreated'] = str_replace("T"," ",$resource['dateCreated']);
		$resource['dateCreated'] = str_replace("Z", " ",$resource['dateCreated']);	
	}
	$adjUrl = rawurlencode($resource['url']); 
	//add meta_key for other properties! Put description at the top
	$args = array(
		'post_type' => 'learning_resource',
		'meta_key' => 'resource_uri',
		'meta_value' => $adjUrl,
		'fields' => 'ids',
	);
	$query = new WP_Query($args);
	if (isset($query->posts) && !empty($query->posts)){
		if (count($query->posts) > 1) {
			foreach((array)$query->posts as $id) {
				wp_delete_post($id);
			}
			add_resource($resource, -1);
		} else {
			foreach((array) $query->posts as $id) {
				add_resource($resource, $id);
			}
		}
	} else add_resource($resource, -1);
	process_urls($urls);
}

/*
Add/update the learning resource's WP post
$resource = the content for the resource
$id = the WP post ID to update (-1 if new resource)
*/
function add_resource($resource, $id) {
	//Create the HTML content for the resource page
	$content = '';
	if (isset($resource['description']))
		$content .= '<p>' . esc_attr($resource['description']) . '</p>';
	
	$content .= '<p><b>URL:</b> <a href="' . $resource['url'] . '" target="_blank">' . $resource['url'] . '</a><br/>';
	if (isset($resource['about'])) 
		$content .= '<b>Keywords:</b> ' . join(", ", $resource['about']) . '<br/>';
	if (isset($resource['author'])) 
		$content .= '<b>Author:</b> ' . $resource['author'] . '<br/>';
	if (isset($resource['publisher'])) 
		$content .= '<b>Publisher:</b> ' . $resource['publisher'] . '<br/>';
	if (isset($resource['dateCreated'])) 
		$content .= '<b>Date created:</b> ' . $resource['dateCreated'] . '<br/>';
	if (isset($resource['language'])) 
		$content .= '<b>Language:</b> ' . $resource['language'] . '<br/>';
	if (isset($resource['timeRequired'])) 
		$content .= '<b>Time required:</b> ' . $resource['timeRequired'] . '<br/>';
	if (isset($resource['educationalUse'])) {
		check_term($resource['educationalUse'], "asn_educational_use");
		$content .= '<b>Educational use: </b><a href="'. get_term_link($resource['educationalUse'], "asn_educational_use") . '">' . $resource['educationalUse'] . '</a><br/>';
	}
	if (isset($resource['educationalAudience'])) {
		check_term($resource['educationalAudience'], "asn_educational_audience");
		$content .= '<b>Educational audience: </b><a href="'. get_term_link($resource['educationalAudience'], "asn_educational_audience") . '">' . $resource['educationalAudience'] . '</a><br/>';
	}
	if (isset($resource['interactivityType'])) {
		check_term($resource['interactivityType'], "asn_interactivity_type");
		$content .= '<b>Interactivity type: </b><a href="'. get_term_link($resource['interactivityType'], "asn_interactivity_type") . '">' . $resource['interactivityType'] . '</a><br/>';
	}
	if (isset($resource['proficiencyLevel'])) {
		check_term($resource['proficiencyLevel'], "asn_proficiency_level");
		$content .= '<b>Proficiency level: </b><a href="'. get_term_link($resource['proficiencyLevel'], "asn_proficiency_level") . '">' . $resource['proficiencyLevel'] . '</a><br/>';
	}
	
	$content .= '</p>';
	//Prepare the post attributes	
	$post = array(
	  'post_content'   => $content,
	  'post_name'      => sanitize_title(str_replace('-', ' ',$resource['title'])),
	  'post_title'     => esc_attr($resource['title']),
	  'post_status'    => 'publish',
	  'post_type'      => 'learning_resource'
	);
	

	//Update existing post if appropriate
	if ($id >= 0) {
		$post['ID'] = $id;
		wp_update_post($post);
		wp_set_post_terms( $id, $resource['competencies'], "asn_index" );
		wp_set_post_terms( $id, $resource['topics'], "asn_topic_index" );
		if (isset($resource['interactivityType'])) 
			wp_set_post_terms($id, $resource['interactivityType'], "asn_interactivity_type");
		if (isset($resource['educationalAudience'])) 
			wp_set_post_terms($id, $resource['educationalAudience'], "asn_educational_audience");
		if (isset($resource['educationalUse'])) 
			wp_set_post_terms($id, $resource['educationalUse'], "asn_educational_use");
		if (isset($resource['proficiencyLevel'])) 
			wp_set_post_terms($id, $resource['proficiencyLevel'], "asn_proficiency_level");
		//$content .= '<b>Interactivity type:</b> ' . $resource['interactivityType'];
		if(get_post_meta($id, 'resource_uri', true)=="") {
			add_post_meta($id, 'resource_uri', rawurlencode($resource['url']), true);
		}
	}
	//Create new post if appropriate
	else {
		$post_id = wp_insert_post( $post);
		wp_set_post_terms( $post_id, $resource['competencies'], "asn_index" );
		wp_set_post_terms( $post_id, $resource['topics'], "asn_topic_index" );
		if (isset($resource['interactivityType'])) 
			wp_set_post_terms($post_id, $resource['interactivityType'], "asn_interactivity_type");
		if (isset($resource['educationalAudience'])) 
			wp_set_post_terms($post_id, $resource['educationalAudience'], "asn_educational_audience");
		if (isset($resource['educationalUse'])) 
			wp_set_post_terms($post_id, $resource['educationalUse'], "asn_educational_use");
		if (isset($resource['proficiencyLevel'])) 
			wp_set_post_terms($post_id, $resource['proficiencyLevel'], "asn_proficiency_level");
		add_post_meta($post_id, 'resource_uri', rawurlencode($resource['url']), true);
	}
	
}

/*
Check if a node (term) exists in a taxonomy and insert if not
$term = node to check for
$tax = taxonomy to look in
*/
function check_term($term, $tax) {
	$term_link = get_term_link( $term, $tax );
    
    // If there was an error, insert term.
    if ( is_wp_error( $term_link ) ) {
		wp_insert_term($term, $tax);
	}
}

?>