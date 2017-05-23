if (document.images) {
Ibuttonshorizontal_01_01 = new Image(84, 17);Ibuttonshorizontal_01_01.src = '../../images/buttons/home.gif';
Ibuttonshorizontal_01_01o = new Image(84, 17);Ibuttonshorizontal_01_01o.src = '../../images/buttons/home_over.gif';
Ibuttonshorizontal_01_02 = new Image(85, 17);Ibuttonshorizontal_01_02.src = '../../images/buttons/search.gif';
Ibuttonshorizontal_01_02o = new Image(85, 17);Ibuttonshorizontal_01_02o.src = '../../images/buttons/search_over.gif';
Ibuttonshorizontal_01_03 = new Image(85, 17);Ibuttonshorizontal_01_03.src = '../../images/buttons/sitemap.gif';
Ibuttonshorizontal_01_03o = new Image(85, 17);Ibuttonshorizontal_01_03o.src = '../../images/buttons/sitemap_over.gif';
Ibuttonshorizontal_01_04 = new Image(85, 17);Ibuttonshorizontal_01_04.src = '../../images/buttons/new.gif';
Ibuttonshorizontal_01_04o = new Image(85, 17);Ibuttonshorizontal_01_04o.src = '../../images/buttons/new_over.gif';
Ibuttonshorizontal_01_05 = new Image(84, 17);Ibuttonshorizontal_01_05.src = '../../images/buttons/feedback.gif';
Ibuttonshorizontal_01_05o = new Image(84, 17);Ibuttonshorizontal_01_05o.src = '../../images/buttons/feedback_over.gif';
}
function di(id,name){
 if (document.images) {document.images[id].src=eval(name+".src"); }
}
// function that displays status bar message
function dm(msgStr) {
 document.returnValue = false;
 if (document.images) { 
  window.status = msgStr;
  document.returnValue = true;
 }
}
var showMsg = navigator.userAgent != "Mozilla/4.0 (compatible; MSIE 4.0; Mac_PowerPC)";
function dmim(msgStr) {
 document.returnValue = false;
 if (showMsg) { 
 window.status = msgStr;
 document.returnValue = true;
 }
}
// function link pop-up
function gotosite(site) {
	if (site != "") {
		parent.location=site
	}
}