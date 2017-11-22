// JavaScript that listens for user input and performs basic validation & show/hide form functions

	jQuery(document).ready(function() {
		//The set name can include only alphanumeric characters and dash or underscore, with no spaces or special characters.
		jQuery( "#newSetName" ).keypress(function(e) {
			//if key = backspace/delete or space allow
			//if enter, trigger addNewSet click
			var regex = new RegExp("^[a-zA-Z0-9]+$");
			var str = String.fromCharCode(!e.charCode ? e.which : e.charCode);
			if (e.which == 8 || e.which == 46 || e.which == 32 || e.which == 13 || regex.test(str)) {
				return true;
			}
			
		
			e.preventDefault();
			return false;
		});
		
		jQuery("#mySets").change(function() {
			if (jQuery("#mySets option:selected").val() == "create") {
				jQuery("#newSetForm").css("display","inline");
			} else {
				jQuery("#newSetForm").css("display","none");
			}
		});
		
	});
	
	