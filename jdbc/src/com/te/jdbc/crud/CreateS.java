package com.te.jdbc.crud;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;

public class CreateS {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String dburl = "jdbc:mysql://localhost:3306/finalass";
		Connection connection = DriverManager.getConnection(dburl, "root", "root");
		String query = "insert into student values(3,'ram','cse')";
		java.sql.Statement statement = connection.createStatement();

		int result = statement.executeUpdate(query);

	}

}
