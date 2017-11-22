<?php
/*
Creates the settings form found in the site Dashboard under Settings > Saved Sets
*/
?>
<div class="wrap">
<?php
if (isset($_POST["saveSettings"])) {
	esc_attr(update_option('individual_set_listing_page', $_POST['individual'], true));
	esc_attr(update_option('all_sets_listing_page', $_POST['all-sets'], true));
	$individual = esc_attr(get_option('individual_set_listing_page'));
	$all_sets = esc_attr(get_option('all_sets_listing_page'));
	echo "Settings saved!<br/>Saved sets listing page: " . $all_sets . "<br/>Individual set resource page: ". $individual;	
}


 ?>
<form action="<?php echo str_replace('%7E', '~', $_SERVER['REQUEST_URI']) ?>" method="post" enctype="multipart/form-data">
	<p>Saved sets listing page: <input type="text" name="all-sets" value="<?php echo esc_attr( get_option('all_sets_listing_page','') ); ?>" /></p>
    <p>Individual set resource page: <input type="text" name="individual" value="<?php echo esc_attr( get_option('individual_set_listing_page','') ); ?>" /></p>
	<p><input type="submit" value="Save Settings" name="saveSettings"></p>
</form>
</div>
