package com.te.Hibernate.mappingbean1;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ManyToOne {

	public static void main(String[] args) {

		Address adr1 = new Address();
		adr1.setId(1);
		adr1.setCurentAddress("chennai");
		adr1.setNewAddress("madurai");
		Address adr2 = new Address();
		adr2.setId(2);
		adr2.setCurentAddress("hydrabad");
		adr2.setNewAddress("banglore");

		List<Address> list = new ArrayList<Address>();

		list.add(adr1);
		list.add(adr2);

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("info");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		Primary pri = manager.find(Primary.class, 1);
		pri.setAddress(list);

		transaction.begin();
		manager.persist(pri);
		transaction.commit();

	}

}
