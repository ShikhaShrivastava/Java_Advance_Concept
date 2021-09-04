package com.techment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RetrieveMain {

	public static void main(String[] args) {
		Configuration configuration= new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory= configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transcation=session.beginTransaction();
		
		Student student= (Student)session.load(Student.class, new Integer(1));
		System.out.println("Id: "+student.getId()+" Name: "+student.getName());
		transcation.commit();
		
	}

}
