package com.te.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/products";
			Connection connection = DriverManager.getConnection(dburl, "root", "root");
			String query = "select * from product_details";
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(query);

			while (result.next()) {
				System.out.println(result.getInt("prod_id"));
				System.out.println(result.getString("prod_name"));
				System.out.println("*******");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
