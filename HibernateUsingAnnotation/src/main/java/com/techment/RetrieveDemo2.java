package com.techment;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class RetrieveDemo2 {

	public static void main(String[] args) {
		Configuration configuration= new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory= configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		
		Query<Student> query= session.createQuery("select s.id s.name from Student s");
		List<Student> st= query.list();
		
		System.out.println(st.size());
		System.out.println(st.get(1));
		


		
		session.close();
		sessionFactory.close();
	}
}
