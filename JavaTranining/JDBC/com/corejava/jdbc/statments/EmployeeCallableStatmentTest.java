package com.corejava.jdbc.statments;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeCallableStatmentTest extends GenericMySQLDAO{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection connection = null;
		CallableStatement stmt = null;
		ResultSet rs=null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connection = getConnection();
			
			System.out.println("Creating statement...");
			
			
			
		   // Let us select all the records and display them.
		     String sql = "{call getEmpName (?, ?)}";
		     
		     stmt = connection.prepareCall(sql);
		     stmt.setInt(1, 47);
		     // Because second parameter is OUT so register it
		     stmt.registerOutParameter(2, java.sql.Types.VARCHAR);    
		      

		      // Because second parameter is OUT so register it
		    //  stmt.registerOutParameter(2, java.sql.Types.VARCHAR);
		      
		      //Use execute method to run stored procedure.
		      System.out.println("Executing stored procedure..." );
		      stmt.execute();

		      //Retrieve employee name with getXXX method
		      String empName = stmt.getString(2);
		      System.out.println("Emp Name with ID:" + 47 + " is " + empName);
		}catch (Exception e) {
			
		}finally{
			try {
				closeMethod(stmt);				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
