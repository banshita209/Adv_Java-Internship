package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Student;

/**
 * Servlet implementation class RegisterServelt
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterServlet() {
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

			response.getWriter().append(student.toString());
		}

		else if (action.equals("Login")) {

			String email = request.getParameter("email");
			String pswd = request.getParameter("pswd");
			
			System.out.println("Email:"+email+" password:"+pswd);
			response.getWriter().append("Email:"+email+" password:"+pswd);
		}
	}

}
