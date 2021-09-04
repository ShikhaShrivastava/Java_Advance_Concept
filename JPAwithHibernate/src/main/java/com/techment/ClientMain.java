package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClientMain {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em =  emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Product product = new Product();
		product.setId(1);
		product.setName("Laptop");
		product.setPrice(45000);
		product.setCategory("Electronics");
		
		em.persist(product);
		
		
		em.getTransaction().commit();
		emf.close();
		em.close();
	}

}
