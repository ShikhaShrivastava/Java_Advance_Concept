package com.AssociationAssignment2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.AbstractQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;



public class PriceBetween {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("conn");
		EntityManager em =  emf.createEntityManager();

		em.getTransaction().begin();
		CriteriaBuilder cb=em.getCriteriaBuilder();  

		AbstractQuery<Book> cq1=cb.createQuery(Book.class); 
		   
	       Root<Book> bo=cq1.from(Book.class);   
	       cq1.where(cb.between(bo.get("price"), 500, 1000)) ;  
	       CriteriaQuery<Book> select = ((CriteriaQuery<Book>) cq1).select(bo);  
	       TypedQuery<Book> tq = em.createQuery(select);  
	       List<Book> list = tq.getResultList();
	       System.out.println("**************Price bewtween 500 to 1000 are:****************");
	       for(Book bk :list)  
	  		{  
	  			System.out.println("Book Id: "+bk.getBookId()); 
	  			System.out.println("Title: "+bk.getTitle());
	  			System.out.println("Price: "+bk.getPrice());  


	  		}   
	       
	       em.getTransaction().commit();
			em.close();  
			emf.close();  

	}

}
