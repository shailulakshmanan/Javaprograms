package com.edub;
		     
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class StudentMain{

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Query query = em.createQuery("delete from Studentjpa where id=1");
		query.executeUpdate();
		System.out.println("Record Deleted");
		Query querySelect = em.createQuery("Select s from Studentjpa s");

		@SuppressWarnings("unchecked")
		List<StudentJPA> list = (List<StudentJPA>) querySelect.getResultList();

		Iterator<StudentJPA> it = list.iterator();
		System.out.println("ID\t  Name\t\tFees");
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
		while (it.hasNext()) {
			StudentJPA sob = it.next();
			// System.out.println(sob.getId() + "\t" + sob.getName() + "\t" +
			//System.out.println(sob.getId()+"\t"+sob.getName()+"\t"+sob.getFees());
        	System.out.printf("%d",sob.getId());
        	System.out.printf("%15s",sob.getName());
        	System.out.printf("\t%f",sob.getFees());
        	System.out.printf("\n");//System.out.println();
        	
        }

		em.getTransaction().commit();

	}

}
