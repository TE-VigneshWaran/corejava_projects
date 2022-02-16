package com.te.jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

	public static void main(String[] args) throws SQLException {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/database2";
			Connection connection = DriverManager.getConnection(dburl, "root", "root");
			String query = "update student set name='vignes' where id=1";
			PreparedStatement statement = connection.prepareStatement(query);
			int result = statement.executeUpdate();

			System.out.println(result + "is updated");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

	}

}
