<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="X-UA-Compatible" content="ie=edge" />
<title>Ahm : live</title>
<link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400"
	rel="stylesheet" />
<!-- https://fonts.google.com/ -->
<link href="css/bootstrap.min.css" rel="stylesheet" />
<!-- https://getbootstrap.com/ -->
<link href="fontawesome/css/all.min.css" rel="stylesheet" />
<!-- https://fontawesome.com/ -->
<link href="css/templatemo-diagoona.css" rel="stylesheet" />
<style>
table, tr, td {
	color: #ffff;
}

a {
	color: #ffff;
	text-decoration: underline;
}

a:hover {
	color: #f0f0f0;
}
</style>
</head>

<body>
	<div class="tm-container">
		<div>
			<jsp:include page="header.jsp" />
			<div class="tm-row">
				<div class="tm-col-left"></div>
				<main class="tm-col-right"> <section class="tm-content">
				<h2 class="mb-5 tm-content-title text-center">All Complain</h2>
				<table class="table table-borderless"
					style="margin: 5px; padding: 5px;">
					<%
						int count = 0;
					%>
					<thead class=".thead-light">
						<tr>
							<td scope="col">ID</td>
							<td scope="col">TITLE</td>
							<td scope="col">COMPLAIN DESCRIPTION</td>
							<td scope="col">CONTACT</td>
							<td scope="col">ADDRESS</td>
							<td scope="col">EDIT</td>
							<td scope="col">DELETE</td>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="complain" items="${complains}">
							<tr>
								<td><%=count += 1%></td>
								<td>${complain.title}</td>
								<td>${complain.description}</td>
								<td>${complain.contact}</td>
								<td>${complain.address}</td>
								<td><a href="ComplainServlet?action=edit&id="
									${complain.id}>Edit</a></td>
								<td><a href="ComplainServlet?action=update&id="${complain.id}">Delete</a></td>
							</tr>
						</c:forEach>


					</tbody>

				</table>

				</section> </main>
			</div>
		</div>

		<div class="tm-row">
			<div class="tm-col-left text-center">
				<ul class="tm-bg-controls-wrapper">
					<li class="tm-bg-control active" data-id="0"></li>
					<li class="tm-bg-control" data-id="1"></li>
					<li class="tm-bg-control" data-id="2"></li>
				</ul>
			</div>
			<div class="tm-col-right tm-col-footer">
				<footer class="tm-site-footer text-right">
				<p class="mb-0">Copyright 2021 | Design:Banshita Gangwar</p>
				</footer>
			</div>
		</div>

		<!-- Diagonal background design -->
		<div class="tm-bg">
			<div class="tm-bg-left"></div>
			<div class="tm-bg-right"></div>
		</div>
	</div>

	<script src="js/jquery-3.4.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.backstretch.min.js"></script>
	<script src="js/templatemo-script.js"></script>
</body>
</html>