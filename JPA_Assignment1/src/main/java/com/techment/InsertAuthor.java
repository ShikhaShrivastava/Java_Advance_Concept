package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InsertAuthor {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("conn");
		EntityManager em =  emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Author author1=new Author();
		Author author2=new Author();
		
		author1.setAuthorId(103);
		author1.setFirstName("chetan");
		author1.setMiddleName("raj");
		author1.setLastName("bhagat");
		author1.setPhoneNo(7927196064l);
		em.persist(author1);
		
		author2.setAuthorId(104);
		author2.setFirstName("xyz");
		author2.setMiddleName("abc");
		author2.setLastName("www");
		author2.setPhoneNo(9027398665l);
		em.persist(author2);

		
		em.getTransaction().commit();

	}

}
