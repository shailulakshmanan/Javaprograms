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
		
	
Query q=em.createQuery("delete from StudentJPA where id=1");
q.executeUpdate();
em.getTransaction().commit();
		
		}
	}


