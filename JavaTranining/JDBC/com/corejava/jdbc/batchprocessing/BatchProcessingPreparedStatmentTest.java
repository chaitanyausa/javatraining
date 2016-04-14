package com.corejava.jdbc.batchprocessing;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcessingPreparedStatmentTest extends GenericMySQLDAO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement stmt = null;

		try {

			connection = getConnection();

			// Create SQL statement
			String sql = "INSERT INTO Employee (id,first_name, last_name, salary) "
					+ "VALUES(?,?,?,?)";

			connection.setAutoCommit(false);

			System.out.println("Creating statement...");
			stmt = connection.prepareStatement(sql);

			// First, let us select all the records and display them.
			printRows(stmt);

			// Set the variables
			stmt.setInt(1, 0006);	
			stmt.setString(2, "Haritha");
			stmt.setString(3, "Singh");
			stmt.setInt(4, 40000);			
			// Add above SQL statement in the batch.
			stmt.addBatch();

			// Set the variables
			stmt.setInt(1, 006);
			stmt.setString(2, "Sunanda");
			stmt.setString(3, "Reddy");
			stmt.setInt(4, 45678);
			stmt.addBatch();			

			// Create an int[] to hold returned values
			int[] count = stmt.executeBatch();

			System.out.println("Result which we got into int array after execution of batch statment :: "+ count.length);

			// Explicitly commit statements to apply changes
			connection.commit();

			// Again, let us select all the records and display them.
			printRows(stmt);

		} catch (Exception e) {

		} finally {
			try {
				closeMethod(stmt);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void printRows(Statement stmt) throws SQLException {
		System.out.println("Displaying available rows...");
		// Let us select all the records and display them.
		String sql = "SELECT id, first_name, last_name, salary FROM Employee";
		ResultSet rs = stmt.executeQuery(sql);
   
		while (rs.next()) {
			// Retrieve by column name
			int id = rs.getInt("id");
			int age = rs.getInt("salary");
			String first = rs.getString("first_name");
			String last = rs.getString("last_name");

			// Display values
			System.out.print("ID: " + id);
			System.out.print(", Salaary: " + age);
			System.out.print(", First Name: " + first);
			System.out.println(", Last Name: " + last);
		}
		System.out.println();
		rs.close();
	}// end printRows()

}
