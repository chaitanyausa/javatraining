package com.corejava.jdbc.statments;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeStatmentTest extends GenericMySQLDAO{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection connection = null;
		Statement stmt = null;
		ResultSet rs=null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connection = getConnection();
			
			System.out.println("Creating statement...");
			stmt = connection.createStatement();
			/* Begin : execute() Returns a boolean value of true if a ResultSet object 
			 * can be retrieved; otherwise, it returns false. Use this method to execute SQL DDL statements 
			 * or when you need to use truly dynamic SQL.
			 */ 	
			String sql = "UPDATE Employee set salary=30000 WHERE id=37";
			
			// Let us check if it returns a true Result Set or not.
			/* remove comment to test */
		      Boolean ret = stmt.execute(sql);
		      System.out.println("Return value is : " + ret.toString() );
		      
		   // Let us update age of the record with ID = 103;
		   
			/* remove comment to test
		      int rows = stmt.executeUpdate(sql);
		      System.out.println("Rows impacted : " + rows );
		     */
		   // Let us select all the records and display them.
		      sql = "SELECT id, first_name, last_name, salary FROM Employee";
		      rs = stmt.executeQuery(sql);

		      //STEP 5: Extract data from result set
		      while(rs.next()){
		         //Retrieve by column name
		         int id  = rs.getInt("id");
		         int salary = rs.getInt("salary");
		         String first = rs.getString("first_name");
		         String last = rs.getString("last_name");

		         //Display values
		         System.out.print("ID: " + id);
		         System.out.print(", Salary: " + salary);
		         System.out.print(", First: " + first);
		         System.out.println(", Last: " + last);
		      }
		      
		}catch (Exception e) {
			
		}finally{
			try {
				//closeMethod(stmt);
				closeMethod(rs,stmt);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
