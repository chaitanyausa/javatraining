package com.corejava.jdbc.statments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public abstract class GenericMySQLDAO {
	
	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost/test";
	
	

	// <code> jdbc:<em>subprotocol</em>:<em>subname</em></code>
	// Please provide your DB credentials here
	private static final String USER = "root"; //
	private static final String PASS = "";
	private static final String DB_URL_COMPLETE =  DB_URL+"?user="+USER+"&password="+PASS;
	
	public static Connection connection = null;
	
	
	public static Connection getConnection() throws SQLException{
		
		connection = DriverManager.getConnection(DB_URL, USER, PASS);
		
		return connection;
		
	}
	
	public Statement getStatment() throws SQLException{
		
		Statement statement = connection.createStatement();
		
		return statement;
		
	}
	
	public static void closeMethod(ResultSet rs, Statement statement) throws SQLException{
		rs.close();
		statement.close();
		GenericMySQLDAO.connection.close();
	}
	
	public static void closeMethod(Statement statement) throws SQLException{		
		statement.close();
		GenericMySQLDAO.connection.close();
	}

}
