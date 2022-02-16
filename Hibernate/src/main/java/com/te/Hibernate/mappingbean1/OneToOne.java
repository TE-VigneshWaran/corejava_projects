package com.te.Hibernate.mappingbean1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OneToOne {

	public static void main(String[] args) {

		Primary primary = new Primary();
		primary.setPId(1);
		primary.setPName("vicky");

		Secondary secondary = new Secondary();
		secondary.setSId(2);
		secondary.setSName("vignesh");

		primary.setSecondary(secondary);

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("info");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		transaction.begin();
		manager.persist(primary);
		transaction.commit();

	}

}
