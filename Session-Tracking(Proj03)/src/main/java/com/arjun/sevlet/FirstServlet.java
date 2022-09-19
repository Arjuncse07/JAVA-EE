package com.arjun.sevlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   public FirstServlet(){
	   //default constructor
   }
	
	@SuppressWarnings("deprecation")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String uage=request.getParameter("uage");
		
		HttpSession session=request.getSession();
		session.setAttribute("username", username);
		session.setAttribute("uage", uage);
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		out.println("<html>");
		out.println("<body bgcolor='aqua'>");
		out.println("<form method='post' action="+response.encodeUrl("./SecondServlet")+">");
		out.println("<br>");
		out.println("user qualification :<input type='text' name='uqual'/>");
		out.println("<br>");
		out.println("user degination :<input type='text' name='udesig'/>");
		out.println("<br>");
		out.println("<input type='submit' value='Submit' />");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		
		
	}

}
