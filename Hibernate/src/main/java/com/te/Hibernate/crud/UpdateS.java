package com.te.Hibernate.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.Hibernate.StudentInfo;

public class UpdateS {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("info");
		EntityManager em = emf.createEntityManager();

		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		StudentInfo update = em.find(StudentInfo.class, 1);
		System.out.println("Successfully updated");
		update.setName("amjath");
		update.setBranch("mech");
		transaction.commit();
	}

}
