package com.arjun.listner;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


public class Test2 implements HttpSessionListener {

    public void sessionCreated(HttpSessionEvent se)  { 
        System.out.println("session created..");
    	
    	
    }

	
    public void sessionDestroyed(HttpSessionEvent se)  { 
        
    	System.out.println("session destroyed..");
    	
    }
	
}
