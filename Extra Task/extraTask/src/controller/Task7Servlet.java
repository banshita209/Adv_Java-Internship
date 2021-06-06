package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserManager;
import model.User;

/**
 * Servlet implementation class Task7Servlet
 */
@WebServlet("/Task7Servlet")
public class Task7Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Task7Servlet() {
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		System.out.println("Action:" + action);

		if (action.equals("Check Email")) {

			UserManager manager = new UserManager();

			User user = manager.getUserByEmail(request.getParameter("email"));

			if (user != null) {

				request.setAttribute("email", user.getEmail());
				RequestDispatcher dispatcher = request.getRequestDispatcher("Task7_3.jsp");
				dispatcher.forward(request, response);
			} else {
				response.getWriter().append("<h1>Invalid email id try again</h1>");
			}

		} else if (action.equals("Submit Answer")) {
			UserManager manager = new UserManager();

			User user = manager.getUserByEmail(request.getParameter("email"));

			if (user.getQ1().equals(request.getParameter("q1")) && user.getQ2().equals(request.getParameter("q2"))
					&& user.getQ2().equals(request.getParameter("q2"))
					&& user.getQ2().equals(request.getParameter("q2"))) {

				User updateUser = manager.updatePassword(manager.generatePassword(), user.getId());
				if (updateUser != null) {
					response.getWriter().append("<h1>We update your password!!</h1>"
							+ "<h3>Don't forget this time</h3>"
							+ "<h5>Password :"+updateUser.getPassword()+"</h5>");
				} else {
					response.getWriter().append("Oppss... something went wrong try again");
				}
			}

		}
	}

}
