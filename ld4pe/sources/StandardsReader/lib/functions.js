// JavaScript functions for Standards Reader plugin

	Array.prototype.clean = function(deleteValue) {
	  for (var i = 0; i < this.length; i++) {
		if (this[i] == deleteValue) {         
		  this.splice(i, 1);
		  i--;
		}
	  }
	  return this;
	};
	
		//When user selected in dropdown...
		function selectUsersWithMaps() {
			var user = jQuery("#selectUser").val();
			showMapsByUser(user);
		}
		
		//Show maps belonging to user
		function showMapsByUser(user) {
			if(user > 0) {
				jQuery(".saved-set-listing").css("display","none");
				jQuery(".user-" + user).css("display","inline");	
			} else {
				jQuery(".saved-set-listing").css("display","inline");
			}
		}
		
		//Delete map with id
		function deleteMap(id) {
			var url = window.location.href;
			if (confirm("Do you really want to delete this map?")) {
				var uParts = window.location.href.split("?");
				window.location.href = uParts[0] + "?map_id=" + id + "&delete=" + id;
			}
		}
		
		//edit description of map with id
		function editMapDesc(id) {
			var url = window.location.href;
			var selection = jQuery('input[name="sharing"]:checked', '#set-sharing').val();
			var uParts = window.location.href.split("?");
			window.location.href = uParts[0] + "?map_id=" + id + "&edit=set&sharing=" + selection;
		}
		
		//edit name of map with id
		function editMapName(id) {
			var url = window.location.href;
			var selection = jQuery('input[name="sharing"]:checked', '#set-sharing').val();
			var uParts = window.location.href.split("?");
			window.location.href = uParts[0] + "?map_id=" + id + "&edit_name=set&sharing=" + selection;
		}
		
		//remove competency from map based on competency slug
		function removeComp(slug) {
			jQuery("#comp-" + slug + ", #competencies option[value='"+ slug+"']").remove();
			jQuery("#" + slug).removeClass("inactive");
		}
	
	jQuery(document).ready(function() {
		setup();
		
		//load content in appropriate HTML element
		try {
			if (target_div != undefined && target_div.hasOwnProperty('src') && target_div.src != 'empty');
				loadPrev(target_div.src);
		}
		catch (err) {
			console.log(err);
		}
		
		//load content in div on click
		jQuery( ".not-map .cat-item a, #topic-list .cat-item a" ).click(function(event) {
			loadRightContent(event, true);
		});
		
		//display resources?
		function loadRightContent(event, isComp) {
			console.log("go to " + target_div.target);
			if (target_div.target != "empty" && jQuery("#comp-index-intro").length > 0) {
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
		
		//get url minus GET variables
		function getBase(url) {
			return url.split('?')[0];	
		}
		
		//go back to the previous page
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
		
		//scroll to the top of the page
		function backToTop() {
				jQuery('html, body').animate({
					scrollTop: 0
				}, 500);	
		}
		
		//setup the listing page on load
		function setup() {
			if (target_div.collapse) {
				console.log(jQuery(".no-collapse"));
				var collapse = (jQuery(".no-collapse").length > 0) ? false:true;
				jQuery( "#comp-list .cat-item, #topic-list .cat-item" ).each(function( index ) {
					if (jQuery(this).children("ul").length > 0 && collapse) {
						jQuery(this).addClass("srOpen");
					}
					else jQuery(this).addClass("srNull");
				});
				
				//collapse all first level competencies
				if (collapse)
					jQuery('#comp-list ul ul, #topic-list ul').hide();
				
				jQuery('#comp-list .cat-item, #topic-list .cat-item').click(function(event) {
					if (jQuery(".no-collapse").length == 0) {
						event.stopPropagation();
						jQuery(event.target).children("ul").slideToggle(function() {
							if (jQuery(event.target).children("ul").length > 0) {
								if (jQuery(event.target).children("ul").first().css("display") == "none")
									jQuery(event.target).removeClass("srClose").addClass("srOpen");
								else jQuery(event.target).removeClass("srOpen").addClass("srClose");	
							}
						});
					}
					
				});
			}
		}
		
		/**** LEARNING MAP FUNCTIONALITY ****/
		
		//LEARNING MAP BUILDER CI browser setup - extracts slugs from URL, removes original links, and adds 'add to map link'
		jQuery(".is-map .cat-item").each(function() {
			if (jQuery(this).children('a').length > 0) {
				var url = jQuery(jQuery(this).children('a')[0]).attr('href');
				var parts = url.split('/').clean('');
				var slug = parts[parts.length - 1];	
				jQuery(this).children('a').each(function(e, el) {
					jQuery(el).replaceWith( jQuery('<span />', {html: jQuery(this).html() + " <a href='#' id='" + slug + "' class='map-links'>Add to map >></a>"}) );
					if (jQuery("#competencies option[value='"+ slug+"']").length > 0) {
						jQuery("#" + slug).addClass("inactive");
					}
				});
			}
		});
		
		//LEARNING MAP BUILDER add competency to map
		jQuery(".map-links").click(function(event) {
			event.preventDefault();
			if (!jQuery(this).hasClass("inactive")) {
				jQuery(this).addClass("inactive");
				
				jQuery("#saveMe").val("false");
				//add competency to select
				jQuery("#competencies").append('<option value="' + jQuery(this).attr("id") + '" selected="selected"></option>');
				//strip everything but map_id from url
				jQuery("#mapUpdate").submit();
			//event.stopPropogation();
			}
		});
		
		//LEARNING MAP BUILDER change order of terms
		jQuery(".arrow").click(function(event) {
			var slug = jQuery(this).attr("id").split("-")[1];
			//get all mapContent blocks
			var terms = new Array();
			jQuery(".mapContent").each(function() {
				terms.push(jQuery(this).attr("id"));
			});
			
			var index = -1;
			for (var t = 0; t < terms.length; t++) {
				if (terms[t] == "comp-" + slug) {
					index = t;
					break;	
				}
			}
			
			if (jQuery(this).hasClass("arrow-up")) {
				if (t > 0) {
					jQuery("#comp-" + slug).insertBefore("#" + terms[t-1]);
					jQuery("#competencies option[value='"+ slug+"']").insertBefore(jQuery("#competencies option[value='"+ terms[t-1].replace("comp-","")+"']"));
				}
			}
			else {
				if (t > -1 && t < terms.length - 1) {
					jQuery("#comp-" + slug).insertAfter("#" + terms[t+1]);
					jQuery("#competencies option[value='"+ slug+"']").insertAfter(jQuery("#competencies option[value='"+ terms[t+1].replace("comp-","")+"']"));
				}
			}
			jQuery(this).parent(".mapContent").remove();
			
			//reorder hidden select options to match
		});
		
		
		
	});