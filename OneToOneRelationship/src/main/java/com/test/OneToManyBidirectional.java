package com.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToManyBidirectional {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("conn");
		EntityManager em =  emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Library library= new Library();
		library.setLname("abc library");
		
		em.persist(library);
		
		Book bk1= new Book();
		bk1.setBname("python");
		bk1.setAuthor("Bala");
		bk1.setLibrary(library);
		
		Book bk2= new Book();
		bk2.setBname("mysql");
		bk2.setAuthor("lenda");
		bk2.setLibrary(library);
		
		em.persist(bk1);

		em.persist(bk2);
		
		System.out.println("*********Inserted************");
		
		
	    em.getTransaction().commit();

	}

}
