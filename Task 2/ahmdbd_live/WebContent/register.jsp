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
<style type="text/css">
option{
color: black;
}
</style>
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
				<h2 class="mb-4 tm-content-title">Register</h2>

				<form action="RegisterServlet" method="post">

					<div class="form-group mb-4">
						<input type="text" class="form-control" id="name"
							placeholder="Full Name" name="name" required />
					</div>
					<div class="form-group mb-4">
						<input type="text" class="form-control" id="cllg"
							placeholder="College Name" name="cllg" required />
					</div>
					<div class="form-group mb-4">
						<select class="form-control" name="branch" required>
							<option>Select Branch</option>
							<option value="Information Technology">Information
								Technology</option>
							<option value="Computer">Computer</option>
							<option value="Chemical">Chemical</option>
							<option value="Mechanical">Mechanical</option>
							<option value="Civil">Civil</option>
							<option value="Electronics & Communication">Electronics
								& Communication</option>
							<option value="Electrical">Electrical</option>
							<option value="Bio-Medical">Bio-Medical</option>
						</select>
					</div>
					<div class="form-group mb-4">
						<select class="form-control" name="sem" required>
							<option>Select Semester</option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
							<option value="6">6</option>
							<option value="7">7</option>
							<option value="8">8</option>
						</select>
					</div>
					<div class="form-group mb-4">
						<input type="text" class="form-control" id="contact"
							placeholder="Contact No" name="contact" required />
					</div>
					<div class="form-group mb-4">
						<input type="email" class="form-control" id="email"
							placeholder="Email" name="email" required />
					</div>
					<div class="form-group mb-4">
						<input type="password" class="form-control" id="pwd"
							placeholder="Password" name="pswd" required />
					</div>
					<div class="text-right">

						<button type="submit" class="btn btn-big btn-primary"
							name="action" value="Register">Register</button>
					</div>
					<div class="text-right">
						<p class="mb-0">
							Already Have Account??? <a href="login.jsp">Login</a>
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