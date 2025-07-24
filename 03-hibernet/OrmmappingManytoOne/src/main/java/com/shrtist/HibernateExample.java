package com.shrtist;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateExample {
    public static void main(String[] args) {
        // Create SessionFactory
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        // Open a session
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

         

          // first we will create the adrress object 
        
          Address address=new Address(1,"Noida");
          EmployeeAd emp1=new EmployeeAd();
            
           
          
         
           session.save(emp2);
           
          
           

       
        // Commit the transaction
        transaction.commit();

        

        // Close session and factory
        session.close();
        sessionFactory.close();
        System.out.println("employee added sucessfully");
    }
}
