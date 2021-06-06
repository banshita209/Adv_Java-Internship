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
	<h1>Task 5</h1>
	<table align="center">
		<form action="Task5Servlet" method="post">
			<h2>Enter the following details</h2>
			<tr>
				<td>Number 1 :</td>
				<td><input type="text" name="n1" placeholder="Enter a value"
					required pattern="^[1-9]\d*$" /></td>
			</tr>
			<tr>
				<td>Number 2 :</td>
				<td><input type="text" name="n2" placeholder="Enter a value"
					required pattern="^[1-9]\d*$" /></td>
			</tr>
			<tr>
				<td>Number 3 :</td>
				<td><input type="text" name="n3" placeholder="Enter a value"
					required pattern="^[1-9]\d*$" /></td>
			</tr>
			<tr>
				<td>Number 4 :</td>
				<td><input type="text" name="n4" placeholder="Enter a value"
					required pattern="^[1-9]\d*$" /></td>
			</tr>
			<tr>
				<td>Number 5 :</td>
				<td><input type="text" name="n5" placeholder="Enter a value"
					required pattern="^[1-9]\d*$" /></td>
			</tr>
			<tr>
				<td>Operation name </br> (choice: add, sub, mul, div) :
				</td>
				<td><input type="text" name="operation"
					placeholder="Enter a value" required /></td>
			</tr>
			<tr>
				<td><input type="reset" name="action" value="Reset" /></td>
				<td><button type="submit" name="action" value="Calculate">Find
						the Answer</button></td>
			</tr>
		</form>
	</table>
</body>
</html>