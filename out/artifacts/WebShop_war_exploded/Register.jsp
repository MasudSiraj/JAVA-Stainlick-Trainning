<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<title>Register</title>
<link rel="stylesheet" href="css/style.css?v=1"/>
</head>
<body>

    <span style="color: red;">${error}</span>
	<form id="RegistrationForm" method="post" action="Registration">
		<fieldset>
			<legend>Registration</legend>
			<div>
				<label for="first-name">First Name</label> 
				<input name="first-name" type="text"
				   	   placeholder="First name" value="${customer.firstName}" required autofocus>
			</div>
			<div>
				<label>Last Name</label> 
				<input name="family-name" type="text"
					   placeholder="Last name" value="${customer.familyName}" required>
			</div>
			<div>
				<label>Date of Birth</label> 
				<input name="dateOfBirth" type="text" placeholder="dd/mm/yyyy" pattern="^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\d\d$" required >
			</div>
			<div>
				<label>Email </label> 
				<input name="email" type="email"
					   placeholder="example@domain.com" value="${customer.email}" required>
			</div>
			<div>
				<button class="form_button" type="submit">Register</button>
				<button class="form_button" type="submit" name="command" value="cancel" formnovalidate>Cancel</button>
			</div>
		</fieldset>
	</form>

</body>
</html>