<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta http-equiv="X-UA-Compatible" content="ie=edge">
			<title>Ahm live: Raise complain</title>
			<link
				href="https://fonts.googleapis.com/css?family=Open+Sans:300,400"
				rel="stylesheet" />
			<!-- https://fonts.google.com/ -->
			<link href="css/bootstrap.min.css" rel="stylesheet" />
			<!-- https://getbootstrap.com/ -->
			<link href="fontawesome/css/all.min.css" rel="stylesheet" />
			<!-- https://fontawesome.com/ -->
			<link href="css/templatemo-diagoona.css" rel="stylesheet" />
			<!--

TemplateMo 550 Diagoona

https://templatemo.com/tm-550-diagoona

-->
</head>
<body>
	<div class="tm-container">
		<div>
			<jsp:include page="header.jsp" />

			<div class="tm-row">
				<div class="tm-col-left"></div>
				<main class="tm-col-right tm-contact-main"> <!-- Content -->
				<section class="tm-content tm-contact">
				<h2 class="mb-4 tm-content-title">Write your complain here</h2>
				<p class="mb-85">We will hear you</p>
				<form id="contact-form" action="ComplainServlet" method="post">
					<div class="form-group mb-4">
						<input type="text" name="title" class="form-control"
							placeholder=Title of Complain" required="" />
					</div>

					<div class="form-group mb-5">
						<textarea rows="5" name="desc" class="form-control"
							placeholder="Write your complain here..." required=""></textarea>
					</div>

					<div class="form-group mb-4">
						<input type="text" name="contact" class="form-control"
							placeholder="contact number" required="" />
					</div>
					<div class="form-group mb-5">
						<textarea rows="4" name="address" class="form-control"
							placeholder="Your Address..." required=""></textarea>
					</div>

					<div class="text-right">
						<button type="submit" class="btn btn-big btn-primary"
							name="action" value="Submit_Complain">Send It</button>
					</div>
				</form>
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
				<p class="mb-0">Copyright 2021 Design: Banshita Gangwar</p>
				</footer>
			</div>
		</div>

		<div class="tm-bg">
			<!-- Diagonal background design -->
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