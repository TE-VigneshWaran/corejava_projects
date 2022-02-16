package com.te.Hibernate.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.Hibernate.Employee;

public class EmployeeInsert {
	public static void main(String[] args) {
		
		 EntityManagerFactory factory =Persistence.createEntityManagerFactory("test");
		 
		 EntityManager manager =factory.createEntityManager();
		 
		 EntityTransaction transaction =manager.getTransaction();
		 Employee insert = new Employee();
		 
		  insert.setId(1);
		  insert.setName("naveen");
		  insert.setLocation("chennai");
		 
		  transaction.begin();
		  manager.persist(insert);
		  transaction.commit();
		  System.out.println("data insert succesfull");
		
	}

}
