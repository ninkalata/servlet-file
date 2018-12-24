<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
    
input[type=text], select {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}




input[type=textarea],input[input=text]:focus{
    background-color: #ddd;
    outline: none;
}

/* Overwrite default styles of hr */
hr {
    border: 1px solid #f1f1f1;
    margin-bottom: 25px;
}

/* Set a style for the submit button */
.registerbtn {
    background-color:#008CBA;
    color: white;
    padding: 16px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
    opacity: 0.9;
}

.registerbtn:hover {
    opacity: 1;
}




/* Set a grey background color and center the text of the "sign in" section */
.signin {
    background-color: #f1f1f1;
    text-align: center;
}
div {
    border-radius: 5px;
    background-color: #f2f2f2;
    padding: 20px;
}
</style>

</head>
<body style="background-color:powderblue;">
<center>
<form action="NewUserController" style="width: 500px" method="post" name=myform  onsubmit="myFunction()">
  <div class="container">
  <div class="dropdown">
    <h1>REGISTER FORM</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>

    <!-- <label for="customerId"><b>customerId</b></label>
    <input type="text" placeholder="Enter customerId" name="customerId"  VALUE="1" required>
     -->

    <label for="customerCode"><b>CustomerCode</b></label>
    <input type="text" placeholder="Enter CustomerCode" name="customerCode"   value="<c:out value="${user.customerCode}" />"required />


    <label for="customerName"><b>CustomerName</b></label>
    <input type="text" placeholder="customerName" name="customerName" value="<c:out value="${user.customerName}"/>" required pattern="^[a-zA-Z0-9 ]*$" title="Invalid characters" >
    
    <label for="customerAddress1"><b>CustomerAddress1</b></label>
    <textarea rows="2" cols="60"placeholder="CustomerAddress1" name="customerAddress1"  value="<c:out value="${user.customerAddress1}"/>"required></textarea>
    
    <label for="customerAddress2"><b>CustomerAddress2</b></label>
    <textarea rows="2" cols="60" placeholder="CustomerAddress2" name="customerAddress2" value="<c:out value="${user.customerAddress2}"/>" required></textarea>

    <label for="customerPinCode"><b>customerPinCode</b></label>
    <input type="text" placeholder="CustomerPinCode" name="customerPinCode"  value="<c:out value="${user.customerPinCode}"/>"  pattern=".{6}" title="Pin code should be 6 digits" >
    
    <label for="emailaddress"><b>Emailaddress</b></label>
    <input type="text" placeholder="Emailaddress" name="emailaddress" id= " emailaddress "  value="<c:out value="${user.emailaddress}"/>"   pattern=  "[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" title="Invalid Email format" value="ninkalata@gmail.com" >

    <label for="contactNumber"><b>ContactNumber</b></label>
    <input type="text" placeholder="ContactNumber" name="contactNumber" value="<c:out value="${user.contactNumber}"/>"required>
    
   <label for="primaryContactPerson"><b>PrimaryContactPerson</b></label>
    <input type="text" placeholder="PrimaryContactPerson" name="primaryContactPerson" required value="<c:out value="${user.primaryContactPerson}"/>">
    
    <label for="recordStatus"><b>RecordStatus</b></label>
    <input type="text" placeholder="RecordStatus" name="recordStatus" required Pattern=((?:A)|(?:M)|(?:D)|(?:R)|(?:N)) title="Invalid Record Status" value="<c:out value="${user.recordStatus}"/> "> 
    <P><Strong> NOTE:</Strong>N=New, M=Modified, D=Deleted, A= Authorized, R=Rejected</P>
    
  
    
     <label for="activeInactiveFlag"><b>ActiveInactiveFlag</b></label>
    <select name="activeInactiveFlag" value="<c:out value="${user.activeInactiveFlag}"/>">
      <option value="A">Active</option>
      <option value="I">Inactive</option>
     
    </select>
 
    
    <label for="createDate"><b>CreateDate</b></label>
    <input type="text" name= "createDate" value="<c:out value="${user.createDate}" />">
   
    <script>
    
function myFunction() {
	var date = new Date(); // M-D-YYYY

	var d = date.getDate();
	var m = date.getMonth() + 1;
	var y = date.getFullYear();

	var dateString = (d <= 9 ? '0' + d : d) + '-' + (m <= 9 ? '0' + m : m) + '-' + y;

	document.getElementById("CreateDate").innerHTML = dateString;
}
</script>
  

    <label for="createdBy"><b>CreatedBy</b></label>
    <input type="text" placeholder="CreatedBy" name="createdBy" value="<c:out value="${user.createdBy}"/>" required  pattern="master" title="invalid user id">
    
    <label for="modifiedDate"><b>ModifiedDate</b></label>
    <input type="text" placeholder="DD-MMM-YYYY" name="modifiedDate"  value="<c:out value="${user.modifiedDate}"/>"required VALUE="23/Aug/2010" pattern="^([0-2]?\d|3[0-1])-(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec)-\d{4}" 
title="Enter a date in this format DD-MMM-YYYY">
    
     <label for="modifiedBy"><b>ModifiedBy</b></label>
    <input type="text" placeholder="modifiedBy" name="modifiedBy" value="<c:out value="${user.modifiedBy}"/>"required >
    
    <label for="authorizedDate"><b>AuthorizedDate</b></label>
    <input type="text" placeholder="DD-MMM-YYYY" name="authorizedDate" value="<c:out value="${user.authorizedDate}"/>" required  pattern="^([0-2]?\d|3[0-1])-(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec)-\d{4}" 
title="Enter a date in this format DD-MMM-YYYY">

    <label for="authorizedBy"><b>AuthorizedBy</b></label>
    <input type="text" placeholder="AuthorizedBy" name="authorizedBy" value="<c:out value="${user.authorizedBy}"/>" required >
    
    <hr>
    <hr>
    

    <button type="submit" class="registerbtn">Register</button>
  </div>
  </div>
  </div>

</form>

</center>
</body>
</html>
