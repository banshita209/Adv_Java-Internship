<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />

</head>
<body>
	<!-- -----------------------------------header-------------------------------------------- -->

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
						href="home.jsp">Home </a></li>
					<li class="nav-item active"><a class="nav-link tm-nav-link"
						href="complain.jsp">Complain </a></li>
					<li class="nav-item active"><a class="nav-link tm-nav-link"
						href="ControllerServlet?action=logout">Logout</a></li>
				</ul>
			</div>
			</nav>
		</div>
	</div>

	<!-- -----------------------------------------scriplettags ------------------------------->
	<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate()");
	%>
	<%
		HttpSession httpSession = request.getSession(false);
		if (httpSession == null) {
			response.sendRedirect("login.jsp");
		}
	%>
</body>
</html>