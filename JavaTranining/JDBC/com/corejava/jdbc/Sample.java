package com.corejava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Sample {
	
	static final String url = "jdbc:mysql://localhost/test"; 
	
	static final String user = "root";
	static final String password = "root";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Connection connection=null;
		Statement statement=null;
		ResultSet res=null;
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			
			connection = DriverManager.getConnection(url, user, password);
			/*
			java.util.Properties prop = new java.util.Properties();
			prop.setProperty("username", "root");
			prop.setProperty("password", "root");
			 */
			
			statement = connection.createStatement();
			
			System.out.println("Connection created ; trying to fecth data");
			
			String sqlQuery = "SELECT id, first_name, last_name, salary FROM employee";
			
			
			res =   statement.executeQuery(sqlQuery);
			
			
			/*
			if(res==null || res.next() == false){
				System.out.println("There is no data in the selected table");
			}*/
			
			while(res.next()){
				
				// Retrieve by column name
				int id = res.getInt("id");				
				int salary = res.getInt("salary");
				String first = res.getString("first_name");
				String last = res.getString("last_name");

				// Display values
				System.out.print("ID: " + id);
				System.out.print(", Salary: " + salary);
				System.out.print(", First: " + first);
				System.out.println(", Last: " + last);
			}
			
			res.close();
			statement.close();
			connection.close();		
			

		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(res!=null && statement!=null && connection!=null){
					res.close();
					statement.close();
					connection.close();	
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
				
		

	}

}
