package com.te.jdbc.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateS {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/finalass";
			Connection connection=DriverManager.getConnection(dburl, "root", "root");
			String query="update student set name='naveenkumar' where name='naveen'";
			Statement statement=connection.createStatement();
			int result=statement.executeUpdate(query);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		

	}

}
