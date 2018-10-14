<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
		<form:form method="post" modelAttribute="addBook" action="/addBook">
		    BookName : <input type="text" name="bookName"/><br><br>
		    Author : <input type="text" name="author"/><br><br>
		    Price : <input type="text" name="price"/><br><br>
		    <input type="submit" value="Add"/><br> 
		</form:form>
</body>
</html>