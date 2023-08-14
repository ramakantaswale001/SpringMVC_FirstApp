<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>user reg form</h1>
<form action="saveUser" method="get">
<table>
	<tr>
		<td>Fname</td>
		<td><input type="text" name="fname"></td>
	</tr>
	<tr>
		<td>lname</td>
		<td><input type="text" name="lname"></td>
	</tr>
	<tr>
		<td>email</td>
		<td><input type="text" name="email"></td>
	</tr>
	<tr>
		<td>uname</td>
		<td><input type="text" name="uname"></td>
	</tr>
	<tr>
		<td>password</td>
		<td><input type="text" name="password"></td>
	</tr>
	<tr>
		
		<td><input type="submit" value="REGISTER"></td>
	</tr>
</table>
</form>
</body>
</html>