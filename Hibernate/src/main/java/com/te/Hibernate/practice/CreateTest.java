package com.te.Hibernate.practice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CreateTest {

	public static void main(String[] args) {

		EntityManagerFactory factory=Persistence.createEntityManagerFactory("info");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		CreateBean bean=new CreateBean();
		
		bean.setId(2);
		//bean.setName(name);
		
		
		
	}

}
