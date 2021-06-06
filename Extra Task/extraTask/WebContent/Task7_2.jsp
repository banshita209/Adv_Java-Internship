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
	<h3>Forget Password</h3>
	<h5>Oppss!! you forgot your password.. No wories we will help you</h5>
	<table align="center">
		<form action="Task7Servlet" method="post">
			<tr>
				<td>Enter Email :</td>
				<td><input type="text" name="email" required /></td>
			</tr>			<tr>
				<td></td>
				<td><Button type="submit" name="action" value="Check Email" >Submit</Button></td>
			</tr>
		</form>
	</table>
</body>
</html>