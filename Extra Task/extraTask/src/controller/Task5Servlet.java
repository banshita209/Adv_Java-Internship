package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Numbers;

/**
 * Servlet implementation class Task4Servlet
 */
@WebServlet("/Task5Servlet")
public class Task5Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Task5Servlet() {
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
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		// deleteSessionCookies(request, response);
		response.sendRedirect("Task5.jsp");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		System.out.println("Action : " + action);
		if (action.equals("Calculate")) {

			Numbers numbers = new Numbers(request.getParameter("n1"), request.getParameter("n2"),
					request.getParameter("n3"), request.getParameter("n4"), request.getParameter("n5"));

			float result = 0;

			String operation = request.getParameter("operation").toLowerCase();
			System.out.println("Operation:" + operation);

			if (operation.equals("addition") || operation.equals("add")) {
				result = numbers.addAll();
			} else if (operation.equals("substraction") || operation.equals("sub")) {
				result = numbers.subAll();
			} else if (operation.equals("multiplication") || operation.equals("mul")) {
				result = numbers.mulAll();
			} else if (operation.equals("division") || operation.equals("div")) {
				result = numbers.divAll();
			} else {
				deleteSessionCookies(request, response);
				response.getWriter().append("<h1>Something went wrong try again!!!</h1>");
			}

			System.out.println("result:" + result);

			Cookie resultCookie = new Cookie("result", Float.toString(result));
			Cookie operationCookie = new Cookie("operation", operation);
			System.out.println("numbers.getstring=" + numbers.getString());
			Cookie numbersCookie = new Cookie("numbers", numbers.getString());

			response.addCookie(resultCookie);
			response.addCookie(operationCookie);
			response.addCookie(numbersCookie);

			HttpSession session = request.getSession();
			session.setAttribute("numbers", numbers);
			RequestDispatcher dispatcher = request.getRequestDispatcher("Task5_1.jsp");
			dispatcher.forward(request, response);

		} else if (action.equals("Find the Answer")) {
			HttpSession session = request.getSession(false);
			Numbers numbers = (Numbers) session.getAttribute("numbers");

			if (numbers != null) {
				String operation = request.getParameter("operation");
				System.out.println("Operation:" + operation);
				Cookie cookie = null;
				String ans = null;
				switch (operation) {
				case "max":
					ans = String.valueOf(numbers.findMax());

					break;
				case "min":
					ans = String.valueOf(numbers.findMin());
					break;
				case "avg":
					ans = String.valueOf(numbers.findAvg());
					break;

				case "fact":
					ans = numbers.findFactorial();
					break;
				}

				response.getWriter().append(
						"<h1>" + numbers.getString() + "<h1><h2>Answer of " + operation + " is : " + ans + "</h2>");


			} else {
				deleteSessionCookies(request, response);
				response.getWriter().append("<h1>Something went wrong try again!!!</h1>");
			}
		}

		else {
			deleteSessionCookies(request, response);
			response.getWriter().append("<h1>Something went wrong try again!!!</h1>");
		}
	}

	private void deleteSessionCookies(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();

		session.setAttribute("numbers", null);
		session.invalidate();

		Cookie[] cookies = request.getCookies();

		for (Cookie cookie : cookies) {
			cookie.setValue("null");
			cookie.setMaxAge(0);
			response.addCookie(cookie);
		}
	}

}
