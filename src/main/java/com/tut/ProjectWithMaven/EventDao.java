package com.tut.ProjectWithMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EventDao {
	
	public static void createEvent(Event event) {
		 Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        
	        SessionFactory factory = cfg.buildSessionFactory();
//	        SessionFactory factory = new Configuration().configure().buildSessionFactory();
	        
	        System.out.println(factory);
	        
	        System.out.println(factory.isClosed());

//	        create event
	        
	        Session session = factory.openSession();
	        
	        Transaction tx =  session.beginTransaction();

	        session.save(event);
	        tx.commit();
	        
	        session.close();
	}
	
	public void deleteEvent() {
			
	}
	
	public void updateEvent() {
		
	}	

}
