package com.rs.listeners;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


@WebListener
public class SessionListener implements HttpSessionListener {

 
    public void sessionCreated(HttpSessionEvent se)  { 
    	System.out.println("Session  Created");
    }

	
    public void sessionDestroyed(HttpSessionEvent se)  { 
    	System.out.println("Session Destroyed");
    }
	
}
