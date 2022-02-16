package com.te.jdbc;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import com.mysql.jdbc.Statement;

public class Test {

	public static void main(String[] args) throws SQLException {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String dburl = "jdbc:mysql://localhost:3306/student?user=root&&password=root";

			java.sql.Connection connection = DriverManager.getConnection(dburl);
			String str = "select name from student where id= ?";
			/*
			 * java.sql.Statement statement = connection.createStatement(); ResultSet
			 * set=statement.executeQuery(str);
			 */

			PreparedStatement statement = connection.prepareStatement(str);
			int result = statement.executeUpdate();

			System.out.println(result);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
