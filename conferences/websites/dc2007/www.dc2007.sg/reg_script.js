function validate(form1) {     
   
  if(form1.fname.value=="")				//fname(empty)
  {
    alert("Please Enter Your First Name!");
    form1.fname.focus();
	form1.fname.select();
	form1.fname.style.background='#FFCCCC';
    return false;
  }
  
  if(form1.lname.value=="")				//lname(empty)
  {
    alert("Please Enter Your Last Name!");
    form1.lname.focus();
	form1.lname.select();
	form1.lname.style.background='#FFCCCC';
    return false;
  }  
  
  if(form1.address.value=="")
  {
     alert("Please Enter Your Address!")
     form1.address.focus();
	 form1.address.select();
	 form1.address.style.background='#FFCCCC';
     return false;
  }
  
  if(form1.mainTelcc.value=="")				//mainTelcc(empty)
  {
    alert("Please Enter Your Country Code For Telephone Number (Main)!");
    form1.mainTelcc.focus();
	form1.mainTelcc.select();
    form1.mainTelcc.style.background='#FFCCCC'
    return false;
  }         
  
  if(form1.mainTel.value=="")				//mainTel(empty)
  {
    alert("Please Enter Your Telephone Number!");
    form1.mainTel.focus();
	form1.mainTel.select();
    form1.mainTel.style.background='#FFCCCC';
    return false;
  }  
  
  if(!form1.mainTelGroup[0].checked&&!form1.mainTelGroup[1].checked&&!form1.mainTelGroup[2].checked) //mainTelGroup(empty)
  {
     alert("Please Select The Category For Your Telephone Number!")
	 form1.mainTelGroup[0].focus();
	 form1.mainTelGroup[0].select();
	 form1.mainTelGroup[0].style.background='#FFCCCC';
	 return false;
  }    
  
  if(form1.email.value=="")				//email(empty)
  {
    alert("Please Enter Your Email Address!");
    form1.email.focus();
	form1.email.select();
	form1.email.style.background='#FFCCCC';
    return false;
  }   
  
  if(!isAllalphabets(form1.fname.value))
  {
    alert("First Name Must Contain Only Alphabets!");
    form1.fname.focus();
	form1.fname.select();
    form1.fname.style.background='#FFCCCC';
    return false;	
  }
  
  if(!isAllalphabets(form1.lname.value))
  {
    alert("Last Name Must Contain Only Alphabets!");
    form1.lname.focus();
	form1.lname.select();
    form1.lname.style.background='#FFCCCC';
    return false;	
  }
  
  if(!isAlldigits(form1.mainTelcc.value))
  {
    alert("Country Code For Telephone Number Must Contain Only Digits!");
    form1.mainTelcc.focus();
	form1.mainTelcc.select();
    form1.mainTelcc.style.background='#FFCCCC';
    return false;
  }
  
  if(!isAlldigits(form1.mainTel.value))
  {
    alert("Telephone Number Must Contain Only Digits!");
    form1.mainTel.focus();
	form1.mainTel.select();
    form1.mainTel.style.background='#FFCCCC';
    return false;
  }  
  
  if(!isEmail(form1.email.value))
  {
     alert("Please Enter A Valid Email Address!");
     form1.email.focus();
	 form1.email.select();
	 form1.email.style.background='#FFCCCC';
     return false;
  }    
  
   if(!form1.registrationType[0].checked&&!form1.registrationType[1].checked&&!form1.registrationType[2].checked&&!form1.registrationType[3].checked&&!form1.registrationType[4].checked&&!form1.registrationType[5].checked&&!form1.C1.checked&&!form1.C2.checked&&!form1.C3.checked&&!form1.T1.checked&&!form1.T2.checked&&!form1.T3.checked&&!form1.T4.checked&&!form1.S1.checked&&!form1.S2.checked)//conference selection)
   {
      alert("Please Select At Least One Option From The Conference Table!");
      form1.registrationType[0].focus();
	  form1.registrationType[0].select();
	  form1.registrationType[0].style.background='#FFCCCC';
      return false;
   }    
   
   if (!form1.welcomeReception[0].disabled && !form1.welcomeReception[1].disabled){
      if(!form1.welcomeReception[0].checked && !form1.welcomeReception[1].checked)			//Welcome Reception selection)
      {
         alert("Please Indicates Your Attendance For Welcome Reception!");
         form1.welcomeReception[0].focus();
	     form1.welcomeReception[0].select();
	     form1.welcomeReception[0].style.background='#FFCCCC';
         return false;
      }   
   }
   
   if (!form1.conferenceDinner[0].disabled&&!form1.conferenceDinner[1].disabled){
      if(!form1.conferenceDinner[0].checked && !form1.conferenceDinner[1].checked)			//Conference Dinner selection)
      {
         alert("Please Indicates Your Attendance For Conference Dinner!");
         form1.conferenceDinner[0].focus();
	     form1.conferenceDinner[0].select();
	     form1.conferenceDinner[0].style.background='#FFCCCC';
         return false;
      }      
   }
   
   if(!form1.paymentMethod[0].checked && !form1.paymentMethod[1].checked) //payment Method selection)
   {
      alert("Please Select Your Payment Method!");
      form1.paymentMethod[0].focus();
	  form1.paymentMethod[0].select();
	  form1.paymentMethod[0].style.background='#FFCCCC';
      return false;
   }     
   
   if(!form1.booking[0].checked && !form1.booking[1].checked &&!form1.booking[2].checked)			//accommodation selection)
   {
      alert("Please Select Your Accommodation!");
      form1.booking[0].focus();
	  form1.booking[0].select();
	  form1.booking[0].style.background='#FFCCCC';
      return false;
   }      
  
  return true;      
           
}

