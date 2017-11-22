<?php
/*
Plugin Name: Saved Sets
Plugin URI: 
Description: Enables users to save, edit, and view sets of Learning Resources
Version: 0.1
Author: LD4PE
Author URI: 
*/

$saveMsg = ''; //feedback message provided when form is saved

add_action('admin_menu', 'ss_admin_actions'); //admin_menu is a built-in WP function - calls ss_admin_actions() defined below
add_action('admin_init', array( $this, 'saved_sets_register_settings' )); //admin_init is a built-in WP function - calls saved_sets_register_settings() defined below
add_shortcode( 'list_saved_sets_form', 'list_sets_form');
add_shortcode( 'list_saved_sets_target', 'list_sets_target');
add_shortcode('list_set_resources_form', 'list_resources_form');
add_shortcode('list_set_resources_target', 'list_resources_target');
//PLUGIN SETUP
add_action('widgets_init', 'install_ss');
add_action( 'wp_enqueue_scripts', 'saved_sets_scripts' );
//PLUGIN SETUP - create database to store saved set info independently of user/post
global $ss_db_version;
//global $wpdb;
$ss_db_version = '1.0';

//PLUGIN SETUP - creates the Saved Sets plugin options form (Dashboard > Settings > Saved Sets)
function ss_admin_actions() {  
	add_options_page("Saved Sets", "Saved Sets", "edit_published_posts", "ss_options", "ss_admin");//built-in WP function defining attributes of the plugin options form. 
}

//PLUGIN SETUP - includes the file that defines the plugin options form (Dashboard > Settings > Saved Sets)	
function ss_admin() {  
	include('saved-sets-admin.php');  
}

//PLUGIN SETTINGS - built-in WP functions save settings defined on plugin options form (Dashboard > Settings > Saved Sets)
function saved_sets_register_settings() {
	register_setting(
		'SavedSets_settings_group', 'individual_set_listing_page');
	register_setting(
		'SavedSets_settings_group', 'all_sets_listing_page');
		 
}

//PLUGIN SETUP - built-in WP functions install the Saved Sets plugin
function install_ss() {
	include_once( ABSPATH . 'wp-admin/includes/plugin.php' );
	register_widget("saved_sets_widget");
}

//PLUGIN SETUP - built-in WP functions load the JS files used by this plugin
function saved_sets_scripts() {
	wp_enqueue_script( 'savedsets-functions', plugins_url() . '/saved-sets/lib/functions.js', array(), '1.0.0', true );
	wp_enqueue_script( 'savedsets-list-sets-by-user', plugins_url() . '/saved-sets/lib/list-sets-by-user.js', array(), '1.0.0', true );
}


//PLUGIN SETUP - create database to store saved set info independently of user/post
function ss_install() {
	global $wpdb;
	global $ss_db_version;
	
	$table_name = $wpdb->prefix . 'savedsets';
	$resources_table = $wpdb->prefix . 'savedsets_resources';
	
	$charset_collate = $wpdb->get_charset_collate();

	$sql = "CREATE TABLE $table_name (
		id mediumint(9) NOT NULL AUTO_INCREMENT,
		user_id mediumint(9) NOT NULL,
		set_name tinytext NOT NULL,
		set_description text DEFAULT '' NOT NULL,
		set_public tinyint(1) DEFAULT 1 NOT NULL,
		set_deleted tinyint(1) DEFAULT 0 NOT NULL,
		set_created text DEFAULT '' NOT NULL,
		UNIQUE KEY id (id)
	) $charset_collate;";
	
	$sqlResources = "CREATE TABLE $resources_table (
		id mediumint(9) NOT NULL AUTO_INCREMENT,
		set_id mediumint(9) NOT NULL,
		resource_id mediumint(9) NOT NULL,
		resource_order mediumint(9) NOT NULL,
		UNIQUE KEY id (id)
	) $charset_collate;";

	require_once( ABSPATH . 'wp-admin/includes/upgrade.php' );
	dbDelta( $sql );
	dbDelta($sqlResources);

	add_option( 'ss_db_version', $ss_db_version );
	
}

//PLUGIN SETUP - remove database table on plugin deactivation
function ss_remove_database() {
     global $wpdb;
     $table_name = $wpdb->prefix . 'savedsets';
	 $resources_table = $wpdb->prefix . 'savedsets_resources';
     $sql = "DROP TABLE IF EXISTS $table_name;";
     $wpdb->query($sql);
	 $sqlR = "DROP TABLE IF EXISTS $resources_table;";
     $wpdb->query($sqlR);
	 delete_option( 'ss_db_version');
}    

