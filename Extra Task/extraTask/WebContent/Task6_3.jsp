<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@page import="model.Marks"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body align="center">
	<%
		Marks marks = null;
		HttpSession httpSession = request.getSession(false);
		marks = (Marks) httpSession.getAttribute("marks");
		String status = (String) httpSession.getAttribute("status");
		if (marks == null) {
			response.sendRedirect("Task6Servlet?action=logout");
		}
	%>
	<table align="center">
		<tr>
			<td><img src="asoit.png" alt="logo" /></td>
			<td>Aditya Silver Oak Institute Of technolody</td>
		</tr>
		<tr>
			<td colspan="1">Result</td>
		</tr>
		<tr>
			<td>Name:</td>
			<td><%=marks.getName()%></td>
		</tr>
		<tr>
			<td>Subject 1 :</td>
			<td><%=marks.getS1()%></td>
		</tr>
		<tr>
			<td>Subject 2 :</td>
			<td><%=marks.getS2()%></td>
		</tr>
		<tr>
			<td>Subject 3 :</td>
			<td><%=marks.getS3()%></td>
		</tr>
		<tr>
			<td>Subject 3 :</td>
			<td><%=marks.getS3()%></td>
		</tr>
		<tr>
			<td>Subject 4 :</td>
			<td><%=marks.getS4()%></td>
		</tr>
		<tr>
			<td>Subject 5 :</td>
			<td><%=marks.getS5()%></td>
		</tr>
		<tr>
			<td>Subject 6 :</td>
			<td><%=marks.getS6()%></td>
		</tr>
		<tr>
			<td>Subject 7 :</td>
			<td><%=marks.getS7()%></td>
		</tr>
		<tr>
			<td>Average Marks</td>
			<td><%=marks.getAvg()%></td>
		</tr>
		<tr>
			<td>Percentage</td>
			<td><%=marks.getPercentage()%></td>
		</tr>
		<tr>
			<td>Pass or Fail!!</td>
			<td><%=status%></td>
		</tr>
		<tr>

			<td colspan="1"><a href="Task6Servlet?action=logout">Logout</a></td>
		</tr>
	</table>
</body>
</html>