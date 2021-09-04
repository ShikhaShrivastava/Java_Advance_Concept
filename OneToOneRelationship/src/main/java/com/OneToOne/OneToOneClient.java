package com.OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneClient {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("conn");
		EntityManager em =  emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Address address= new Address();
		address.setDoorNo(1001);
		address.setStreetName("Koramangala");
		address.setCity("Banglore");
		
		Employee employee= new Employee();
		employee.setId(1);
		employee.setName("Shikha");
		employee.setDesignation("Developer");
		employee.setAddress(address);
		
		em.persist(address);
		em.persist(employee);
		em.getTransaction().commit();

	}

}