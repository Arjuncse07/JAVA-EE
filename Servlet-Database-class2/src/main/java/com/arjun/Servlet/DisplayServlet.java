package com.arjun.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayServlet
 */
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/arjundb","root","@Gill0056");
			
			Statement st=con.createStatement();
			
			ResultSet rs =st.executeQuery("select * from customer");
			
			out.println("<b><p>FirstName LastName Email Mobile Address</p></b><br>");
			while(rs.next()) {
				out.println(rs.getString(1)+ "   " +rs.getString(2)+"    "+rs.getString(3)+"    "+rs.getString(4)+"    "+rs.getString(5));
				out.println("<br>");
			}
			out.println("<a href='customer.html'>Click here to Add records..</a>");
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}


}
