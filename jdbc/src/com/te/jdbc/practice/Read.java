package com.te.jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Read {

	public static void main(String[] args) throws SQLException {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/database2";
			Connection connection = DriverManager.getConnection(dburl, "root", "root");
			String query = "select * from student";
			Statement statement = connection.createStatement();
			ResultSet set = statement.executeQuery(query);

			while (set.next()) {
				System.out.println(set.getInt("id"));
				System.out.println(set.getString("name"));
				System.out.println(set.getString("branch"));
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
