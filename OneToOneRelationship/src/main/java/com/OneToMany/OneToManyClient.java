package com.OneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class OneToManyClient {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("conn");
		EntityManager em =  emf.createEntityManager();
		
		em.getTransaction().begin();
		Course java= new Course(90,"Java",4);
		Course python= new Course(91,"Python",3);
		Course bigdata= new Course(92,"Big Data",6);

		List<Course> courses= new ArrayList<Course>();
		courses.add(java);
		courses.add(python);
		courses.add(bigdata);
		
		em.persist(java);
		em.persist(python);
		em.persist(bigdata);
		
		Student shubham= new Student();
		shubham.setId(1);
		shubham.setName("shikha");
		shubham.setCourse(courses);
		
		em.persist(shubham);
		
	    em.getTransaction().commit();
	}

}