//----------------------------[function apply to check boxes]----------------------------

function checkAllSeminars(){
   if (form1.registrationType[1].checked && form1.S1.checked && form1.S2.checked){
      form1.registrationType[0].checked="checked";
	  fullConference();
   }   
   
   checkFullConferenceSeminars();
   checkTutorialSeminarsConferences();
   checkSeminarAll();
}

function checkAllTutorials(){
   if (form1.registrationType[2].checked && form1.T1.checked && form1.T2.checked && form1.T3.checked && form1.T4.checked){
      form1.registrationType[0].checked="checked";
	  fullConference();
   }
   
   checkFullConferenceTutorials();
   checkTutorialsAll();
}

function checkAllConference(){
   checkSeminarAll();	
   checkTutorialSeminarsConferences();
   checkTutorialsConferences();
   checkSeminarSelectAll();   
   checkSeminarsConference();
   checkConferenceAll();
}

//----------------------------------------------------------------------------------------

function checkFullConferenceTutorials(){
   if (form1.registrationType[3].checked && form1.T1.checked && form1.T2.checked && form1.T3.checked && form1.T4.checked){
      form1.registrationType[1].checked="checked";
	  conferenceTutorials();
   }
}

function checkFullConferenceSeminars(){
   if (form1.registrationType[3].checked && form1.S1.checked && form1.S2.checked){
      form1.registrationType[2].checked="checked";
	  conferenceSeminars();
   }
}

function checkTutorialSeminarsConferences(){
   if (form1.registrationType[4].checked && form1.S1.checked && form1.S2.checked && form1.C1.checked && form1.C2.checked && form1.C3.checked){
      form1.registrationType[0].checked="checked";
	  fullConference();
   }
}

function checkTutorialsConferences(){
   if (form1.registrationType[4].checked && form1.C1.checked && form1.C2.checked && form1.C3.checked){
      form1.registrationType[1].checked="checked";
	  conferenceTutorials();
   }
}

function checkSeminarsConference(){
   if (form1.registrationType[5].checked && form1.C1.checked && form1.C2.checked && form1.C3.checked){
      form1.registrationType[2].checked="checked";   
      conferenceSeminars();
   }
}

function checkConferenceAll(){	
   if (form1.C1.checked && form1.C2.checked && form1.C3.checked){
      form1.registrationType[3].checked="checked";
	  conferenceOnly();   
   }
}

function checkTutorialsAll(){
   if (!form1.registrationType[5].checked && form1.T1.checked && form1.T2.checked && form1.T3.checked && form1.T4.checked){	     
      form1.registrationType[4].checked="checked";
	  tutorialOnly();
   }
}

