package com.arjun.listner;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class Test1 implements ServletContextListener {

    
    public void contextDestroyed(ServletContextEvent sce)  { 
      
    	System.out.println("context destroy");
    }

	
    public void contextInitialized(ServletContextEvent sce)  { 
        
    	System.out.println("context init");
    	
    }
	
}
