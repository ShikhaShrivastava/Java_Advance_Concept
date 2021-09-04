package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateAuthor {

	public static void main(String[] args) {
		/*===========Using JPQL===================
		 * EntityManagerFactory emf = Persistence.createEntityManagerFactory( "conn" );  
        EntityManager em = emf.createEntityManager();  
        em.getTransaction().begin( );  
          
        Query query = em.createQuery( "update Author SET phoneNo=7882405694l where authorId=102");  
        query.executeUpdate();  

        em.getTransaction().commit();  
        em.close();  
        emf.close(); 
        */
        
        
        //Using JPA
        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "conn" );  
        EntityManager em = emf.createEntityManager();  
        em.getTransaction().begin( );  
		Author author= em.find(Author.class, 102);
		author.setPhoneNo(7882406694l);
        em.getTransaction().commit();  
        em.close();  
        emf.close();     
       
	}

}
