package com.shrtist;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.shrtist.menu.MenuDriver;
import com.shrtist.userService.UserService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
         
        
        // Build session factory
        SessionFactory factory = cfg.buildSessionFactory();
        
        // Obtain session
        Session session = factory.openSession();
        
        // Begin transaction
        Transaction tx = session.beginTransaction();
        
        // Create Employee object
      
        
        // Save the object
//        session.save(emp);
        
        // Commit transaction
        
       
         
         MenuDriver.Run(session,factory,tx);
          
         
        
        
        
        // Close session and factory
        session.close();
        factory.close();
        
       
    }
}
