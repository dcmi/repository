<?php
/**
 * Creates the Browse by Competency widget
 */
class browse_index_widget extends WP_Widget {

	/**
	 * Register widget with WordPress.
	 */
	function browse_index_widget() {
		parent::WP_Widget(false, $name = __('Competency Browser', 'browse_index_widget') );
	}

	/**
	 * Front-end display of widget.
	 *
	 * @see WP_Widget::widget()
	 *
	 * @param array $args     Widget arguments.
	 * @param array $instance Saved values from database.
	 */
	public function widget( $args, $instance ) {
		echo $instance['title'];
		echo do_shortcode($instance['shortcode1']);
		echo do_shortcode($instance['shortcode2']);
		echo $instance['textarea'];
	}

	/**
	 * Back-end widget form.
	 *
	 * @see WP_Widget::form()
	 *
	 * @param array $instance Previously saved values from database.
	 */
	public function form( $instance ) {
		// Check values
		if( $instance) {
			$textarea = esc_textarea($instance['textarea']);
			$title = esc_textarea($instance['title']);
			$shortcode1 = esc_textarea($instance['shortcode1']);
			$shortcode2 = esc_textarea($instance['shortcode2']);
		} else {
			 $textarea = '';
			 $title = '';
			 $shortcode1 = '';
			 $shortcode2 = '';
		}
		?>
		<p>
		<label for="<?php echo $this->get_field_id('title'); ?>"><?php _e('Title', 'wp_widget_plugin'); ?></label>
		<input class="widefat" id="<?php echo $this->get_field_id('title'); ?>" name="<?php echo $this->get_field_name('title'); ?>" type="text" value="<?php echo $title; ?>" />
		</p>
        <p>
		<label for="<?php echo $this->get_field_id('shortcode1'); ?>"><?php _e('Description shortcode:', 'wp_widget_plugin'); ?></label>
		<input class="widefat" id="<?php echo $this->get_field_id('shortcode1'); ?>" name="<?php echo $this->get_field_name('shortcode1'); ?>" type="text" value="<?php echo $shortcode1; ?>" />
		</p>
        <p>
		<label for="<?php echo $this->get_field_id('shortcode2'); ?>"><?php _e('List competencies shortcode:', 'wp_widget_plugin'); ?></label>
		<input class="widefat" id="<?php echo $this->get_field_id('shortcode2'); ?>" name="<?php echo $this->get_field_name('shortcode2'); ?>" type="text" value="<?php echo $shortcode2; ?>" />
		</p>
		<p>
		<label for="<?php echo $this->get_field_id('textarea'); ?>"><?php _e('Additional content:', 'wp_widget_plugin'); ?></label>
		<textarea class="widefat" id="<?php echo $this->get_field_id('textarea'); ?>" name="<?php echo $this->get_field_name('textarea'); ?>"><?php echo $textarea; ?></textarea>
		</p> <?php
	}

	/**
	 * Sanitize widget form values as they are saved.
	 *
	 * @see WP_Widget::update()
	 *
	 * @param array $new_instance Values just sent to be saved.
	 * @param array $old_instance Previously saved values from database.
	 *
	 * @return array Updated safe values to be saved.
	 */
	public function update( $new_instance, $old_instance ) {
		$instance = $old_instance;
		$instance['title'] = $new_instance['title'];
		$instance['textarea'] = $new_instance['textarea']; 
		$instance['shortcode1'] = $new_instance['shortcode1'];
		$instance['shortcode2'] = $new_instance['shortcode2'];
		return $instance;
	}

}
?>