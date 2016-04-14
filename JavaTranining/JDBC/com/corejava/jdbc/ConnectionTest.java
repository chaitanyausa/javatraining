package com.corejava.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ConnectionTest {

	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "org.gjt.mm.mysql.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/test";
	
	

	// <code> jdbc:<em>subprotocol</em>:<em>subname</em></code>
	// Please provide your DB credentials here
	static final String USER = "root"; //
	static final String PASS = "root";

	//jdbc:mysql://localhost:3306/HerongDB?user=Herong&password=TopSecret
	static final String DB_URL_COMPLETE =  DB_URL+"?user="+USER+"&password="+PASS;
	
	public static void main(String[] args) {
		
		Connection connection = null;
		Statement statement = null;
		
		Properties properties = new Properties();
		// you can use put also
		properties.setProperty("user", USER);
		properties.setProperty("password", PASS);
		
		try {
			// STEP 2: Register JDBC driver
			Class.forName("org.gjt.mm.mysql.Driver");

			// STEP 3: Open a connection
			System.out.println("Connecting to database...");			
			connection = DriverManager.getConnection(DB_URL, USER, PASS);
			
			/* Another way of sending the credentials*/
			//connection = DriverManager.getConnection(DB_URL, properties);
			//connection = DriverManager.getConnection(DB_URL_Complete);
			

			// STEP 4: Execute a query
			System.out.println("Creating statement...");
			statement = connection.createStatement();
			//DatabaseMetaData metaData = connection.getMetaData();
			
			
			String sql = "SELECT id, first_name, last_name, sal FROM emp";
			ResultSet rs = statement.executeQuery(sql);
			
		
			
			//statement.execu
			//statement.execute(sql)
			//
			//statement.executeUpdate(sql);
			
			//statement.executeQuery(sql);
			
			
			
			

			// STEP 5: Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				int id = rs.getInt("id");
				int salary = rs.getInt("sal");
				String first = rs.getString("first_name");
				String last = rs.getString("last_name");
				
				
				// Display values
				System.out.print("ID: " + id);
				System.out.print(", Salary: " + salary);
				System.out.print(", First: " + first);
				System.out.println(", Last: " + last);
				
				
			}
			// STEP 6: Clean-up environment
			rs.close();
			statement.close();
			connection.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (statement != null)
					statement.close();
			} catch (SQLException se2) {
			}// nothing we can do
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}// end finally try
		}// end try
		System.out.println("Goodbye!");
	}// end main

}
