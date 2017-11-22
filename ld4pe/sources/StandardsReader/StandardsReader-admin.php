<!--Creates the admin form at dashboard > Settings > Standards Reader -->
<div class="wrap">
	<?php
	echo "<h2>" . __('Import Standards', 'sr_trdom') . "</h2>"; ?>
    <?php if (isset($_POST["submit"])) { //process a competency index file if uploaded
		if ($_FILES["standardsUpload"]["tmp_name"] != '') {	
			try {
				$graph = new EasyRdf_Graph();
				$graph->parse(file_get_contents($_FILES["standardsUpload"]["tmp_name"]));
				$json = EasyRdf_Serialiser_Json::serialise($graph, "json");
				if ($json != '')
					build_taxonomy(json_decode($json, true));
				else echo "File could not be read! Check that your file is in a compatible format.";
			}
			catch (Exception $e) {
				echo "Oops! " . $e;	
			}
		} else {
			echo "No file selected!";	
		}
	} ?>
    <!-- form to upload competency index from JSON file -->
	<form action="<?php echo str_replace('%7E', '~', $_SERVER['REQUEST_URI']) ?>" method="post" enctype="multipart/form-data">
        <p>Select standards document (JSON): <input type="file" name="standardsUpload" id="standardsUpload"></p>
        <p><input type="submit" value="Import Standards" name="submit"></p>
    </form>
    <?php
	echo "<h2>" . __('Import Subject Index', 'sr_trdom') . "</h2>"; ?>
    <?php if (isset($_POST["submitSubjects"])) { //process a topic index file if uploaded
		if ($_FILES["subjectUpload"]["tmp_name"] != '') {	
			try {
				$graph = new EasyRdf_Graph();
				$graph->parse(file_get_contents($_FILES["subjectUpload"]["tmp_name"]));
				$json = EasyRdf_Serialiser_Json::serialise($graph, "json");
				if ($json != '')
					build_index(json_decode($json, true));
				else echo "File could not be read! Check that your file is in a compatible format.";
			}
			catch (Exception $e) {
				echo "Oops! " . $e;	
			}
		} else {
			echo "No file selected!";	
		}
	} ?>
    <!-- form to upload topic index from JSON file -->
	<form action="<?php echo str_replace('%7E', '~', $_SERVER['REQUEST_URI']) ?>" method="post" enctype="multipart/form-data">
        <p>Select subject index document (XML): <input type="file" name="subjectUpload" id="subjectUpload"></p>
        <p><input type="submit" value="Import Subject" name="submitSubjects"></p>
    </form>
    <?php 
	echo "<h2>" . __('Import Learning Resources', 'sr_trdom') . "</h2>"; 
     ?>
    <?php if (isset($_POST["saveSettings"])) { //save updated settings
		esc_attr(update_option('endpoint', $_POST['endpoint'], true));
		esc_attr(update_option('check_interval', $_POST['check_interval'], true));
		update_interval_schedule($_POST['check_interval']);
		$endpoint = esc_attr(get_option('endpoint'));
		$check_interval = esc_attr(get_option('check_interval'));
		echo "Settings saved!<br/>Endpoint: ". $endpoint . "<br/>Interval: " . $check_interval;	
	} else if (isset($_POST["getResources"])) {
		
		esc_attr(update_option('endpoint', $_POST['endpoint'], true));
		esc_attr(update_option('check_interval', $_POST['check_interval'], true));
		update_interval_schedule($_POST['check_interval']);
		resource_import(false);
		echo "Resources fetched and settings saved!";
	} ?>
    <!-- form to update settings -->
    <form action="<?php echo str_replace('%7E', '~', $_SERVER['REQUEST_URI']) ?>" method="post" enctype="multipart/form-data">
    	<p>Remote repository endpoint: <input type="text" name="endpoint" value="<?php echo esc_attr( get_option('endpoint','http://explore.dublincore.net/rdf/endpoint.php') ); ?>" /></p>
        <p>Check for update every <input type="text" name="check_interval" value="<?php echo esc_attr( get_option('check_interval ',24) ); ?>" /> hours</p>
		<p><input type="submit" value="Save Settings" name="saveSettings">&nbsp;<input type="submit" value="Get All Resources" name="getResources"></p>
    </form>
	<?php 
	echo "<h2>" . __('Learning Map Builder page', 'sr_trdom')."</h2>";
	if (isset($_POST["saveMapPage"])) {
		esc_attr(update_option('mapPage', $_POST['mapPage'], true));
		esc_attr(update_option('mapListing', $_POST['mapListing'], true));	
	}
	?>
   <form action="<?php echo str_replace('%7E', '~', $_SERVER['REQUEST_URI']) ?>" method="post" enctype="multipart/form-data">
    	<p>Learning map builder URL: <input type="text" name="mapPage" value="<?php echo esc_attr( get_option('mapPage','') ); ?>" /></p>
        <p>Learning map listing URL: <input type="text" name="mapListing" value="<?php echo esc_attr( get_option('mapListing','') ); ?>" /></p>
        <p><input type="submit" value="Save Learning Map Page" name="saveMapPage"></p>
        </form>
    
</div>