package javacode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class table {

	public static void main(String[] args) throws SQLException {
			String jdbcUrl = "jdbc:sqlite:movies.db";
			Connection connection = DriverManager.getConnection(jdbcUrl);
			
			String sql = "create table movies (name varchar(20), actor varchar(20), actress varchar(20), director varchar(20), year of release int)";
			Statement statement = connection.createStatement();
			statement.executeUpdate(sql);
			
			System.out.println("Table created");
			
			
	}

}
