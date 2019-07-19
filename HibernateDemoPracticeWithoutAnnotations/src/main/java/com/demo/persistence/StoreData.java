package com.demo.persistence;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory(); 
		Session session=factory.openSession();
		
		User user1=new User("John Nash",67,8973.34);
		User user2=new User("sarah cornor",34,4544.21);
		User user3=new User("john cornnor",17,5683.34);

		Transaction t=session.beginTransaction();
		session.persist(user1);
		session.persist(user2);
		session.persist(user3);
		System.out.println("saved");
		t.commit();
		session.close();
	}

}
