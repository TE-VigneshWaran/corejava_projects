package com.te.Hibernate.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteS {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("info");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		String query = "delete student where id=1";
		Query que = em.createQuery(query);
		int res = que.executeUpdate();
		transaction.commit();

	}

}
