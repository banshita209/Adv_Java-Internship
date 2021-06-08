package com.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.ComplainManager;
import com.model.Complain;
import com.model.Student;

/**
 * Servlet implementation class ComplainServlet
 */
@WebServlet("/ComplainServlet")
public class ComplainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ComplainServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");
		System.out.println("do get: action=" + action);

		if (action.equals("Show_Complain")) {

		} else {
			response.sendRedirect("ControllerServlet?action=error");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		System.out.println("do post: action=" + action);

		if (action.equals("Submit_Complain")) {

			Complain complain = new Complain();

			HttpSession session = request.getSession(false);
			Student student = (Student) session.getAttribute("student");

			complain.setTitle(request.getParameter("title"));
			complain.setDescription(request.getParameter("desc"));
			complain.setUser(student.getId());
			complain.setAddress(request.getParameter("address"));
			complain.setContact(Long.parseLong(request.getParameter("contact")));

			System.out.println(complain.toString());

			ComplainManager manager = new ComplainManager();
			boolean isSuccess;
			try {
				isSuccess = manager.insert(complain);
				if (isSuccess) {
					request.setAttribute("complain", complain);
					RequestDispatcher dispatcher = request.getRequestDispatcher("ShowComplain.jsp");
					dispatcher.forward(request, response);
				} else {
					response.sendRedirect("ControllerServlet?action=error");
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				response.sendRedirect("ControllerServlet?action=error");
			}

		} else {
			response.sendRedirect("ControllerServlet?action=error");
		}
	}

}
