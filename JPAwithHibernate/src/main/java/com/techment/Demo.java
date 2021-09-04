package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("s");
		EntityManager em=emf.createEntityManager();
		
		em.getTransaction().begin();
		Product product = new Product();
		product.setId(1);
		product.setName("Laptop");
		product.setPrice(70000);
		product.setCategory("electronics");
		em.persist(product);	
		em.getTransaction().commit();
		emf.close();
		em.close();
	}

}
