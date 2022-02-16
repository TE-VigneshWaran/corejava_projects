package com.te.Hibernate.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.Hibernate.StudentInfo;

public class CreateS {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("info");
		EntityManager em = emf.createEntityManager();
		StudentInfo insert = new StudentInfo();
		insert.setId(1);
		insert.setName("kanna");
		insert.setBranch("CSE");

		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(insert);
		transaction.commit();
		System.out.println("Data successfully inserted");

	}

}