//PLUGIN SETUP - LIKELY NOT NEEDED (if removed, delete appropriate register_activation_hook below) create database to store saved set info independently of user/post
function ss_install_data() {
	$welcome_name = 'Mr. WordPress';
	$welcome_text = 'Congratulations, you just completed the installation!';
	
}

//PLUGIN SETUP - built-in WP hooks to create database on plugin activation, remove on deactivation
register_activation_hook( __FILE__, 'ss_install' );
register_activation_hook( __FILE__, 'ss_install_data' );
register_deactivation_hook( __FILE__, 'ss_remove_database' );


/*
Create a saved set for this user
$name = set name (string)
$firstResource = the ID of the first learning resource to add to the set, ID = 0 if no resource specified (int)
$public = set's visibility - public or private (int - 1 or 0)
$desc = set description, empty by default (string)
returns a message to display for the user
*/
function create_saved_set($name, $firstResource, $public, $desc='') {
	$msg = '';//stores message to show user once set is saved
	$current_user = wp_get_current_user();//get the currently logged in user
	//if the set name is empty, do not save
	if (strlen(trim($name)) == 0) {
		$msg = "<p>Set name cannot be blank!</p>";
		return $msg;	
	}
	$newid = save_to_db($current_user->ID,$name,$public,$desc);//attempt to save the set to the plugin database and get the database row ID of the new set
	if (is_numeric($newid)) { //save was successful
		if ($firstResource >= 0) { //if there is a learning resource to add to the set...
			//save the resource to the database resource table
			save_resource_to_db($newid, $firstResource);	
		}
		$msg = "<p>Resource saved to new set, " . $name . "!</p>";
	} else { //save was unsuccessful, return the error message for the user
		//error
		$msg = $newid;
	}
	return $msg;
}

/*
Saves a new set to the Wordpress database
$user = Wordpress ID of the current user
$name = name of the set to save
$public = the set's public/private status
$desc = the set description (optional)
returns the database ID of the new set on success, or an error message on failure
*/
function save_to_db($user,$name,$public, $desc = '') {
	global $wpdb;
	define( 'DIEONDBERROR', true );
	$wpdb->show_errors();
	$table_name = $wpdb->prefix . 'savedsets';
	if ($wpdb->insert( 
		$table_name, 
		array( 
			'set_created' => date('Y-m-d h:i:s'),
			'user_id' => $user, 
			'set_name' => $name,
			'set_description' => $desc,
			'set_public' => $public,
			'set_deleted' => 0
		),
		array('%s','%d','%s','%s','%d','%d' )
	)) {
		$newID = -1;
		$result = $wpdb->get_results ( "
				SELECT id 
				FROM  $table_name
				WHERE user_id = ". $user ." AND set_name = '". $name ."' AND set_description = '" .$desc. "' LIMIT 1"
			);
			foreach ($result as $page) 
				$newID = $page->id;
		return $newID;//should return id of new row
	}
	else {
		echo $wpdb->print_error();
		echo $wpdb->last_query;
		return "error :(<br/>";
	}
}

/*
Saves a learning resource to an existing set in the database
$set = the database ID of the set
$resource = the learning resource ID
returns a message to be displayed to the user
*/
function save_resource_to_db($set, $resource) {
	global $wpdb;
	define( 'DIEONDBERROR', true );
	$wpdb->show_errors();
	$table_name = $wpdb->prefix . 'savedsets_resources';
	$result = $wpdb->get_results ( "
				SELECT * 
				FROM  $table_name
				WHERE id = ". $set
			);
	$rows = $wpdb->num_rows;	
	if ($wpdb->insert( 
		$table_name, 
		array( 
			'set_id' => $set, 
			'resource_id' => $resource,
			'resource_order' => $rows
		),
		array('%d','%d','%d' )
	)) {
		return "<p>Resource saved to set!</p>";
	} else return "<p>Could not save resource to set!</p>";
}

