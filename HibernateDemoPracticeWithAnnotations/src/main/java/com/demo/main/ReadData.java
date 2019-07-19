package com.demo.main;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.model.User;

public class ReadData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		Query query=session.createQuery("from User");
		List<User> list=query.list();
		for(User user:list) {
			System.out.println(user);
		}
		session.close();
	}

}
