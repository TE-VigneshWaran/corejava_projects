package com.te.jdbc.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadS {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/finalass";
			Connection connection = DriverManager.getConnection(dburl, "root", "root");
			String query = "select * from student";
			java.sql.Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(query);

			while (result.next()) {
				System.out.println("success");
				System.out.println(result.getInt("id"));
				System.out.println(result.getString("name"));
				System.out.println(result.getString("branch"));
			}

		} catch (Exception e) {

		}

	}

}
