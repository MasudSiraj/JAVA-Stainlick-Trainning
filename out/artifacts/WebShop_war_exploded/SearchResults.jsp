<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://triveratech.com/webshop" prefix="t" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SearchResults</title>
<link rel="stylesheet" href="css/search.css?v=1"/>
<link rel="stylesheet" href="css/menu.css?v=1"/>
</head>
<body>
<nav>
	<ul>
		<li><a href="Welcome.jsp">Home</a></li>
		<li><a href="SearchForm.jsp">Search</a></li>
	</ul>
	<p>Welcome ${customer.firstName}, Your Cart contains <a href="ShowCart.jsp">${shoppingcart.noOfItemsInCart} items</a></p>
</nav>
    <h1 class="title">Search Results</h1>
    
   <t:forEach items="${result}" var="bluray">
 	<form id="${bluray.id}" method="post" action="AddToCart">
		<fieldset>
		    <input type="hidden" value="${bluray.id}" name="ID"/>
			<div>
				<label>Title: ${bluray.title}</label><br/> 
                <label>Price: ${bluray.price}</label>
				<button class="form_button" type="submit">Add To Cart</button>
			</div>
		</fieldset>
	</form>      
   </t:forEach>
</body>
</html>