/*
For a given learning resource, returns all sets that the resource belongs to that are owned by the current logged in user as well as public sets owned by other users
$resource = the learning resource id
returns an array of sets (set ID, owner ID, and set name)
*/
function get_public_sets($resource) {
	global $wpdb;
	$table_name = $wpdb->prefix . 'savedsets';
	$resource_table = $wpdb->prefix . 'savedsets_resources';
	$ret = '';
	$current_user = wp_get_current_user();
	$sets = array();
	//get all set ids containing resource
	$sets_with_resource = $wpdb->get_results ( "
				SELECT set_id 
				FROM  $resource_table
				WHERE resource_id = ". $resource
			);
	foreach ($sets_with_resource as $to_check) {
		$result = $wpdb->get_results ( "
				SELECT * 
				FROM  $table_name
				WHERE id = ". $to_check->set_id . " LIMIT 1"
			);
		foreach ($result as $row) {
			if ($row->user_id == $current_user->ID || $row->set_public == 1)
				$sets[] = array("setID"=>$row->id, "userID"=>$row->user_id, "setName"=>$row->set_name);
		}
	}
	return $sets;
	
}

/*
Returns all sets belonging to the current user that DON'T contain a given resource (i.e. sets that this resource can be added to)
$resource = the learning resource id
returns an array of sets (set ID, owner ID, and set name)
*/
function get_current_user_sets_without_resource($resource) {
	$sets = array();
	$current_user = wp_get_current_user();
	global $wpdb;
	$table_name = $wpdb->prefix . 'savedsets';
	$resource_table = $wpdb->prefix . 'savedsets_resources';
	//get all sets by this user from db
	$all_sets = $wpdb->get_results ( "
			SELECT id, set_name 
			FROM  $table_name
			WHERE user_id = ". $current_user->ID
		);
	foreach ($all_sets as $set) {
		$results = $wpdb->get_results ( "
				SELECT id 
				FROM  $resource_table
				WHERE resource_id = ". $resource . " AND set_id =" . $set->id
			);
		if ($wpdb->num_rows == 0) //resource not in this set
			$sets[] = array("id"=>$set->id, "name"=>$set->set_name);
	}
	return $sets;	
}

/*
Displays an individual set when the list_set_resources_target shortcode is used in the WP page editor
Also carries out actions based on the create/edit set widget
*/
function list_resources_target() {
	$set = -1;
	$removePost = -1;
	if (isset($_GET["set"])) //Checks for a set ID (needed in order to display the set info)
		$set = intval($_GET["set"]);
	if (isset($_GET["remove"])) //Widget action - remove a learning resource from the set?
		$removePost = intval($_GET["remove"]);
	if (isset($_GET["sharing"])) //Widget action - change this set's public/private status?
		update_set_sharing($set, $_GET["sharing"]);
	if (isset($_GET["set-desc-content"])) //Widget action - change the set description? 
		update_set_desc($set, $_GET["set-desc-content"]);
	if (isset($_GET["updateSetName"])) //Widget action - change the set name?
		update_set_name($set, $_GET["updateSetName"]);
	if (isset($_GET["delete"])) { //Widget action - delete the set?
		echo '<p>Deleting set...</p>';
		delete_set_db($_GET["delete"]);
	}
	else { //If the set is not being deleted, the following code displays the set
		$setInfo = get_saved_set_by_id($set);
		$resources = get_resources_for_set($set);
		$rCt = 'resources';
		$setNum = count($resources);
		//Display singular/plural text depending on how many resources are in the set
		if ($removePost > -1)
			$setNum--;
		if ($setNum == 1)
			$rCt = 'resource';
		$h = '<div id="list-set-resources-target">';
		$h .= '<h2 class="individual-set-heading">Learning Resources in Saved Set: <span class="set-info">'. $setInfo["name"] . ' (' . $setNum . ' ' . $rCt . ')</span></h2>';
		
		//If user is logged in, show public/private toggle, delete, and edit options
		$current_user = wp_get_current_user();
		if ($current_user->ID == $setInfo["user_id"]) {
			$h .= '<form id="set-sharing">';
			$h .= '<input type="hidden" name="set" value="'.$set.'"/>';
			$h .= '<div class="set-intro">';
			$h .= '<div class="set-links" style="float:right;"><a href="javascript:deleteSet(' . $set . ');">Delete Set</a><br/><a href="javascript:editDesc(' . $set . ');">Edit Description</a><br/><a href="javascript:editName(' . $set . ');">Edit Name</a></div>';
			$public = (isset($_GET["sharing"])) ? $_GET["sharing"]:$setInfo["public"];
			if ($public == 1 || $public == 'public')
				$h .= '<input type="radio" name="sharing" value="public" checked> Public (anyone can view)</input> <input type="radio" name="sharing" value="private"> Private (only I can see)</input>';
			else $h .= '<input type="radio" name="sharing" value="public"> Public (anyone can view)</input> <input type="radio" name="sharing" value="private" checked> Private (only I can see)</input>';
			//Get set description
			if (isset($_GET["edit"]))
				$h .= '<div id="set-description"><textarea name="set-desc-content" id="set-desc-content">' . $setInfo["description"] . '</textarea></div>';
			else $h .= '<div id="set-description">' . $setInfo["description"] . '</div>';
			if (isset($_GET["edit_name"]))
				$h.= '<div id="set-name"><input id="updateSetName" name="updateSetName" type="text" placeholder="Enter a new name" /></div>';
			$h .= '</div>';
		}
		//list the resources in the set
		foreach ($resources as $r) {
			if ($r->resource_id != $removePost) {
				$h .= '<div class="resources-in-set">';
				$p = get_post($r->resource_id);
				$h .= '<h2><a href="' . get_permalink($r->resource_id). '">' . $p->post_title . '</a></h2>';
				$h .= wp_trim_words($p->post_content, 25, '[...]');
				//if the set belongs to the current user, show the remove link
				if ($current_user->ID == $setInfo["user_id"]) {
					$h .= '<p><a href="'. get_page_url() . '?set=' . $set . '&remove='. $r->resource_id . '">Remove from set</a></p>';
				}
				$h .= '</div>';
			} else {
				remove_from_set($set, $r->resource_id);
			}
		}
		$h .= '</div>';
		if ($current_user->ID == $setInfo["user_id"]) {
			$h .= '<input type="submit" id="updateSet" value="Update Set"/>';
			$h .= '</form>';
		}
		return $h;	
	}
}

