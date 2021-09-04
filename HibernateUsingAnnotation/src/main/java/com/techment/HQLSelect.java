package com.techment;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQLSelect {

	public static void main(String[] args) {
		Configuration configuration= new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory= configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		
		Query<Student> query= session.createQuery("select s from Student s");
		List<Student> studentlist= query.list();
		System.out.println(studentlist);
		
		System.out.println("=====================================");
		studentlist.forEach(System.out::println);
		System.out.println("=====================================");
		studentlist.forEach(s->System.out.println(s.getId()+" "+s.getName()+" " + s.getDept()));
		
		System.out.println("Select only specific coloumn");
		Query<Student> query2=session.createQuery("select s.id,s.name,s.dept from Student s");
		List<Student> students= query2.list();
		//students.forEach(s->System.out.println(s.getId()+" "+s.getName()+" " + s.getDept()));
		
		Iterator it = students.iterator();

		while(it.hasNext())
		{
			Object o[] = (Object[])it.next();
			System.out.println("Student id : "+o[0]);
			System.out.println("Student Name : "+o[1]);
			System.out.println("Student department : "+o[3]);
			System.out.println("----------------------");
		}		

		session.close();
		sessionFactory.close();
	}

}
