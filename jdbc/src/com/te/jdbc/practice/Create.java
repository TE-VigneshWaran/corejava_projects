package com.te.jdbc.practice;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {

	public static void main(String[] args) throws SQLException {

		try {
			Class.forName("com.mysql.jdbc.Driver");

			String dburl = "jdbc:mysql://localhost:3306/database2";

			java.sql.Connection connection = DriverManager.getConnection(dburl, "root", "root");

			String sql = "insert into student values(2,'bala','ECE')";

			Statement statement = connection.prepareStatement(sql);

			int res = statement.executeUpdate(sql);
			
			System.out.println("successfully Inserted");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
