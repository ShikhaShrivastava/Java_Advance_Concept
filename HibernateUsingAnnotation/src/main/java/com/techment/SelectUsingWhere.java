package com.techment;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class SelectUsingWhere {

	public static void main(String[] args) {
		Configuration configuration= new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory= configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		
		Query query= session.createQuery("select s from Student s where s.dept=:x");
		query.setParameter("x", "Developer");
		
		List<Student> list=query.getResultList();
		list.forEach(s->System.out.println(s.getId()+" "+s.getName()+" "+s.getDept()));
		
		


		
		session.close();
		sessionFactory.close();
	}

}
