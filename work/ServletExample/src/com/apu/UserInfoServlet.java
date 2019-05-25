package com.apu;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserInfoServlet
 */
@WebServlet("/UserInfoServlet")
public class UserInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String firstName = request.getParameter("firstName");
		
		PrintWriter out = response.getWriter();
		out.println("<h1>Font size checking </h1>");
		out.print("<div>");
		out.println("<p>" + firstName + "</p>");
		out.println("<p> The p tag defines a paragraph.</p>");
		out.print("</div>");
		
		out.println("<h2>Enumeration getParameterNames(), method returns an enumeration of string objects containing the names of the parameters in this request. </h2>");
		Enumeration<String> paramNames = request.getParameterNames();
		out.println("<div>");
		while (paramNames.hasMoreElements())
		{
			String paramName = paramNames.nextElement();
			String paramValue = request.getParameter(paramName);
			out.println("<p>" + paramName + " : " + paramValue + "</p>");
		}
		out.println("</div>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		System.out.println(" triggered doPost ");
	}

}
