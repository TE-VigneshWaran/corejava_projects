package com.te.jdbc.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/finalass";
			Connection connection=DriverManager.getConnection(dburl, "root","root");
			String query="delete from student where id=3";
			Statement statement=connection.createStatement();
			int result=statement.executeUpdate(query);		
			System.out.println(result+"No of rows affected");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
