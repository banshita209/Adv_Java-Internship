package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentManagement;
import com.model.Student;

/**
 * Servlet implementation class RegisterServelt
 */
@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControllerServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 * response.getWriter().append("Served at: ").append(request.getContextPath());
		 */
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String action = request.getParameter("action");
		System.out.println("Action : " + action);

		StudentManagement management = new StudentManagement();
		RequestDispatcher dispatcher;

		if (action.equals("Register")) {
			Student student = new Student();

			student.setName(request.getParameter("name"));
			student.setBranch(request.getParameter("branch"));
			student.setCollege(request.getParameter("cllg"));
			student.setContact(Long.parseLong(request.getParameter("contact")));
			student.setEmail(request.getParameter("email"));
			student.setPassword(request.getParameter("pswd"));
			student.setSemester(Integer.parseInt(request.getParameter("sem")));

			System.out.println(student.toString());

			if (student.getName().trim().equals("") || student.getCollege().trim().equals("")
					|| student.getEmail().trim().equals("") || student.getPassword().trim().equals("")) {
				dispatcher = request.getRequestDispatcher("/error.jsp");
				dispatcher.forward(request, response);
			}

			boolean result = management.insert(student);
			System.out.println("Data insertion sucessfull??" + result);

			if (result == true) {
				// response.getWriter().append("<h1>Data Inserted Sucessfully</h1>");
				dispatcher = request.getRequestDispatcher("/login.jsp");
				dispatcher.forward(request, response);
			} else {
				// response.getWriter().append("<h1>Sorry!! Some error occured. Try
				// Again</h1>");
				dispatcher = request.getRequestDispatcher("/error.jsp");
				dispatcher.forward(request, response);
			}

			response.getWriter().append(student.toString());
		}

		else if (action.equals("Login")) {

			String email = request.getParameter("email");
			String pswd = request.getParameter("pswd");

			System.out.println("Email:" + email + " password:" + pswd);

			Student student = management.getStudentbyEmail(email);

			if (student != null && student.getPassword().equals(pswd)) {

				System.out.println(student.toString());
				// response.getWriter().append("<h1>Login sucessfull!!!!</h1>, valid email id
				// and password ");
				request.setAttribute("student", student.getName());
				dispatcher = request.getRequestDispatcher("/home.jsp");
				dispatcher.forward(request, response);
			} else {
				// response.getWriter().append("Invalid email id and password");
				dispatcher = request.getRequestDispatcher("/error.jsp");
				dispatcher.forward(request, response);
			}
		}
	}

}
