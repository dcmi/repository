function validateInterCon(form1) {     
   if (!form1.roomType[0].checked&&!form1.roomType[1].checked&&!form1.roomType[2].checked&&!form1.roomType[3].checked){
      alert("Please Select A Room Category!");
      form1.roomType[0].focus();
	  form1.roomType[0].select();
	  form1.roomType[0].style.background='#FFCCCC';
      return false;	      
   }
   
   if (form1.Name.value==""){
	   alert("Please Enter Your Name!")
	   form1.Name.focus();
	   form1.Name.select();
	   form1.Name.style.background='#FFCCCC';
	   return false;
   }      
   
   if (form1.address.value==""){
	   alert("Please Enter Your Address!")
	   form1.address.focus();
	   form1.address.select();
	   form1.address.style.background='#FFCCCC';
	   return false;
   }    
   
   if (form1.ccNo.value==""){
	   alert("Please Enter Your Credit Card Number!")
	   form1.ccNo.focus();
	   form1.ccNo.select();
	   form1.ccNo.style.background='#FFCCCC';
	   return false;
   }      
   
   if (form1.nationality.value==""){
	   alert("Please Enter Your Nationality!")
	   form1.nationality.focus();
	   form1.nationality.select();
	   form1.nationality.style.background='#FFCCCC';
	   return false;
   }       
       
   if (form1.tel.value==""){
	   alert("Please Enter Your Telephone Number!")
	   form1.tel.focus();
	   form1.tel.select();
	   form1.tel.style.background='#FFCCCC';
	   return false;
   }       
   
   if (form1.arrivalDate.value==""){
      alert("Please Enter Your Date of Arrival!");
      form1.arrivalDate.focus();
	  form1.arrivalDate.select();
	  form1.arrivalDate.style.background='#FFCCCC';
      return false;	      
   }
   
   if (form1.departureDate.value==""){
      alert("Please Enter Your Date of Departure!");
      form1.departureDate.focus();
	  form1.departureDate.select();
	  form1.departureDate.style.background='#FFCCCC';
      return false;		   
   }   
      
   
   if (form1.email.value==""){
	   alert("Please Enter Your Email Address!")
	   form1.email.focus();
	   form1.email.select();
	   form1.email.style.background='#FFCCCC';
	   return false;
   }    
      
   return true;
}

function validateGolden(form1) {     
   if (!form1.roomType[0].checked&&!form1.roomType[1].checked){
      alert("Please Select A Room Category!");
      form1.roomType[0].focus();
	  form1.roomType[0].select();
	  form1.roomType[0].style.background='#FFCCCC';
      return false;	   	   
   }
   
   if (form1.Name.value==""){
	   alert("Please Enter Your Name!")
	   form1.Name.focus();
	   form1.Name.select();
	   form1.Name.style.background='#FFCCCC';
	   return false;
   }      
   
   if (form1.address.value==""){
	   alert("Please Enter Your Address!")
	   form1.address.focus();
	   form1.address.select();
	   form1.address.style.background='#FFCCCC';
	   return false;
   }       
   
   if (form1.ccNo.value==""){
	   alert("Please Enter Your Credit Card Number!")
	   form1.ccNo.focus();
	   form1.ccNo.select();
	   form1.ccNo.style.background='#FFCCCC';
	   return false;
   }   
   
   if (form1.nationality.value==""){
	   alert("Please Enter Your Nationality!")
	   form1.nationality.focus();
	   form1.nationality.select();
	   form1.nationality.style.background='#FFCCCC';
	   return false;
   }       
       
   if (form1.tel.value==""){
	   alert("Please Enter Your Telephone Number!")
	   form1.tel.focus();
	   form1.tel.select();
	   form1.tel.style.background='#FFCCCC';
	   return false;
   }        

   if (form1.arrivalDate.value==""){
      alert("Please Enter Your Date of Arrival!");
      form1.arrivalDate.focus();
	  form1.arrivalDate.select();
	  form1.arrivalDate.style.background='#FFCCCC';
      return false;	      
   }
   
   if (form1.departureDate.value==""){
      alert("Please Enter Your Date of Departure!");
      form1.departureDate.focus();
	  form1.departureDate.select();
	  form1.departureDate.style.background='#FFCCCC';
      return false;		   
   }
      
   if (form1.email.value==""){
	   alert("Please Enter Your Email Address!")
	   form1.email.focus();
	   form1.email.select();
	   form1.email.style.background='#FFCCCC';
	   return false;
   }      
   
   return true;
}

function validateOxford(form1){
	if (!form1.roomType[0].checked&&!form1.roomType[1].checked){
      alert("Please Select A Room Category!");
      form1.roomType[0].focus();
	  form1.roomType[0].select();
	  form1.roomType[0].style.background='#FFCCCC';
      return false;	   	   		
	}
	
   if (form1.Name.value==""){
	   alert("Please Enter Your Name!")
	   form1.Name.focus();
	   form1.Name.select();
	   form1.Name.style.background='#FFCCCC';
	   return false;
   }      
   
   if (form1.address.value==""){
	   alert("Please Enter Your Address!")
	   form1.address.focus();
	   form1.address.select();
	   form1.address.style.background='#FFCCCC';
	   return false;
   }     	
	
   if (form1.ccNo.value==""){
	   alert("Please Enter Your Credit Card Number!")
	   form1.ccNo.focus();
	   form1.ccNo.select();
	   form1.ccNo.style.background='#FFCCCC';
	   return false;
   }  
   
   if (form1.nationality.value==""){
	   alert("Please Enter Your Nationality!")
	   form1.nationality.focus();
	   form1.nationality.select();
	   form1.nationality.style.background='#FFCCCC';
	   return false;
   }       
       
   if (form1.tel.value==""){
	   alert("Please Enter Your Telephone Number!")
	   form1.tel.focus();
	   form1.tel.select();
	   form1.tel.style.background='#FFCCCC';
	   return false;
   }      
	
   if (form1.arrivalDate.value==""){
      alert("Please Enter Your Date of Arrival!");
      form1.arrivalDate.focus();
	  form1.arrivalDate.select();
	  form1.arrivalDate.style.background='#FFCCCC';
      return false;	      
   }
   
   if (form1.departureDate.value==""){
      alert("Please Enter Your Date of Departure!");
      form1.departureDate.focus();
	  form1.departureDate.select();
	  form1.departureDate.style.background='#FFCCCC';
      return false;		   
   }
   
   if (form1.email.value==""){
	   alert("Please Enter Your Email Address!")
	   form1.email.focus();
	   form1.email.select();
	   form1.email.style.background='#FFCCCC';
	   return false;
   }         
   
   return true;	
}


