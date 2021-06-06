<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body align="center">
	<h1>Task 7</h1>
	<h3>Register</h3>
	<table align="center" style="text-align: center;">
		<form action="Task7Servlet" method="post">
			<tr>

				<td><input type="hidden" name="email" value="<%=request.getParameter("email") %>"/></td>
			</tr>
		<td colspan="1">Answer these question :</td>
		</tr>
		<tr>
			<td>How is your Favorite Teacher? :</td>
			<td><input type="text" name="q1" required /></td>
		</tr>
		<tr>
			<td>Name one monument you want to visit :</td>
			<td><input type="text" name="q2" required /></td>
		</tr>
		<tr>
			<td>Name the place where you were born :</td>
			<td><input type="text" name="q3" required /></td>
		</tr>
		<tr>
			<td>Your favorite book :</td>
			<td><input type="text" name="q4" required /></td>
		</tr>
		<tr colspan="2">

			<td><input type="submit" name="action" value="Submit Answer" /></td>
		</tr>
		</form>
	</table>
</body>
</html>