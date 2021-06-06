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
	<%
		Cookie cookies[] = request.getCookies();
		String result = null, operation = null, numbers = null, oper = null, ans = null;
		for (int i = 0; i < cookies.length; i++) {
			if (cookies[i].getName().equals("result")) {
				result = cookies[i].getValue();
			}
			if (cookies[i].getName().equals("operation")) {
				operation = cookies[i].getValue();
			}
			if (cookies[i].getName().equals("numbers")) {
				numbers = cookies[i].getValue();
			}
			if (cookies[i].getName().equals("ans")) {
				ans = cookies[i].getValue();
			}
			if (cookies[i].getName().equals("oper")) {
				oper = cookies[i].getValue();
			}

		}
	%>
	<h3>
		Numbers are :
		<%=numbers%></h3>
	<h3>
		Result of
		<%=operation%>
		is
		<%=result%></h3>
	<%-- <%
		if (oper != null && ans != null) {
	%>
	<h3>
		Result of
		<%=oper%>
		is
		<%=ans%></h3>
	<%
		}
	%> --%>

	<table align="center" style="padding: 5px;">
		<form action="Task5Servlet" method="post">
		<tr>
			<td>Select an operation:</td>
			<td><select name="operation" required>
					<option selected disabled hidden>Select one operation to
						perform</option>
					<option value="min">Minimum</option>
					<option value="max">Maximum</option>
					<option value="avg">Average</option>
					<option value="fact">Factorial</option>
			</select></td>
		</tr>
		<tr>
			<td><input type="reset" name="action" value="Reset" /></td>
			<td><input type="submit" name="action" value="Find the Answer" /></td>
		</tr>
		</form>
	</table>
</body>
</html>