package com.te.Hibernate.crud;

public class Hibernate {

	public static void main(String[] args) {
		// create
		/*
		 * EntityManagerFactory factory =
		 * Persistence.createEntityManagerFactory("info"); EntityManager manager =
		 * factory.createEntityManager(); EntityTransaction transaction =
		 * manager.getTransaction();
		 * 
		 * Student student = new Student(); student.setId(1); student.setName("vicky");
		 * student.setDept("EEE");
		 * 
		 * transaction.begin(); manager.persist(student); transaction.commit();
		 * System.out.println("Successfully inserted");
		 */

		// read

		/*
		 * EntityManagerFactory factory =
		 * Persistence.createEntityManagerFactory("info"); EntityManager manager =
		 * factory.createEntityManager();
		 * 
		 * StudentInfo info = manager.find(StudentInfo.class, 1);
		 * 
		 * if (info != null) { System.out.println(info.getId());
		 * System.out.println(info.getId()); System.out.println(info.getBranch()); }
		 */

		// update

		/*
		 * EntityManagerFactory factory =
		 * Persistence.createEntityManagerFactory("info"); EntityManager manager =
		 * factory.createEntityManager(); EntityTransaction transaction =
		 * manager.getTransaction();
		 * 
		 * Student std = manager.find(Student.class, 1); std.setId(2);
		 * std.setName("vignesh"); std.setDept("EEE");
		 * 
		 * transaction.begin(); manager.persist(std); transaction.commit();
		 * 
		 * System.out.println("Successfully updated");
		 */

		// delete

		/*
		 * EntityManagerFactory factory =
		 * Persistence.createEntityManagerFactory("info"); EntityManager manager =
		 * factory.createEntityManager(); EntityTransaction transaction =
		 * manager.getTransaction();
		 * 
		 * transaction.begin(); String query = "delete student where id=2"; Query que =
		 * manager.createQuery(query); int result = que.executeUpdate();
		 * transaction.commit(); System.out.println("successfully deleted");
		 */
	}

}
