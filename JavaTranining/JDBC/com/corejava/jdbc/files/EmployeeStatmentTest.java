package com.corejava.jdbc.files;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class EmployeeStatmentTest extends GenericMySQLDAO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Statement stmt = null;
		Connection connection = null;
		try {
			
			connection = getConnection();
			// STEP 4: Set auto commit as false.
			
			connection.setAutoCommit(false);

			// STEP 5: Execute a query to delete statment with
			// required arguments for RS example.
			System.out.println("Creating statement...");
			stmt = connection.createStatement();
			// STEP 6: Now list all the available records.
			String sql = "SELECT id, first_name, last_name, salary FROM Employee";
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("List result set for reference....");
			printRs(rs);

			// STEP 7: delete rows having ID grater than 47
			// But save point before doing so.
			Savepoint savepoint1 = connection.setSavepoint("ROWS_DELETED_1");
			System.out.println("Deleting row....");
			String SQL = "DELETE FROM Employee " + "WHERE ID = 47";
			stmt.executeUpdate(SQL);
			
			// oops... we deleted too wrong employees!
			// STEP 8: Roll back the changes after save point 2.
			connection.rollback(savepoint1);

			// STEP 9: delete rows having ID grater than 47
			// But save point before doing so.
			Savepoint savepoint2 = connection.setSavepoint("ROWS_DELETED_2");
			System.out.println("Deleting row....");
			SQL = "DELETE FROM Employee " + "WHERE ID = 48";
			stmt.executeUpdate(SQL);

			// STEP 10: Now list all the available records.
			sql = "SELECT id, first_name, last_name, salary FROM Employee";
			rs = stmt.executeQuery(sql);
			System.out.println("List result set for reference....");
			printRs(rs);

			// STEP 10: Clean-up environment
			rs.close();
			stmt.close();
			connection.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
			// If there is an error then rollback the changes.
			System.out.println("Rolling back data here....");
			try {
				if (connection != null)
					connection.rollback();
			} catch (SQLException se2) {
				se2.printStackTrace();
			}// end try

		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
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

	public static void printRs(ResultSet rs) throws SQLException {
		// Ensure we start with first row
		rs.beforeFirst();
		while (rs.next()) {
			// Retrieve by column name
			int id = rs.getInt("id");
			int age = rs.getInt("salary");
			String first = rs.getString("first_name");
			String last = rs.getString("last_name");

			// Display values
			System.out.print("ID: " + id);
			System.out.print(", Salary: " + age);
			System.out.print(", First Name: " + first);
			System.out.println(", Last Name: " + last);
		}
		System.out.println();
	}// end printRs()

}
