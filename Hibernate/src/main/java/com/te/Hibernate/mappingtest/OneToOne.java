package com.te.Hibernate.mappingtest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.Hibernate.mappingbean.Primary;
import com.te.Hibernate.mappingbean.Secondary;

public class OneToOne {

	public static void main(String[] args) {
		Primary primary = new Primary();

		primary.setPId(1);
		primary.setPName("vicky");

		Secondary secondary = new Secondary();

		secondary.setSId(10);
		secondary.setSName("jevitha");
		secondary.setSAddress("trichi");

		primary.setSecondary(secondary);

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mapping");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		transaction.begin();
		manager.persist(secondary);
		transaction.commit();

	}

}
