package com.ManyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManyToOneClient {

	public static void main(String[] args) {
		 EntityManagerFactory emf=Persistence.createEntityManagerFactory("conn");  
         
	        EntityManager em=emf.createEntityManager();  
	          
	        em.getTransaction().begin();  
	          
	        Library lib=new Library();  
	        lib.setLid(1);;  
	        lib.setName("Oxford"); 
	          
	        em.persist(lib);  
	          
	        Student st1=new Student();  
	        st1.setId(101);;  
	        st1.setName("Shikha");  
	        st1.setLibrary(lib); 
	      
	          
	        Student st2=new Student();  
	        st2.setId(102);;  
	        st2.setName("Vivek");  
	        st2.setLibrary(lib);  
	          
	        em.persist(st1);;  
	        em.persist(st2);  
	          
	          
	        em.getTransaction().commit();  
	        em.close();  
	        emf.close();  

	}

}