/*
Gets saved set by ID
Returns an object containing the set name, the owner ID, the set description, and its public/private status
*/
function get_saved_set_by_id($id) {
	global $wpdb;
	$table_name = $wpdb->prefix . 'savedsets';
	
	
	$result = $wpdb->get_results ( "
		SELECT * 
		FROM  $table_name
		WHERE id = " . $id . " AND set_deleted = 0
	" );
	
	$ret = array();
	$current_user = wp_get_current_user();
	foreach ( $result as $page )
	{
		$ret["name"] = $page->set_name;
		$ret["user_id"] = $page->user_id;
		$ret["description"] = $page->set_description;
		$ret["public"] = $page->set_public;
	}
	return $ret;
}

/*
Gets all of the learning resources in a given set
$id = the set ID
Returns a list of resource IDs
*/
function get_resources_for_set($id) {
	global $wpdb;
	$resource_table = $wpdb->prefix . 'savedsets_resources';
	$resources = $wpdb->get_results ( "
				SELECT resource_id 
				FROM  $resource_table
				WHERE set_id =" . $id
			);
	return $resources;
}

/*
Deletes a set from the database
$set = ID of the set to delete
*/
function delete_set_db($set) {
	global $wpdb;
	$table_name = $wpdb->prefix . 'savedsets';
	$resource_table = $wpdb->prefix . 'savedsets_resources';
	$setInfo = get_saved_set_by_id($set);
	
	$wpdb->delete( $table_name, array( 'id' => $set ), array( '%d' ) );
	$wpdb->delete( $resource_table, array( 'set_id' => $set ), array( '%d' ) );
	
	header( "Location: " . esc_attr(get_option('all_sets_listing_page')));
}

/*
Removes a learning resource from a set
$setID = ID of the saved set
$resource = ID of the learning resource to remove
*/
function remove_from_set($setID, $resource) {
	global $wpdb;
	$resource_table = $wpdb->prefix . 'savedsets_resources';
	
	$wpdb->delete( $resource_table, array( 'set_id' => $setID, 'resource_id' => $resource ), array( '%d','%d' ) );
	
}

/*
Updates the description of a saved set
$set = the set ID
$desc = the new description for the set
*/
function update_set_desc($set, $desc) {
	global $wpdb;
	$table_name = $wpdb->prefix . 'savedsets';
	$wpdb->update($table_name, array('set_description' => $desc), array('id' => $set));	
}

/*
Updates the name of a saved set
$set = the set ID
$name = the new name for the set
*/
function update_set_name($set, $name) {
	global $wpdb;
	$table_name = $wpdb->prefix . 'savedsets';
	$wpdb->update($table_name, array('set_name' => $name), array('id' => $set));	
}

/*
Updates the public/private status of a saved set
$set = the set ID
$share = the new public/private status of the set
*/
function update_set_sharing($set, $share) {
	global $wpdb;
	$table_name = $wpdb->prefix . 'savedsets';
	if ($share == 'private')
		$wpdb->update($table_name, array('set_public' => 0), array('id' => $set));	
	else $wpdb->update($table_name, array('set_public' => 1), array('id' => $set));
			
}

/*
Displays the dropdown menu that allows a user to select a saved set to display, logged in users can also choose to duplicate the currently displayed set.
This function is called with the list_set_resources_form shortcode
*/
function list_resources_form() {
	$set = -1;
	$msg = '';
	if (isset($_GET["set"]))
		$set = intval($_GET["set"]);
	//If user is duplicating an existing set...
	if (isset($_GET["duplicateSetName"])) {
		//Proceed with duplication if a name has been provided for the duplicate, otherwise prompts user to enter a name
		if ($_GET["duplicateSetName"] != '') {
			echo "copying set " . $set;
			$public = (isset($_GET["public"])) ? 1:0;
			$ret = copy_set($set, $public, $_GET["duplicateSetName"]);
			echo " to " . $ret;
			if (is_numeric($ret)) {
				header( "Location: " . get_page_url() . "?set=" . $ret);
			} 
			else $msg = $ret;
			//return;
		} else $msg = '<p>Please enter a name for your new set!</p>';
	}
		
	$h = '<div class="widget-text wp_widget_plugin_box">';
	$h .= '<form id="selectSetForm">';
	$h .= '<label for="selectSet">List Resources in Saved Set</label>';
	$h .= '<select id="selectSet" name="selectSet" onchange="showSet();">';
	if ($set == -1)
		$h .= '<option selected disabled>- Select a Set -</option>';
	//get all public sets
	$h .= get_global_saved_sets(false);	
	$h .= '</select>';
	$h .= '</form>';
	//Show the duplication option if the user is logged in
	if (is_user_logged_in()) {
		$h .= '<form id="duplicateSet">';
		$h .= '<label for="duplicateSetName">Save as New Set</label>';
		$h .= '<input type="hidden" name="set" value="' . $set . '">';
		$h .= $msg;
		$h .= '<input type="text" name="duplicateSetName" value="" id="duplicateSetName" placeholder="Enter new set name"/>';
		$h .= '<input id="public" name="public" type="checkbox" checked="checked" value="public">&nbsp;Set is public  <input type="submit" id="addDuplicateSet" value="Save New Set"/>';
		$h .= '</form>';
	}
	$h .= '</div>';
	return $h;
}


/*
Creates a copy of an existing set
$origSet = ID of set to copy
$public = public/private status of new set
$name = name for set
*/
function copy_set($origSet, $public, $name) {
	//get all resources in original set
	$setInfo = get_saved_set_by_id($origSet);
	$resources = get_resources_for_set($origSet);
	
	//create a new set with the new name/public settings
	$current_user = wp_get_current_user();
	$newID = save_to_db($current_user->ID,$name,$public, $setInfo["description"]); 
	
	//copy resources from the original set to the new set
	foreach ($resources as $r) {
		save_resource_to_db($newID, $r->resource_id);
	}
	//go to set listing page for new set
	header( "Location: " . get_page_url() . "?set=" . $newID);
}

/*
Displays the dropdown menu that allows users to list sets created by a particular user (or all users)
If the current user is logged in, a form to create a new set is also displayed (or processed if applicable)
*/
function list_sets_form($atts) {
	global $wpdb;
	//Process the create new set form, if applicable
	if (isset($_POST["newSetName"])) {
		$public = (isset($_POST["public"])) ? 1:0;
		$desc = (isset($_POST["newSetDesc"])) ? $_POST["newSetDesc"]:'';
		$saveMsg = create_saved_set($_POST["newSetName"], -1, $public, $desc);
	}
	//Create the user selector
	$h = '';
	$h .= '<div class="widget-text wp_widget_plugin_box">';
	$h .= '<form id="allSavedSetsWidget">';
	$h .= '<label for="selectUser">List Sets Saved By</label>';
	$h .= '<select id="selectUser" name="selectUser" onchange="selectUsersWithSets();">';
	$h .= '<option selected disabled>- Select a User -</option>';
	$h .= '<option selected value="0">All users</option>';
	$blogusers = $wpdb->get_results("SELECT ID, display_name FROM $wpdb->users");//Get all registered users
	//Only add users who have saved sets to the dropdown
	foreach ( $blogusers as $user ) {
		if (has_saved_sets($user->ID))
			$h .= '<option value="'.$user->ID.'">' . esc_html( $user->display_name ) . '</option>';
	}
	wp_localize_script( 'sr-functions', 'target_div', $a );
	$h .= '</select>';
	$h .= '</form>';
	//New set form for logged in users
	if (is_user_logged_in()) {
		$h .= '<form method="post" id="newSetForm">';
		$h .= '<label for="newSetName">'. "Create a New Saved Set" .'</label>';
		$h .= '<input type="text" name="newSetName" value="" id="newSetName" placeholder="Enter new set name" required/>';
		$h .= '<textarea name="newSetDesc" id="newSetDesc" placeholder="Enter new set description"></textarea>';
		$h .= '<input id="public" name="public" type="checkbox" checked="checked" value="public">&nbsp;Set is public  <input type="submit" id="addNewSet" value="Create New Set"/>';
		$h .= '</form>';
	}
	$h .= '</div>';
	
	return $h;
}

/*
Checks if a specified user is the current user OR is not the current user but has public saved sets
$user_id = the user to lookup
Returns true if 
*/
function has_saved_sets($user_id) {
	$current_user = wp_get_current_user();
	global $wpdb;
	$table_name = $wpdb->prefix . 'savedsets';
	
	if ($user_id == $current_user->ID) { //If the requested user is the current user, get all their sets regardless of public/private status
		$mysets = $wpdb->get_results ( "
			SELECT id 
			FROM  $table_name
			WHERE user_id = " . $user_id  );
		if ($wpdb->num_rows > 0)
			return true;
		else return false;
	} else { //If the requested user is not the current user, get their public sets only
		$othersets = $wpdb->get_results ( "
			SELECT id 
			FROM  $table_name
			WHERE user_id = " . $user_id . " AND set_public = 1"  );
		if ($wpdb->num_rows > 0)
			return true;
		else return false;
	}
	return false;

}



/*
Creates the target <div></div> for the list sets form
*/
function list_sets_target() {
	return '<div id="list-sets-target">'.get_global_saved_sets().'</div>';
}


/*
Get the current page url without any GET variables
*/
function get_page_url() {
	$uri_parts = explode('?', $_SERVER['REQUEST_URI'], 2);
	return $uri_parts[0];
		
}

/*
List all saved sets (public only for sets belonging to other users)
*/
function get_global_saved_sets($listSets = true) {
	global $wpdb;
	$table_name = $wpdb->prefix . 'savedsets';
	
	
	$result = $wpdb->get_results ( "
		SELECT * 
		FROM  $table_name
	" );
	
	$ret = '';
	$current_user = wp_get_current_user();
	$set = -1;
	if (isset($_GET["set"]))
		$set = intval($_GET["set"]);
	foreach ( $result as $page )
	{
	  if ($page->user_id == $current_user->ID || $page->set_public == 1) {
		$author = get_user_by('id', $page->user_id);
		
		if ($listSets) {//creates block on set listing page
			$user_class = 'user-'.$page->user_id;
			$created = DateTime::createFromFormat('Y-m-d h:i:s', $page->set_created);
			$block = '<div class="saved-set-listing ' . $user_class . '">';
			$block .= '<h2 class="set-title"><a href="'. esc_attr(get_option('individual_set_listing_page')) . '?set=' . $page->id .'">'.$page->set_name .'</a></h2>';
			$block .= '<p class="set-date">Created: ' . $created->format('n/j/Y') . '</p>';
			$block .= '<p class="set-description">' . $page->set_description . '</p>';
			$block .= '<p class="set-creator">Set Creator: <a href="javascript:showSetsByUser(\''. $page->user_id .'\')">' . $author->display_name . '</a></p>';//get owner's username and make it a link
			$block .= '</div>';
			$ret = $block . $ret;
		} else {//create dropdown on individual set page
			if ($set == $page->id)
				$ret .= '<option selected value="' . $set . '">' . $page->set_name. ' by ' . $author->display_name . '</option>';
			else $ret .= '<option value="' . $page->id . '">' . $page->set_name. ' by ' . $author->display_name . '</option>';
			
		}
	  }
	}
	return $ret;
}

/*
Obsolete? Possibly a test function
*/
function check_db_rows() {
	
	
	global $wpdb;
	$table_name = $wpdb->prefix . 'savedsets';
	
	
	$result = $wpdb->get_results ( "
		SELECT * 
		FROM  $table_name
	" );
	
	foreach ( $result as $page )
	{
	  echo $page->id.', user='.$page->user_id.', set='.$page->user_set.'<br/>';
	}
	
	
}

include('saved-sets-widget.php');

?>