package javacode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sqlitemov {

	public static void main(String[] args) throws SQLException {
			String jdbcUrl = "jdbc:sqlite:mov.db";
			Connection connection = DriverManager.getConnection(jdbcUrl);
			
			String sql = "select * from movies";
			Statement statement = connection.createStatement();
			
			ResultSet result = statement.executeQuery(sql);
			
			while (result.next()) {
				String name = result.getString("name");
				String actor = result.getString("actor");
				String actress = result.getString("actress");
				String director = result.getString("director");
				int year = result.getInt("year");

				
				System.out.println(name + "|" + actor + "|" + actress+ "|" + director+ "|" + year);

			}
			
	}

}
