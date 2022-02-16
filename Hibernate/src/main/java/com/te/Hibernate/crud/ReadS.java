package com.te.Hibernate.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.Hibernate.StudentInfo;

public class ReadS {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("info");
		EntityManager em = emf.createEntityManager();

		StudentInfo read = em.find(StudentInfo.class, 1);
		if (read != null) {
			System.out.println(read.getId());
			System.out.println(read.getName());
			System.out.println(read.getBranch());
			System.out.println("data successfully finded");
		}

	}

}
