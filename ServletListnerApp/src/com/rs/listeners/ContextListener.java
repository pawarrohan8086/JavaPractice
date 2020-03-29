package com.rs.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class ContextListener implements javax.servlet.ServletContextListener {

	public void contextInitialized(ServletContextEvent sce)  { 
	       System.out.println("Context Initialized");
	    }
    
    public void contextDestroyed(ServletContextEvent sce)  { 
      System.out.println("context Destroy"); 
    }

	
    
	
}
