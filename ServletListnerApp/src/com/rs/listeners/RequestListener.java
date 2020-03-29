package com.rs.listeners;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class RequestListener implements ServletRequestListener {

	 public void requestInitialized(ServletRequestEvent sre)  { 
        
		System.out.println("request recieved"); 
    }
  
    public void requestDestroyed(ServletRequestEvent sre)  { 
        
    	System.out.println("response send Object destroyed");
    }

	
   
	
}
