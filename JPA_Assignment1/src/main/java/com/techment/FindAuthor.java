package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindAuthor {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("conn");
		EntityManager em =  emf.createEntityManager();
		
		//em.getTransaction().begin();
		Author author1= em.find(Author.class, 101);
		Author author2= em.find(Author.class, 102);
		System.out.println("=============Details of Author-1===============");
		System.out.println("Author ID: "+author1.getAuthorId());
		System.out.println("Author First Name: "+author1.getFirstName());
		System.out.println("Author Middle Name: "+author1.getMiddleName());
		System.out.println("Author Last Name: "+author1.getLastName());
		System.out.println("Author Phone Number: "+author1.getPhoneNo());
		
		System.out.println("=============Details of Author-2===============");
		System.out.println("Author ID: "+author2.getAuthorId());
		System.out.println("Author First Name: "+author2.getFirstName());
		System.out.println("Author Middle Name: "+author2.getMiddleName());
		System.out.println("Author Last Name: "+author2.getLastName());
		System.out.println("Author Phone Number: "+author2.getPhoneNo());



	}

}
