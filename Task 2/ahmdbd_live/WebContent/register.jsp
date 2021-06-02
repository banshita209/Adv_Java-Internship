<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Registeration Page</title>

<link rel="stylesheet" href="style.css" type="text/css" />
<!-- CSS only -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>

<body>
	<div class="jumbotron jumbotron-fluid">
		<div class="container">
			<h1 class="display-4">Registeration</h1>
			<hr class="my-4">
				<p class="lead">Already register???</p>
				<a class="btn btn-seconary btn-small" href="login.jsp" role="button">Login</a>
		</div>
	</div>

	<div class="container">
		<h2>Register form</h2>
		<form class="form-horizontal" action="RegisterServlet" method="post">
			<div class="form-group">
				<label class="control-label col-sm-2" for="name">Full Name:</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="name"
						placeholder="Enter Full Name" name="name" required />
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2" for="cllg">College
					Name:</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="cllg"
						placeholder="Enter College Name" name="cllg" required />
				</div>


			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="branch">Branch:</label>
				<div class="col-sm-10">
					<select class="form-control" name="branch" required>
						<option>Select</option>
						<option value="Information Technology">Information
							Technology</option>
						<option value="Computer">Computer</option>
						<option value="Chemical">Chemical</option>
						<option value="Mechanical">Mechanical</option>
						<option value="Civil">Civil</option>
						<option value="Electronics & Communication">Electronics &
							Communication</option>
						<option value="Electrical">Electrical</option>
						<option value="Bio-Medical">Bio-Medical</option>
					</select>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="sem">Semester:</label>
				<div class="col-sm-10">
					<select class="form-control" name="sem" required>
						<option>Select</option>
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
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="contact">Contact:</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="contact"
						placeholder="Enter Contact No" name="contact" required />
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="email">Email:</label>
				<div class="col-sm-10">
					<input type="email" class="form-control" id="email"
						placeholder="Enter email" name="email" required />
				</div>

			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="pwd">Password:</label>
				<div class="col-sm-10">
					<input type="password" class="form-control" id="pwd"
						placeholder="Enter password" name="pswd" required />
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-primary" name="action"
						value="Register">Submit</button>
				</div>
			</div>
		</form>
	</div>

</body>

</html>