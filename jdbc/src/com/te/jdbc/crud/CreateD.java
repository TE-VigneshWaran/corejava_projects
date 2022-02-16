package com.te.jdbc.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CreateD {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/finalass";
			Connection connection=DriverManager.getConnection(dburl, "root", "root");
			String query="select * from student where id=?";
			Statement statement=connection.createStatement();
			ResultSet set=statement.executeQuery(query);
			while(set.next()) {
				System.out.println(set.getString("name"));
				System.out.println(set.getString("branch"));
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
