package com.AssociationAssignment2;

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
		Book java= new Book(1,"Java",350);
		Book python= new Book(2,"Python",500);
		Book mysql= new Book(3,"MySql",600);
		
		List<Book>books= new ArrayList<Book>();
		books.add(java);
		books.add(python);
		books.add(mysql);
		
		em.persist(java);
		em.persist(python);
		em.persist(mysql);
		
		Author author= new Author();
		author.setId(101);
		author.setName("Michael");
		author.setBooks(books);
		
		em.persist(author);
		
		
	    em.getTransaction().commit();

	}

}
