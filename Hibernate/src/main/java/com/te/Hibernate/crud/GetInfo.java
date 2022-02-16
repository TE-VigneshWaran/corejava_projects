package com.te.Hibernate.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.te.Hibernate.Student;

public class GetInfo {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
		EntityManager em = emf.createEntityManager();

		Student info = em.find(Student.class, 3);

		if (info != null) {
			System.out.println(info.getDept());
			System.out.println(info.getId());
			System.out.println(info.getName());
		}
		
		

		try {

			emf.close();
			em.clear();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
