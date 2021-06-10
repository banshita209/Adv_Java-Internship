<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="X-UA-Compatible" content="ie=edge" />
<title>Ahmd Live : Login</title>
<link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400"
	rel="stylesheet" />
<!-- https://fonts.google.com/ -->
<link href="css/bootstrap.min.css" rel="stylesheet" />
<!-- https://getbootstrap.com/ -->
<link href="fontawesome/css/all.min.css" rel="stylesheet" />
<!-- https://fontawesome.com/ -->
<link href="css/templatemo-diagoona.css" rel="stylesheet" />
</head>
<body>
	<div class="tm-container">
		<div>
			<div class="tm-row pt-4">
				<div class="tm-col-left">
					<div class="tm-site-header media">
						<i class="fas fa-archway fa-3x mt-1 tm-logo"></i>
						<div class="media-body">
							<h1 class="tm-sitename text-uppercase">Ahmedabad Live</h1>
							<p class="tm-slogon">Here lies the heart of Ahmedabad</p>
						</div>
					</div>
				</div>
				<div class="tm-col-right">
					<nav class="navbar navbar-expand-lg" id="tm-main-nav">
					<button class="navbar-toggler toggler-example mr-0 ml-auto"
						type="button" data-toggle="collapse" data-target="#navbar-nav"
						aria-controls="navbar-nav" aria-expanded="false"
						aria-label="Toggle navigation">
						<span><i class="fas fa-bars"></i></span>
					</button>

					</nav>
				</div>
			</div>

			<div class="tm-row">
				<div class="tm-col-left"></div>
				<main class="tm-col-right tm-contact-main"> <!-- Content -->
				<section class="tm-content tm-contact">
				<h2 class="mb-4 tm-content-title">Login</h2>

				<form action="ControllerServlet" method="post">

					<div class="form-group mb-4">
						<input type="email" class="form-control" id="email"
							placeholder="Enter email" name="email" required
							pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" />
					</div>
					<div class="form-group mb-4">
						<input type="password" class="form-control" id="pwd"
							placeholder="Enter password" name="pswd" required
							pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" />
					</div>
					<div class="text-right">

						<button type="submit" class="btn btn-big btn-primary"
							name="action" value="Login">Submit</button>
					</div>
					<div class="text-right">
						<p class="mb-0">
							Dont Have Account??? <a href="register.jsp">Register</a>
						</p>
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
				<p class="mb-0">Copyright 2021 | Design: Banshita Gangwar</p>
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