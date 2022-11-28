package com.edub;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.internal.build.AllowSysOut;
import org.hibernate.query.Query;

public class StudentMain {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();	
		
		Query query = (Query) em.createQuery("select name from StudentJPA");
		
		List<String> list = query.getResultList();
		System.out.println("Student Name:");
		for(String s:list) {
			System.out.println(s);
			

	        Iterator<StudentJPA> it=list.iterator();
            System.out.println("ID\t  Name\t\tFees");
	        System.out.println("-----------------------------------------------");
	        
	        while(it.hasNext()) {
	        	StudentJPA sob=it.next();
	        	//System.out.println(sob.getId()+"\t"+sob.getName()+"\t"+sob.getFees());
	        	System.out.printf("%d",sob.getId());
	        	System.out.printf("%15s",sob.getName());
	        	System.out.printf("\t%f",sob.getFees());
	        	System.out.printf("\n");//System.out.println();
	        	
	        }
	        em.getTransaction().commit();
		}
	}
}


