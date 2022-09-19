package com.arjun.servlet.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final String userId = "Amit";
	private final String password = "@Gill0056";

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get request parameters for userId and password
		
      String user=request.getParameter("user");
      String pwd= request.getParameter("pwd");
      
      if (userId.equals(user) && password.equals(pwd)) {
		Cookie loginCookie= new Cookie("user",user);
		//setting cookie to expire in 30 mins
		loginCookie.setMaxAge(30*60);
		response.addCookie(loginCookie);
		response.sendRedirect("LoginSuccess.jsp");
	}else {
		RequestDispatcher rd= getServletContext().getRequestDispatcher("/login.html");
		
		PrintWriter out= response.getWriter();
		out.println("<font color=red>Either user name or password si incorrect </font>");
		
		rd.include(request, response);
	}
	}

}
