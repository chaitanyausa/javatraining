package com.corejava.jdbc.batchprocessing;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeBatchProcessing extends GenericMySQLDAO{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection connection = null;
		Statement stmt = null;
		ResultSet rs=null;
		
		try{
			
			connection = getConnection();
			
			connection.setAutoCommit(false);
			System.out.println("Creating statement...");
			stmt = connection.createStatement();
			
			String sql1 = "insert into employee (first_name,last_name,salary) values ('Sasikanth','Dale',70000)";
			stmt.addBatch(sql1);
			
			String sql2 = "insert into employee (first_name,last_name,salary) values ('Karthik','Kumar',80000)";
			stmt.addBatch(sql2);
			String sql3 = "UPDATE Employee set salary=30000 WHERE id=37";
			stmt.addBatch(sql3);
			
			int[] count = stmt.executeBatch();
			
			connection.commit();
			String sql = "SELECT id, first_name, last_name, salary FROM Employee";
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
