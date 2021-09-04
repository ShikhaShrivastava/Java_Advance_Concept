package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteAuthor {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory( "conn" );  
        EntityManager em = emf.createEntityManager();  
        em.getTransaction().begin( );  
		Author author= em.find(Author.class, 104);
		em.remove(author);
        em.getTransaction().commit();  
        em.close();  
        emf.close();    

	}

}
