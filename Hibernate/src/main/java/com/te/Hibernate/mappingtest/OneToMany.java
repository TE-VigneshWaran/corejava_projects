package com.te.Hibernate.mappingtest;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import com.te.Hibernate.mappingbean.Address;
import com.te.Hibernate.mappingbean.Primary;

public class OneToMany {

	public static void main(String[] args) {

		Address address1 = new Address();
		address1.setId(1);
		address1.setCurrentAddress("chennai");
		address1.setPermanantAddress("madurai");

		Address address2 = new Address();
		address2.setId(2);
		address2.setCurrentAddress("banglore");
		address2.setPermanantAddress("trichi");

		List<Address> list = new ArrayList();
		list.add(address1);
		list.add(address2);

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mapping");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		Primary primary = manager.find(Primary.class, 1);

		primary.setAddress(list);

		transaction.begin();

		manager.persist(primary);

		transaction.commit();

		System.out.println("Inserted Successfully");

	}

}
