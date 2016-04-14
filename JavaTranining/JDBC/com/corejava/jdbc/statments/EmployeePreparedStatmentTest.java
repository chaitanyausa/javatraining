package com.corejava.jdbc.statments;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeePreparedStatmentTest extends GenericMySQLDAO{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet rs=null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connection = getConnection();
			
			System.out.println("Creating statement...");
			
				
			String sql = "UPDATE Employee set salary=? WHERE id=?";
			 preparedStatement = connection.prepareStatement(sql);
			
			 preparedStatement.setInt(1, 70000);
			 preparedStatement.setInt(2, 45);
			/* remove comment to test */
		      int rows = preparedStatement.executeUpdate();
		      System.out.println("Rows impacted : " + rows );
		     
		   // Let us select all the records and display them.
		      sql = "SELECT id, first_name, last_name, salary FROM Employee";
		      rs = preparedStatement.executeQuery(sql);

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
				closeMethod(rs,preparedStatement);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
