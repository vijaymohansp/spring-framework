<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Page</title>
</head>
<body>
	<center>
		<h2>ABC BOOK STORE</h2>
		<font color="red">${error}</font>

		<form:form method="post" modelAttribute="registerForm" action="/registerPage">
		    UserName : <input type="text" name="userName"/><br><br>
		    Password : <input type="password" name="password"/><br><br>
		    Email id : <input type="text" name="email"/><br><br>
		    <input type="submit" value="Register"/> <br><br>
		    
		</form:form>
	</center>
</body>
</html>