function checkSeminarAll(){   
   if (!form1.registrationType[4].checked && form1.S1.checked && form1.S2.checked){
      form1.registrationType[5].checked="checked";
	  seminarOnly();
   }
}

function checkSeminarSelectAll(){
   if (form1.registrationType[5].checked && form1.C1.checked && form1.C2.checked && form1.C3.checked && form1.T1.checked && form1.T2.checked && form1.T3.checked && form1.T4.checked){
	      form1.registrationType[0].checked="checked"
		  fullConference();
   }
}


function fullConference(){
   //disabledRegistration();   
   disabledConference(); 
   disabledTutorial();
   disabledSeminar();        
   
   clearConferenceCheckBox();            
   clearSeminarCheckBox();      
   clearTutorialCheckBox();      
   
   enabledWelcomeReception();
   enabledConferenceDinner();
   
   clearWelcomeReception();
   clearConferenceDinner();
}

function conferenceTutorials(clearCheckBox){
   //disabledRegistration();
   disabledConference();
   disabledTutorial();
   enabledSeminar();      
      
   clearConferenceCheckBox();     
   clearTutorialCheckBox();    
   
   enabledWelcomeReception();
   enabledConferenceDinner();
   
   clearWelcomeReception();
   clearConferenceDinner();   
}

function conferenceSeminars(){
   //disabledRegistration();
   disabledConference();
   disabledSeminar();
   enabledTutorial();
   
   clearConferenceCheckBox();           
   clearSeminarCheckBox();      
   
   enabledWelcomeReception();
   enabledConferenceDinner();  
   
   clearWelcomeReception();
   clearConferenceDinner();      
}

function conferenceOnly(){
   //disabledRegistration();
   disabledConference();
   enabledTutorial();
   enabledSeminar();
   
   clearConferenceCheckBox();     
   
   enabledWelcomeReception();
   enabledConferenceDinner();   
   
   clearWelcomeReception();
   clearConferenceDinner();   
}

function tutorialOnly(){
   //disabledRegistration();
   disabledTutorial();
   enabledConference();
   enabledSeminar();
   
   clearTutorialCheckBox();     
   
   disabledWelcomeReception();
   disabledConferenceDinner();
}

function seminarOnly(){
   //disabledRegistration();
   disabledSeminar();
   enabledConference();   
   enabledTutorial();

   clearSeminarCheckBox();   
   
   disabledWelcomeReception();
   disabledConferenceDinner();   
}

function disabledRegistration(){
   form1.registrationType[0].disabled="disabled";
   form1.registrationType[1].disabled="disabled";
   form1.registrationType[2].disabled="disabled";
   form1.registrationType[3].disabled="disabled";   
   form1.registrationType[4].disabled="disabled";   
   form1.registrationType[5].disabled="disabled";      
}

function enabledConference(){
   clearConferenceCheckBox();     
   form1.C1.disabled="";
   form1.C2.disabled="";
   form1.C3.disabled="";   
}

function disabledConference(){
   form1.C1.disabled="disabled";
   form1.C2.disabled="disabled";
   form1.C3.disabled="disabled";   
}

function enabledTutorial(){
   form1.T1.disabled="";   
   form1.T2.disabled="";      
   form1.T3.disabled=""; 
   form1.T4.disabled=""; 
   clearTutorialCheckBox();   
}

function disabledTutorial(){
   form1.T1.disabled="disabled";   
   form1.T2.disabled="disabled";      
   form1.T3.disabled="disabled"; 
   form1.T4.disabled="disabled"; 
}

function enabledSeminar(){
   form1.S1.disabled="";         
   form1.S2.disabled=""; 
   clearSeminarCheckBox();  
}

function disabledSeminar(){
   form1.S1.disabled="disabled";         
   form1.S2.disabled="disabled"; 
}

