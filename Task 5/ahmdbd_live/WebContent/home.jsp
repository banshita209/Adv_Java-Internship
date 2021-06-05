<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@page import="sun.security.util.Length"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="X-UA-Compatible" content="ie=edge" />
<title>Home page</title>
<link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400"
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
					<div class="collapse navbar-collapse tm-nav" id="navbar-nav">
						<ul class="navbar-nav text-uppercase">
							<li class="nav-item active"><a class="nav-link tm-nav-link"
								href="#">Home <span class="sr-only">(current)</span></a></li>
							<li class="nav-item active"><a class="nav-link tm-nav-link"
								href="ControllerServlet?action=logout">Logout</a></li>
						</ul>
					</div>
					</nav>
				</div>
			</div>

			<div class="tm-row">
				<% response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate()");%>
				<div class="tm-col-left"></div>
				<main class="tm-col-right"> <section class="tm-content">
				<h2 class="mb-5 tm-content-title">
					Welcome!!!
					<%=request.getAttribute("student")%></h2>
				<%
					/*--------- fetching session----------- */
					HttpSession httpSession = request.getSession(false);
					Student student = new Student();
					if (httpSession.getAttribute("student") != null) {
						student = (Student) httpSession.getAttribute("student");
					}
					/*--------- fetching cookies----------- */
					String college="";
					Cookie cookies[] = request.getCookies();
					for (int i=0;i<cookies.length;i++) {
						if (cookies[i].getName().equals("college")) {
							college = cookies[i].getValue();
						}
					}
				%>
				<h4 class="mb-5 ">
					fetching your name using session <br> Name: <%=student.getName()%>
				</h4>
				<h4 class="mb-5 ">
					fetching your college name using cookies <br> college: <%=college %>
				</h4>
				<p class="mb-5">This your home page</p>


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