<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Books Page</title>
</head>
<body>
	<center>
		<h2>ABC BOOK STORE</h2>
		<table border="1">
			<tr>
				<th>BookName</th>
				<th>Author</th>
				<th>Price</th>
			</tr>
			<c:forEach items="${books}" var="book">
				<tr>
					<td>${book.bookName}</td>
					<td>${book.author}</td>
					<td>${book.price}</td>
				</tr>
			</c:forEach>
		</table>
	</center>
</body>
</html>