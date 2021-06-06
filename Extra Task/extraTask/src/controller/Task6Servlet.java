package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Task6Manager;
import model.Marks;
import model.Student;

/**
 * Servlet implementation class Task6Servlet
 */
@WebServlet("/Task6Servlet")
public class Task6Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Task6Servlet() {
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
		String action = request.getParameter("action");
		System.out.println("Action:" + action);

		if (action.equals("logout")) {
			HttpSession session = request.getSession(false);
			session.invalidate();
			response.sendRedirect("Task6.jsp");
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
		System.out.println("Action:" + action);

		if (action.equals("login")) {

			String email = request.getParameter("email");
			String password = request.getParameter("password");
			Task6Manager manager = new Task6Manager();
			Student student = manager.getUserByEmail(email);
			if (student != null) {
				System.out.println(student.toString());

				if (student.getPassword().equals(password)) {
					HttpSession session = request.getSession();
					session.setAttribute("object", "student");

					response.sendRedirect("Task6_1.jsp");
				} else {
					response.getWriter().append("Invalid email id or password");
				}
			} else {
				response.getWriter().append("Oppss... something went wrong try again");
			}
		} else if (action.equals("Calculate Result")) {

			Marks marks = new Marks();

			marks.setName(request.getParameter("name"));
			marks.setS1(Integer.parseInt(request.getParameter("s1")));
			marks.setS2(Integer.parseInt(request.getParameter("s2")));
			marks.setS3(Integer.parseInt(request.getParameter("s3")));
			marks.setS4(Integer.parseInt(request.getParameter("s4")));
			marks.setS5(Integer.parseInt(request.getParameter("s5")));
			marks.setS6(Integer.parseInt(request.getParameter("s6")));
			marks.setS7(Integer.parseInt(request.getParameter("s7")));

			// calculating percentage and avg
			marks.setAvg();
			marks.setPercentage();
			
			System.out.println(marks.toString());
			Task6Manager manager = new Task6Manager();
			boolean isSucess = manager.insert(marks);
			if (isSucess) {
				HttpSession session = request.getSession(false);
				session.setAttribute("marks", marks);
				session.setAttribute("status", new Task6Manager().checkPassOrNot(marks));
				response.sendRedirect("Task6_3.jsp");
			} else {
				response.getWriter().append("Oppss... something went wrong try again");
			}
		}
	}

}
