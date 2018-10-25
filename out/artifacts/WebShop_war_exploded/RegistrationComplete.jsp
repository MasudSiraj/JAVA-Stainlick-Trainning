<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Complete</title>
<link rel="stylesheet" href="css/style.css?v=1"/>
</head>
<body>
        <a href="Welcome.jsp">Back to Home</a>
		<fieldset>
			<legend>Registration</legend>
			<div>
				<label>Customer ID: ${customer.customerID}</label> 
			</div>
			<div>
				<label>First Name: ${customer.firstName}</label> 
			</div>
			<div>
				<label>Last Name: ${customer.familyName}</label> 
			</div>
			<div>
				<label>Age: ${customer.customerAge}</label> 
			</div>
			<div>
				<label>Email: ${customer.email} </label> 
			</div>
		</fieldset>
</body>
</html>