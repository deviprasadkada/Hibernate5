package com.demo.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.User;

public class StoreData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		
		User user1=new User("JOhn Sith",23,3455.56);
		User user2=new User("Prasad kada",25,2345.56);
		User user3=new User("jack slater",38,377.56);
		
		Transaction t=session.beginTransaction();
		session.persist(user1);
		session.persist(user2);
		session.persist(user3);
		System.out.println("saved");
		t.commit();
		session.close();
	}

}
