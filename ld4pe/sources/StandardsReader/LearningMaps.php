<?php

//add the shortcodes used for learning maps
add_shortcode( 'map_builder', 'create_map_builder');//shortcode for learning map builder
add_shortcode( 'list_learning_maps_form', 'list_maps_form');//
add_shortcode( 'list_learning_maps_target', 'list_maps_target');

//MAP BUILDER - create/process the map builder form
function create_map_builder() {
	//If map is public || private && current user
	$current_user = wp_get_current_user();
	wp_localize_script( 'sr-functions', 'sr_target_div', $a );
	//map name
	$name = (isset($_POST["mapName"]) && $_POST["mapName"] != '') ? $_POST["mapName"]:$_POST["current_name"];
	$owner = -1;
	if (isset($_POST["newMapName"]) && $_POST["newMapName"] != '')
		$name = $_POST["newMapName"];
	
	$id = - 1;
	//map id 
	if (isset($_GET["map_id"]))
		$id = $_GET["map_id"];
	else if (isset($_POST["map_id"]))
		$id = $_POST["map_id"];
	//default - new map
	$desc = '';
	$comps = array();//stores associated competencies
	$public = 1;
	$map = get_from_db($id);//retrieve the map from the database
	//map description
	if (isset($_POST["set-desc-content"]))
		$desc = $_POST["set-desc-content"];
	else $desc = $map->set_description;
	//associated competencies
	if (isset($_POST["competencies"]))
		$comps = $_POST["competencies"];
	else $comps = get_map_terms($id);
	//public/private setting
	if (isset($_POST["sharing"])) 
		$public = $_POST["sharing"];
	else $public = intval($map->set_public);
	$form = '';
	$update = (isset($_POST["current_name"]) && (!isset($_POST["newMapName"]) || $_POST["newMapName"] == '')) ? true:false;//determine if update to existing map
	if (isset($_POST["saveMe"]) && $_POST["saveMe"] || (isset($_POST["mapName"]) && !isset($_POST["edit_name"]))) {
		//save new map to db
		if (!$update || !isset($_POST["newMapName"]) || $_POST["newMapName"] == '')
			$id = save_map_to_db($id,$name,$desc,$comps, $public, $update);//except if contains error
		//update existing map
		else save_map_to_db($id,$name,$desc,$comps, $public, $update);
		$owner = $current_user->ID;
		//save map or display error
		if (strpos($id, "Error") !== false) {
			$form .= '<p class="db-error">' .$id.'</p>';
			$id = -1;	
		} else {
			if (isset($_POST["saveMe"]))
				$form .= '<p class="db-result">Learning map saved!</p>';
			else if (isset($_POST["mapName"]))
				$form .= '<p class="db-result">Learning map created!</p>';
		}
	} 
	//delete map
	else if (isset($_GET["delete"])) {
		delete_map_db($_GET["delete"]);
	} 
	//if make it this far, display the selected map
	else if (isset($_GET["map_id"]) || isset($_POST["map_id"])) {
		$map = get_from_db($id);
		$owner = $map->user_id;
		$name = $map->set_name != "" ? $map->set_name:"(no name)";
		$desc = $map->set_description;
		$public = intval($map->set_public);
		$comps = get_map_terms($id);
	}
	//Build the map display if it's a public map or any map belonging to current user
	if ($public == 1 || $current_user->ID == $owner) {
		$ci ='';
		$cDisplay = '';
		foreach ($comps as $c) {
			$ci .= '<option value="' .$c. '" selected="selected"></option>';
			$term = get_term_by('slug', $c, 'asn_index');
			$link = get_term_link($term, 'asn_index');
			$cDisplay .= '<div class="mapContent" id="comp-' . $c . '">';
			if ($current_user->ID == $owner)
				$cDisplay .= '<div class="term-order-controls"><div class="arrow arrow-up" id="up-' .$c.'"></div><div class="arrow arrow-down" id="down-' .$c.'"></div></div>';
			$cDisplay .= '<h2>' . $term->name . '</h2><a target="_blank" href="' . esc_url($link) .'">'. get_resource_count($term) . ' resources</a>';
			if ($current_user->ID == $owner)
				$cDisplay .= ' | <a href="javascript:removeComp(\''.$c.'\')">Remove from learning map</a>';
			$cDisplay .= '</div>';
		}
		
		$form .= '<div id="map-builder-main"><h2 class="map-builder-heading">Learning Map: <span id="mapNameHeading">' . stripslashes_deep($name) . '</span></h2>' . do_shortcode('[expand title="What\'s This?"]
	Authenticated users can assemble nodes from the Competency Index into Learning Maps, which represent logical sequences of competencies for use in defining formal curriculum structures or as personalized pathways created by instructors or learners as records of progress.
	[/expand]') 
		.'<div class="set-intro">';
		
		if ($current_user->ID == $owner) {
			$form .='<div class="set-links" style="float:right;"><a href="javascript:deleteMap(' . $id . ');">Delete Map</a><br/><a href="javascript:editMapDesc(' . $id . ');">Edit Description</a><br/><a href="javascript:editMapName(' . $id . ');">Edit Name</a></div>';//Close .set-links
		}
		
		if ($current_user->ID == $owner) {
			$form .='<form method="post" id="mapUpdate">';//open form
			if ($public == 1)
				$form .= '<input type="radio" name="sharing" value="1" checked> Public (anyone can view)</input> <input type="radio" name="sharing" value="0"> Private (only I can see)</input>';
			else $form .= '<input type="radio" name="sharing" value="1"> Public (anyone can view)</input> <input type="radio" name="sharing" value="0" checked> Private (only I can see)</input>';
		}
		//Get set description
		if (isset($_GET["edit"]) && $current_user->ID == $owner && !isset($_POST["set-desc-content"]))
			$form .= '<div id="set-description"><textarea name="set-desc-content" id="set-desc-content">' . stripslashes_deep($desc) . '</textarea></div>';
		else $form .= '<div id="set-description">' . stripslashes_deep($desc) . '</div>';
		if (isset($_GET["edit_name"]) && $current_user->ID == $owner && !isset($_POST["mapName"]))
			$form .= '<div id="set-name"><input id="mapName" name="mapName" type="text" placeholder="Enter a new name" /></div>';
		$form .= '<div id="map-sequence">' . $cDisplay . '</div>';
		if ($current_user->ID == $owner) {
			$form .= '<input id="saveMapBottom" class="saveMap" value="Save" type="submit"/><input id="newMapName" name="newMapName" type="text" placeholder="Save a copy as a new map" />'
			. '<select multiple name="competencies[]" id="competencies" style="display:none;">'
			. $ci
			.'</select>'
			.'<input type="hidden" id="map_id" name="map_id" value="'.$id.'"/>'//if this is an existing map, store the id here
			.'<input type="hidden" id="current_name" name="current_name" value="'.$name.'"/>'
			.'<input type="hidden" id="saveMe" name="saveMe" value="true" />'
			.'</form>';
		} else if ($current_user->ID > 0) {
			$form .='<form method="post" id="mapUpdate">';
			$form .= '<input id="saveMapBottom" class="saveMap" value="Save" type="submit"/><input id="newMapName" name="newMapName" type="text" placeholder="Save a copy as a new map" />'
			. '<select multiple name="competencies[]" id="competencies" style="display:none;">'
			. $ci
			.'</select>'
			.'<input type="hidden" id="map_id" name="map_id" value="'.$id.'"/>'//if this is an existing map, store the id here
			.'<input type="hidden" id="current_name" name="current_name" value="'.$name.'"/>'
			.'<input type="hidden" id="saveMe" name="saveMe" value="true" />'
			.'</form>';
		}
		$form .= '</div>';
		
		return $form;
	} else  {
		header( "Location: " . esc_attr(get_option('mapListing')));
	}
}

/*
retrieve map from database
$id = map ID
*/
function get_from_db($id) {
	global $wpdb;
	$main_table_name = $wpdb->prefix . 'standardsreader_maps';
	$names = $wpdb->get_results ( "
				SELECT * 
				FROM  $main_table_name
				WHERE id = ". $id
			);
	foreach ($names as $n)
		return $n;
	return 0;
}

/*
get the competencies belonging to a given map
$id = map ID
*/
function get_map_terms($id) {
	global $wpdb;
	$competency_table = $wpdb->prefix . 'standardsreader_map_comps';
	$maps = $wpdb->get_results ( "
				SELECT * 
				FROM  $competency_table
				WHERE map_id = ". $id
			);
	$comps = array();
	foreach ($maps as $m) {
		$comps[intval($m->order_comps)] = $m->comp_slug;
	}
	return $comps;
}

/*
get the name of a given map
$id = map ID
*/
function get_map_name($id) {
	global $wpdb;
	$main_table_name = $wpdb->prefix . 'standardsreader_maps';
	$names = $wpdb->get_results ( "
				SELECT set_name 
				FROM  $main_table_name
				WHERE id = ". $id
			);
	foreach ($names as $n)
		return $n->set_name;
	return '(No name)';
}

/*
save/update a map in the database
$id = map ID
$name = map name
$desc = map desc
$comps = associated competencies
$public = public/private status
$update = is/is not an update to an existing map
*/
function save_map_to_db($id, $name, $desc, $comps, $public, $update = false) {
	global $wpdb;
	define( 'DIEONDBERROR', true );
	$wpdb->show_errors();
	$main_table_name = $wpdb->prefix . 'standardsreader_maps';
	$competency_table = $wpdb->prefix . 'standardsreader_map_comps';
	
	$current_user = wp_get_current_user();
	
	//if appears to be new map, check name is unique among this user's maps
	if (!$update) {
		if (!is_unique($current_user->ID, $name)) {
			//User already has a map with this name so increment until find a unique name
			$r = 1;
			while (!is_unique($current_user->ID, $name . "(" . $r . ")"))
				$r++;
			$name = $name . "(" . $r . ")";
		}
		//add to database if name is not empty
		if ($name != '' && $name != undefined) {
			if ($wpdb->insert($main_table_name,
				array('user_id' => $current_user->ID,'set_name' => $name,'set_description' => $desc, 'set_public' => $public, 'set_created' => date('Y-m-d h:i:s')
				), array('%d','%s','%s','%d','%s'))) {
				//get the new map id
				$result = $wpdb->get_results ( "
					SELECT id 
					FROM  $main_table_name
					WHERE user_id = ". $current_user->ID ." AND set_name = '". $name ."' AND set_description = '" .$desc. "' LIMIT 1"
				);
				foreach ($result as $page) 
					$id = intval($page->id);
			} else return "<p class='db-error'>Error! Unable to save this map! " . $wpdb->print_error() . "</p>";
		} else return "<p class='db-error'>Unable to create map! Learning map name is required and must be unique!</p>";
	} else {
		$id = intval($id);
		//update existing values if needed
		//if name has been changed, check it is unique for this user
		$name_check = get_map_name($id);
		if ($name_check != $name && !is_unique($current_user->ID, $name)) {
			$r = 1;
			while (!is_unique($current_user->ID, $name . "(" . $r . ")"))
				$r++;
			$name = $name . "(" . $r . ")";
		}
		if ($name != '' && $name != undefined) {
			$wpdb->update( 
				$main_table_name, 
				array('set_name' => $name,'set_description' => $desc, 'set_public' => $public), 
				array( 'id' => $id ), 
				array( '%s','%s','%d'), 
				array( '%d' ) 
			);
		} else return "<p class='db-error'>Unable to update this map! Learning map name is required and must be unique!</p>";
	}
	//delete existing competencies for map and save new ones
	$wpdb->delete( $competency_table, array( 'map_id' => $id ), array( '%d' ) );
	for ($c = 0; $c < count($comps); $c++) {
		$wpdb->insert($competency_table,
			array('map_id'=>$id, 'comp_slug'=>$comps[$c], 'order_comps'=>$c+1),
			array('%d','%s','%d'));	
	}
	
	return $id;
}

/*
Check if the map name is unique among this user's maps
$user_id = owner ID
$map_name = map name
*/
function is_unique($user_id, $map_name) {
	global $wpdb;
	$main_table_name = $wpdb->prefix . 'standardsreader_maps';
	
	$wpdb->get_results("SELECT id FROM $main_table_name WHERE user_id = ".$user_id." AND set_name = '" . $map_name . "'");
	if ($wpdb->num_rows == 0)
		return true;
	else return false;
}

/*
Get the number of resources associated with the selected competency
$term = competency
*/
function get_resource_count($term) {
	$args = array(
	  'post_type'     => 'learning_resource', //post type, I used 'product'
	  'post_status'   => 'publish', // just tried to find all published post
	  'posts_per_page' => -1,  //show all
	  'tax_query' => array(
		'relation' => 'AND',
		array(
		  'taxonomy' => 'asn_index', 
		  'field' => 'name',
		  'terms' => array( $term->name )
		)
	  )
	);

	$query = new WP_Query( $args );

	return (int)$query->post_count;	
}

/*
Learning maps listing page - show maps by user with selector
*/
function list_maps_form() {
	global $wpdb;
	//User dropdown selector
	$h = '';
	$h .= '<div class="widget-text wp_widget_plugin_box">';
	$h .= '<form id="allSavedSetsWidget">';
	$h .= '<label for="selectUser">List Learning Maps Created By</label>';
	$h .= '<select id="selectUser" name="selectUser" onchange="selectUsersWithMaps();">';
	$h .= '<option selected disabled>- Select a User -</option>';
	$h .= '<option selected value="0">All users</option>';
	$blogusers = $wpdb->get_results("SELECT ID, display_name FROM $wpdb->users");
	
	foreach ( $blogusers as $user ) {
		if (has_learning_maps($user->ID))
			$h .= '<option value="'.$user->ID.'">' . esc_html( $user->display_name ) . '</option>';
	}
	$h .= '</select>';
	$h .= '</form>';
	//New set form
	if (is_user_logged_in()) {
		$h .= '<form method="post" id="newSetForm" action="'. esc_attr(get_option('mapPage')).'">';
		$h .= '<label for="mapName">'. "Create a New Learning Map" .'</label>';
		$h .= '<input type="text" name="mapName" value="" id="mapName" placeholder="Enter new map name" required/>';
		$h .= '<textarea name="set-desc-content" id="set-desc-content" placeholder="Enter new map description"></textarea>';
		$h .= '<input type="submit" id="addNewMap" value="Create New Map"/>';
		$h .= '</form>';
	}
	$h .= '</div>';
	
	return $h;
}

//Display learning maps in the specified HTML element
function list_maps_target() {
	return '<div id="list-sets-target">'.get_global_learning_maps().'</div>';
}

//check if user is current user and has saved maps OR is not current user and has public saved maps
function has_learning_maps($user_id) {
	$current_user = wp_get_current_user();
	global $wpdb;
	$main_table_name = $wpdb->prefix . 'standardsreader_maps';
	
	if ($user_id == $current_user->ID) {
		//get number of sets - public or not
		$mysets = $wpdb->get_results ( "
			SELECT id 
			FROM  $main_table_name
			WHERE user_id = " . $user_id  );
		if ($wpdb->num_rows > 0)
			return true;
		else return false;
	} else {
		$othersets = $wpdb->get_results ( "
			SELECT id 
			FROM  $main_table_name
			WHERE user_id = " . $user_id . " AND set_public = 1"  );
		if ($wpdb->num_rows > 0)
			return true;
		else return false;
	}
	return false;

}

//MAP LISTING - get all public maps and all maps belonging to current user
function get_global_learning_maps() {
	global $wpdb;
	$main_table_name = $wpdb->prefix . 'standardsreader_maps';
	
	
	$result = $wpdb->get_results ( "
		SELECT * 
		FROM  $main_table_name
	" );
	
	$ret = '';
	$current_user = wp_get_current_user();
	$map = -1;
	if (isset($_GET["map_id"]))
		$map = intval($_GET["map_id"]);
	foreach ( $result as $page )
	{
	  if ($page->user_id == $current_user->ID || $page->set_public == 1) {
		$author = get_user_by('id', $page->user_id);
		$name = $page->set_name != "" ? $page->set_name:"(no name)";
		$user_class = 'user-'.$page->user_id;
		$created = DateTime::createFromFormat('Y-m-d h:i:s', $page->set_created);
		$block = '<div class="saved-set-listing ' . $user_class . '">';
		$block .= '<h2 class="set-title"><a href="'. esc_attr(get_option('mapPage')) . '?map_id=' . $page->id .'">'.stripslashes_deep($name) .'</a></h2>';
		$block .= '<p class="set-date">Created: ' . $created->format('n/j/Y') . '</p>';
		$block .= '<p class="set-description">' . stripslashes_deep($page->set_description) . '</p>';
		$block .= '<p class="set-creator">Set Creator: <a href="javascript:showMapsByUser(\''. $page->user_id .'\')">' . $author->display_name . '</a></p>';//get username and make it a link
		
		$block .= '</div>';
		$ret = $block . $ret;
	  }
	}
	return $ret;
}

//DELETE MAPIN DATABASE
function delete_map_db($map) {
	global $wpdb;
	$main_table_name = $wpdb->prefix . 'standardsreader_maps';
	$competency_table = $wpdb->prefix . 'standardsreader_map_comps';
	$setInfo = get_saved_set_by_id($set);
	
	$wpdb->delete( $main_table_name, array( 'id' => $map ), array( '%d' ) );
	$wpdb->delete( $competency_table, array( 'map_id' => $set ), array( '%d' ) );
	
	header( "Location: " . esc_attr(get_option('mapListing')));
}

?>