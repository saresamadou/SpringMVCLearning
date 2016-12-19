<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!-- Adding spring form tag -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create an account</title>
</head>
<body>
	<h1>Enter Account Details</h1>
	<form:form commandName="aNewAccount" action="createAccount">
	First Name: <form:input type="text" path="firstName" name="firstname"/><br/>
	Last Name: <form:input type="text" path="lastName" name="lastname"/><br/>
	Address: <form:input type="text" path="address" name="address"/><br/>
	Email: <form:input type="text" path="email" name="email"/><br/>
	 <input type="submit" name="Create"/>
	</form:form>
</body>
</html>