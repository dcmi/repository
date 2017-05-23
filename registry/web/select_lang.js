//
// $Id: select_lang.js,v 1.1.1.1 2004/01/26 21:41:34 wagnerh Exp $
//
// Mitsuharu Nagamori (nagamorm@oclc.org)
//
/*
Usage: 

<form action="#">
<table border="1">
    <tr>
	<td>
	    <div id="ja-JP">definition in Japanese</div>
	    <div id="co-KR" style="display:none;">definition in Korean</div>
	    <div id="en-US" style="display:none;">definition in English</div>
	</td>
	<td>
	    <select onChange="select_lang(this)">
		<option value="ja-JP" selected>Japanese</option>
		<option value="co-KR">Korean</option>
		<option value="en-US">English</option>
	    </select>
	</td>
	<td>
	    <div id="ja-JP"><a href="">link to Japanese</a></div>
	    <div id="co-KR" style="display:none;"><a href="">link to Korean</a></div>
	    <div id="en-US" style="display:none;"><a href="">link to English</a></div>
	</td>
    </tr>
</table>
</form>

*/

// IE4=1, IE5+=2, NN4=3, NN6+=4, others=0
_dom = document.all?(document.getElementById?2:1)
		   :(document.getElementById?4
		   :(document.layers?3:0));

// means the position of "Value".
_val_pos = 1;

// means the position of "Functions".
_link_pos = 3;

function select_lang(target) {
    n = target.selectedIndex;
    t_name = target.options[n].value;

    if (_dom == 1 || _dom == 2) {
	change_display_ie(target, t_name, _val_pos);
	change_display_ie(target, t_name, _link_pos);
    } else if (_dom == 3 || _dom == 4) {
	var prnt = target.parentNode.parentNode;
	var chld = prnt.getElementsByTagName("td");
	change_display_mz(chld.item(_val_pos), t_name);
	change_display_mz(chld.item(_link_pos), t_name);
    }
}

function change_display_mz(target, t_name) {
    var chld = target.getElementsByTagName("div");
    for (i=0; i<chld.length; i++) {
	var id = chld.item(i).getAttribute("id");
	if (id == t_name) {
	    chld.item(i).style.display = "";
	} else {
	    chld.item(i).style.display = "None";
	}
    }
}

function change_display_ie(target, t_name, idx) {
    x1 = target.parentElement.parentElement.all.tags("td")(idx).all.tags("div");
    for (i=0; i<x1.length; i++) {
	j = x1(i);
	if (j.id == t_name) {
	    j.style.display ="";
	} else {
	    j.style.display ="none";
	}
    }
}
