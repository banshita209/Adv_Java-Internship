package com.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

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
			HttpSession session = request.getSession(false);
			Student student = (Student) session.getAttribute("student");

			ComplainManager manager = new ComplainManager();
			ArrayList<Complain> complains = null;
			try {
				complains = manager.findAllComplainsByUserID(student.getId());
			} catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.println(complains.toString());
			request.setAttribute("complains", complains);
			RequestDispatcher dispatcher = request.getRequestDispatcher("AllComplains.jsp");
			dispatcher.forward(request, response);

		} else if (action.equals("edit")) {

			int id = Integer.parseInt(request.getParameter("id"));
			System.out.println("ID:" + id);
			HttpSession session = request.getSession(false);
			Student student = (Student) session.getAttribute("student");

			ComplainManager manager = new ComplainManager();
			Complain complain = null;
			try {
				complain = manager.getComplainsByID(id, student.getId());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				response.sendRedirect("ControllerServlet?action=error");
			}
			System.out.println("complain" + complain.toString());
			request.setAttribute("complain", complain);
			RequestDispatcher dispatcher = request.getRequestDispatcher("editComplain.jsp");
			dispatcher.forward(request, response);
		} else if (action.equals("delete")) {
			int id = Integer.parseInt(request.getParameter("id"));

			System.out.println("id=" + id);
			ComplainManager manager = new ComplainManager();
			boolean isSuccess;
			try {
				isSuccess = manager.deleteComplain(id);
				if (isSuccess) {
					response.sendRedirect("ComplainServlet?action=Show_Complain");
				} else {
					response.sendRedirect("ControllerServlet?action=error");
				}
			} catch (SQLException e) {
				e.printStackTrace();
				response.sendRedirect("ControllerServlet?action=error");
			}
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

		if (action.equals("Submit_Complain") || action.equals("Update_Complain")) {

			Complain complain = new Complain();

			HttpSession session = request.getSession(false);
			Student student = (Student) session.getAttribute("student");

			complain.setTitle(request.getParameter("title"));
			complain.setDescription(request.getParameter("desc"));
			complain.setUser(student.getId());
			complain.setAddress(request.getParameter("address"));
			complain.setContact(Long.parseLong(request.getParameter("contact")));
			complain.setIsActive(true);

			if (action.equals("Submit_Complain")) {

				/******************* submitting the complain ***************************/
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
					e.printStackTrace();
					response.sendRedirect("ControllerServlet?action=error");
				}
			} else if (action.equals("Update_Complain")) {
				/******************* updating the complain ***************************/

				complain.setId(Integer.parseInt(request.getParameter("id")));

				ComplainManager manager = new ComplainManager();
				try {
					boolean isSucess = manager.updateComplain(complain);
					if (isSucess) {
						response.sendRedirect("ComplainServlet?action=Show_Complain");
					} else {
						response.sendRedirect("ControllerServlet?action=error");
					}
				} catch (SQLException e) {
					e.printStackTrace();
					response.sendRedirect("ControllerServlet?action=error");
				}
				System.out.println(complain.toString());
			}
		} else {
			response.sendRedirect("ControllerServlet?action=error");
		}
	}
}
