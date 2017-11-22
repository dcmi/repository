<?php
/*
Widget for creating saved sets
*/
class saved_sets_widget extends WP_Widget {

	// constructor
	function saved_sets_widget() {
		parent::WP_Widget(false, $name = __('Saved Sets Form', 'saved_sets_widget') );
	}

	// Creates the form that displays existing set info/enables creation of new set
	function form($instance) {	
		//If form has values (e.g. when editing or after save), get those values, otherwise set them to be blank
		if( $instance) {
			 $title = esc_attr($instance['title']);
			 $sub_title = esc_attr($instance['sub_title']);
			 $text = esc_attr($instance['text']);
			 $textarea = esc_textarea($instance['textarea']);
		} else {
			 $title = '';
			 $sub_title = '';
			 $text = '';
			 $textarea = '';
		}
		?>
		
		<p>
		<label for="<?php echo $this->get_field_id('title'); ?>"><?php _e('Widget Title', 'wp_widget_plugin'); ?></label>
		<input class="widefat" id="<?php echo $this->get_field_id('title'); ?>" name="<?php echo $this->get_field_name('title'); ?>" type="text" value="<?php echo $title; ?>" />
		</p>
        <p>
		<label for="<?php echo $this->get_field_id('sub_title'); ?>"><?php _e('Subtitle', 'wp_widget_plugin'); ?></label>
		<input class="widefat" id="<?php echo $this->get_field_id('sub_title'); ?>" name="<?php echo $this->get_field_name('sub_title'); ?>" type="text" value="<?php echo $sub_title; ?>" />
		</p>
		
		<p>
		<label for="<?php echo $this->get_field_id('text'); ?>"><?php _e('Description 1:', 'wp_widget_plugin'); ?></label>
		<input class="widefat" id="<?php echo $this->get_field_id('text'); ?>" name="<?php echo $this->get_field_name('text'); ?>" type="text" value="<?php echo $text; ?>" />
		</p>
		
		<p>
		<label for="<?php echo $this->get_field_id('textarea'); ?>"><?php _e('Description 2:', 'wp_widget_plugin'); ?></label>
		<textarea class="widefat" id="<?php echo $this->get_field_id('textarea'); ?>" name="<?php echo $this->get_field_name('textarea'); ?>"><?php echo $textarea; ?></textarea>
		</p> <?php
	}

	// Update the set based on form values
	function update($new_instance, $old_instance) {
		$instance = $old_instance;
		$instance['title'] = strip_tags($new_instance['title']);
		$instance['sub_title'] = $new_instance['sub_title'];
		$instance['text'] = strip_tags($new_instance['text']);
		$instance['textarea'] = strip_tags($new_instance['textarea']); 
		return $instance;
	}

	// Displays the widget on learning resource pages
	function widget($args, $instance) {
	   if (is_singular('learning_resource')) {
		   extract( $args );
		   // these are the widget options
		   $title = apply_filters('widget_title', $instance['title']);
		   $sub_title = $instance['sub_title'];
		   $text = $instance['text'];
		   $textarea = $instance['textarea'];
		   echo $before_widget;
		   // Display the widget
		   echo '<div class="widget-text wp_widget_plugin_box">';
			$in_sets = get_public_sets(get_the_id());
			// Check if title is set
		   if ( $title) {
			  echo $before_title . $title . $after_title;
		   }
		   
		   if ($sub_title && count($in_sets) > 0 ) {
				echo '<p class="wp_widget_plugin_text">'.$sub_title.'</p>';  
		   }
		   
			if (isset($_POST["newSetName"])) {
				$public = (isset($_POST["public"])) ? 1:0;
				$saveMsg = create_saved_set($_POST["newSetName"], get_the_id(), $public);
			}
			//Check if a resource needs to be saved to the set
		   if (isset($_POST["mySets"])) {
				$saveMsg = save_resource_to_db($_POST["mySets"],get_the_id());
		   }
		   
		   ?>
           <div id="publicSetList">
           <?php
			   if (count($in_sets) > 0 ) {
			   for ($s = 0; $s < count($in_sets); $s++) {
				   $user = get_user_by("id", $in_sets[$s]["userID"]);
				   ?> 
				   <a href="<?php echo esc_attr(get_option('individual_set_listing_page'));?>?set=<?php echo $in_sets[$s]["setID"] ?>"><?php echo $in_sets[$s]["setName"] . " (" . $user->display_name . ")" ; ?></a><br/>
				   <?php
		   }
		   } else {
			   ?>
               <p>None (<a href="<?php echo esc_attr(get_option('all_sets_listing_page'));?>">View saved sets</a>)</p>
               <?php
		   }
		   if ($textarea)
		   	echo do_shortcode($textarea);
		   
		   ?>
           </div>
           
           <?php
           
		   //Add resource to set functionality is reserved for authorized users
		   if (is_user_logged_in()) {
			   echo $saveMsg;
			   echo '<form method="post">';
			   echo '<label for="mySets">' . "Add Resource to Saved Set". '</label>';
			   $my_sets = get_current_user_sets_without_resource(get_the_id());
			   ?>
			   
			   
			   <select id="mySets" name="mySets" onchange="setSelected();">
			   <option selected disabled>- Save to Your Saved Set -</option>
			   <?php for ($m = 0; $m < count($my_sets); $m++) {
					?>
					<option value="<?php echo $my_sets[$m]["id"]; ?>"><?php echo $my_sets[$m]["name"]; ?></option>
					<?php   
			   }
			   ?>
			   <option value="create">Create a New Saved Set</option>
			   </select>
			   <input type="submit" id="addToSet" value="Add to Set"/>
			   </form>
			   
			   <form method="post" id="newSetForm" style="display:none;">
			   <?php echo '<label for="newSetName">'. "Create a New Saved Set" .'</label>'; ?>
			   <input type="text" name="newSetName" value="" id="newSetName" placeholder="Enter a new set name" required/>
			   <input id="public" name="public" type="checkbox" checked="checked" value="public">&nbsp;Set is public  <input type="submit" id="addNewSet" value="Create New Set"/>
			   </form>
			   <script src="<?php echo plugins_url() . '/saved-sets/lib/functions.js' ?>" />
			   <?php
		   }
		   echo '</div>';
		   echo $after_widget;
	   }
	}
}
?>