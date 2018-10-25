<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<title>Search</title>
<link rel="stylesheet" href="css/search.css?v=1"/>
<link rel="stylesheet" href="css/menu.css?v=1"/>
</head>
<body>


<nav>
	<ul>
		<li><a href="Welcome.jsp">Home</a></li>
		<li><a href="Register.jsp">Register</a></li>
	</ul>
	<p>Welcome ${customer.firstName}, Your Cart contains <a href="ShowCart.jsp">${shoppingcart.noOfItemsInCart} items</a></p>
</nav>
    <h1 class="title">Search BluRay discs</h1>
    
    
	<form id="SearchForm" method="post" action="Search">
		<fieldset>
			<legend>Search Bluray</legend>
			<div>
				<label for="title">Title:</label> 
				<input name="title" type="text"
				   	   placeholder="Enter Title" required autofocus>
			</div>
			<div>
				<button class="form_button" type="submit">Search</button>
			</div>
		</fieldset>
	</form>

</body>
</html>