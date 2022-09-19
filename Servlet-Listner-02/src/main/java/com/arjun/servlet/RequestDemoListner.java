package com.arjun.servlet;

import javax.servlet.ServletRequestEvent;
public class RequestDemoListner {

	public static int count=0;
	
	public void requestInitialized(ServletRequestEvent e) {
		count++;
		System.out.println("Request Object created at:"+new java.util.Date());
		System.out.println("The hit count for this web application is:"+count);
		
	}
	public void requestDestroyed(ServletRequestEvent e)
	{
		System.out.println("Request Object destroyed:"+new java.util.Date());
	}
}