function resetConferenceForm(){
   form1.registrationType[0].disabled="";
   form1.registrationType[1].disabled="";
   form1.registrationType[2].disabled="";
   form1.registrationType[3].disabled="";   
   form1.registrationType[4].disabled="";   
   form1.registrationType[5].disabled="";  
   form1.C1.disabled="";
   form1.C2.disabled="";
   form1.C3.disabled=""; 
   form1.T1.disabled="";   
   form1.T2.disabled="";      
   form1.T3.disabled=""; 
   form1.T4.disabled=""; 
   form1.S1.disabled="";         
   form1.S2.disabled="";    
   
   form1.registrationType[0].checked="";
   form1.registrationType[1].checked="";
   form1.registrationType[2].checked="";   
   form1.registrationType[3].checked="";      
   form1.registrationType[4].checked="";         
   form1.registrationType[5].checked="";                                        
   
   clearConferenceCheckBox();
   clearTutorialCheckBox();
   clearSeminarCheckBox();
   
   disabledWelcomeReception();
   disabledConferenceDinner();
}

function clearConferenceCheckBox(){
   form1.C1.checked=""; 
   form1.C2.checked="";    
   form1.C3.checked="";   
}

function clearTutorialCheckBox(){
   form1.T1.checked="";    
   form1.T2.checked="";       
   form1.T3.checked="";          
   form1.T4.checked="";  
}

function clearSeminarCheckBox(){
   form1.S1.checked="";                
   form1.S2.checked="";   
}

function disabledWelcomeReception(){
	form1.welcomeReception[0].disabled="disabled";
	form1.welcomeReception[1].disabled="disabled";
	clearWelcomeReception();
}

function disabledConferenceDinner(){
	form1.conferenceDinner[0].disabled="disabled";
	form1.conferenceDinner[1].disabled="disabled";
	clearConferenceDinner();
}

function enabledWelcomeReception(){
	form1.welcomeReception[0].disabled="";
	form1.welcomeReception[1].disabled="";	
}

function enabledConferenceDinner(){
	form1.conferenceDinner[0].disabled="";
	form1.conferenceDinner[1].disabled="";	
}

function clearWelcomeReception(){
	form1.welcomeReception[0].checked="";
	form1.welcomeReception[1].checked="";
}

function clearConferenceDinner(){
   form1.conferenceDinner[0].checked="";
   form1.conferenceDinner[1].checked="";
}


function isEmail(str)
{
  if(str.indexOf('@')==-1||str.indexOf('.')==-1)  return false;
  if(str.length<5)  return false;
  return true;
}

function isAllalphabets(str)
{
  var i;
  for(i=0;i<str.length;i++)
  {
    if(!isAlphabet(str.charAt(i))&&!isSpace(str.charAt(i)))return false;
  }
  return true;
}

function isAlphabet(ch)
{
  return((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'));
}

function isSpace(ch)
{
  return (ch==' ');
}

function isAlldigits(str)
{
  var i;
  for(i=0;i<str.length;i++)
  {
    if(!isDigit(str.charAt(i)))return false;
  }
  return true;
}

function isDigit(ch)
{
  return(ch>='0'&&ch<='9')||(ch=='-')||(ch==',')||(ch=='/')||(ch==' ');
}

function checkRegistration(){
	
   if (!form1.welcomeReception[0].checked&&!form1.welcomeReception[1].checked){
	  disabledWelcomeReception();
	  disabledConferenceDinner();	  	   
   }
   
   if (!form1.conferenceDinner[0].checked&&!form1.conferenceDinner[1].checked){
	  disabledWelcomeReception();
	  disabledConferenceDinner();	   
   }
  
   if (form1.registrationType[0].checked){
   
      disabledConference();
	  disabledTutorial();
	  disabledSeminar();
	  
	  enabledWelcomeReception();
	  enabledConferenceDinner();
            
   }
   if (form1.registrationType[1].checked){      
      disabledConference();
	  disabledTutorial();   
	  
	  enabledWelcomeReception();
	  enabledConferenceDinner();	  
   }   
   if (form1.registrationType[2].checked){   
      disabledConference();
	  disabledSeminar();   
	  
	  enabledWelcomeReception();
	  enabledConferenceDinner();	  
   }      
   if (form1.registrationType[3].checked){
      disabledConference();      
	  
	  enabledWelcomeReception();
	  enabledConferenceDinner();	  
   }      
   if (form1.registrationType[4].checked){
      disabledTutorial(); 
	  
	  disabledWelcomeReception();
	  disabledConferenceDinner();
   }      
   if (form1.registrationType[5].checked){
      disabledSeminar();   
	  
	  disabledWelcomeReception();
	  disabledConferenceDinner();	  
   }          
   
}

window.onload=checkRegistration;
