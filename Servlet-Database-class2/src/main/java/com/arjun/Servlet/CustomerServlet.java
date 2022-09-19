package com.arjun.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String firstname= request.getParameter("firstName");
		String lastname= request.getParameter("lastName");
		
		
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		
		//String is immutable in nature we cant append the data
		String[] addr= request.getParameterValues("t1");
		
		//make a StringBuffer object
		StringBuffer buffer= new StringBuffer();
		
		//iterate the string data to string buffer object
		for (String data : addr) {
			buffer.append(data+",");
		}
		
		String caddr=buffer.toString();
		
		
		//database Connnection to connect the servlet To database
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/arjundb","root","@Gill0056");
			PreparedStatement pst=con.prepareStatement("insert into customer values(?,?,?,?,?)");
			pst.setString(1, firstname);
			pst.setString(2,lastname);
			pst.setString(3, email);
			pst.setString(4,mobile);
			pst.setString(5, caddr);
			
			
			int a=pst.executeUpdate();
			if(a==1) {
				out.println("Data inserted successfully....");
				out.println("<a href='DisplayServlet'>Click Here to Display all record</a>");
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
