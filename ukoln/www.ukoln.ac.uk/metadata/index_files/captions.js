// Global Javascript file for Lancaster

//version:   1.0
//author:    Paul Boag
//email:     paul.boag@headscape.co.uk
//website:   http://www.headscape.co.uk



//Get Element by Class Name from: http://www.robertnyman.com/2005/11/07/the-ultimate-getelementsbyclassname/

function getElementsByClassName(oElm, strTagName, strClassName){
    var arrElements = (strTagName == "*" && oElm.all)? oElm.all : oElm.getElementsByTagName(strTagName);
    var arrReturnElements = new Array();
    strClassName = strClassName.replace(/\-/g, "\\-");
    var oRegExp = new RegExp("(^|\\s)" + strClassName + "(\\s|$)");
    var oElement;
    for(var i=0; i<arrElements.length; i++){
        oElement = arrElements[i];      
        if(oRegExp.test(oElement.className)){
            arrReturnElements.push(oElement);
        }   
    }
    return (arrReturnElements)
}


//Function for converting title tags on images into caption

function addCaption(xClass) {
	var allImages = getElementsByClassName(document, "img", xClass);
	for ( var i=0; i < allImages.length; i++) {
		var imageCaption = document.createTextNode(allImages[i].title);
		var imageContainer = document.createElement("div");
		var imagePara = document.createElement("p");
		var imageWidth = allImages[i].getAttribute("width");
		var spareSpan = document.createElement("span"); //This adds an extra span. Useful for curved corners
		imagePara.appendChild(imageCaption);
		allImages[i].parentNode.insertBefore(imageContainer, allImages[i]);
		imageContainer.appendChild(allImages[i]);
		if ( allImages[i].title != "" ) {
		imageContainer.appendChild(imagePara); 
		}
		imageContainer.appendChild(spareSpan);		
		imageContainer.className = xClass
		spareSpan.className = "spareSpan"
		allImages[i].className = "imgCaption"
		imageContainer.style.width = imageWidth + "px";
		
    }
}




// Runs all the listed functions on the loading of the window

window.onload=function(){
addCaption("imgLeft");
addCaption("imgRight");
}
