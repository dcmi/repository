// JavaScript that updates the saved set listing UI based on user form input
	
	//When a user is selected from the show sets by user dropdown...
	function selectUsersWithSets() {
		var user = jQuery("#selectUser").val();
		showSetsByUser(user);
	}
	
	//Reloads the page to show the selected set
	function showSet() {
		var set = jQuery("#selectSet").val();
		var uParts = window.location.href.split("?");
		window.location.href = uParts[0] + "?set=" + set;
	}
	
	//When a particular user is selected, show sets by that user and hide all others. When no user is select, display all sets. 
	function showSetsByUser(user) {
		if(user > 0) {
			jQuery(".saved-set-listing").css("display","none");
			jQuery(".user-" + user).css("display","inline");	
		} else {
			jQuery(".saved-set-listing").css("display","inline");
		}
	}
	
	//Shows a confirmation dialog when a user opts to delete a set
	function deleteSet(set) {
		var url = window.location.href;
		if (confirm("Do you really want to delete this set?")) {
			var uParts = window.location.href.split("?");
			window.location.href = uParts[0] + "?set=" + set + "&delete=" + set;
		}
	}
	
	//Reloads the page to process an update to the set description
	function editDesc(set) {
		var url = window.location.href;
		var selection = jQuery('input[name="sharing"]:checked', '#set-sharing').val();
		var uParts = window.location.href.split("?");
		window.location.href = uParts[0] + "?set=" + set + "&edit=set&sharing=" + selection;
	}
	
	//Reloads the page to process an update to the set name
	function editName(set) {
		var url = window.location.href;
		var selection = jQuery('input[name="sharing"]:checked', '#set-sharing').val();
		var uParts = window.location.href.split("?");
		window.location.href = uParts[0] + "?set=" + set + "&edit_name=set&sharing=" + selection;
	}
	
	jQuery(document).ready(function() {
		try {
			if (target_div != undefined && target_div.hasOwnProperty('src') && target_div.src != 'empty');
				loadPrev(target_div.src);
		}
		catch (err) {
			console.log(err);
		}
		
		//Load content based on url variables and store previously displayed set in browser history
		function loadRightContent(event, isComp) {
			if (target_div.target != "empty") {
				window.history.pushState({}, document.title, getBase(window.location.href) + '?src=' + event.target );
				event.preventDefault();
				event.stopPropagation();
				//url variables sort by rating - ratings plugin
				var vars = "?r_sortby=highest_rated&amp;r_orderby=desc #content";
				jQuery("#" + target_div.target).load(event.target + vars, function() {
					jQuery("#" + target_div.target).append("<div style='clear:both'/>");
					backToTop();
					jQuery(".pagination").click(function(event) {
						loadRightContent(event, isComp);
					});
				});
			}	
		}
		
		//Gets the page URL without GET variables
		function getBase(url) {
			return url.split('?')[0];	
		}
		
		//Displays the previously visited content
		function loadPrev(prevPage) {
			if (prevPage != 'empty') {
				jQuery("#" + target_div.target).load(prevPage + "?r_sortby=highest_rated&amp;r_orderby=desc #content", function() {
					jQuery("#" + target_div.target).append("<div style='clear:both'/>");
					jQuery(".pagination").click(function(event) {
						loadRightContent(event, true);
					});
				});
			}
		}
		
		//Scroll to the top of the page
		function backToTop() {
				jQuery('html, body').animate({
					scrollTop: 0
				}, 500);	
		}
		
		//Setup the left navigation (competency listing)
		function setup() {
			if (target_div.collapse) {
				jQuery( "#comp-list .cat-item, #topic-list .cat-item" ).each(function( index ) {
					if (jQuery(this).children("ul").length > 0) {
						jQuery(this).addClass("srOpen");
					}
					else jQuery(this).addClass("srNull");
				});
				
				//collapse all first level competencies
				jQuery('#comp-list ul ul, #topic-list ul').hide();
				
				jQuery('#comp-list .cat-item, #topic-list .cat-item').click(function(event) {
					event.stopPropagation();
					jQuery(event.target).children("ul").slideToggle(function() {
						if (jQuery(event.target).children("ul").length > 0) {
							if (jQuery(event.target).children("ul").first().css("display") == "none")
								jQuery(event.target).removeClass("srClose").addClass("srOpen");
							else jQuery(event.target).removeClass("srOpen").addClass("srClose");	
						}
					});
					
				});
			}
		}
	});