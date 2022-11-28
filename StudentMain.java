package com.edub;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class StudentMain {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		

		em.getTransaction().begin();	
		
		  Query query = em.createQuery( "update StudentJPA SET fees=8500 where id=2");  
         query.executeUpdate();  

       em.getTransaction().commit();

       
	    Query query1 = em.createQuery( "Select s from StudentJPA s");  
       
       @SuppressWarnings("unchecked")  
     List<StudentJPA> list=(List<StudentJPA>)query1.getResultList( );  
        
       System.out.print("ID");  
       System.out.print("\t Name");  
      System.out.println("\tFees");  
         
         
       for( StudentJPA s:list ){  
          System.out.print( s.getId( ));  
          System.out.print("\t" +  s.getName( ));  
          System.out.print("\t" + s.getFees( ));  
          System.out.println();  
          }  
       em.getTransaction().commit();  
         

		
			
		
		
		}
	}


