package javacode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class row {

	public static void main(String[] args) throws SQLException {
			String jdbcUrl = "jdbc:sqlite:movies.db";
			Connection connection = DriverManager.getConnection(jdbcUrl);
			
			String sql = "insert into movies values ('A Beautiful Mind', 'Russell Crowe', 'Jennifer Connelly', 'Ron Howard', '2001')";
			Statement statement = connection.createStatement();
			int rows = statement.executeUpdate(sql);
			if(rows>0) {
			System.out.println("A row created");
			}
			
	}

}
