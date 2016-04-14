package com.corejava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public abstract class GenericMySQLDAO {
	
	private static final String JDBC_DRIVER = "org.gjt.mm.mysql.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/sprinexamples";
	
	

	// <code> jdbc:<em>subprotocol</em>:<em>subname</em></code>
	// Please provide your DB credentials here
	private static final String USER = "root"; //
	private static final String PASS = "root";
	private static final String DB_URL_COMPLETE =  DB_URL+"?user="+USER+"&password="+PASS;
	
	public Connection connection = null;
	static Statement statement = null;
	private Properties properties=null;
	
	public void init(){
		
		properties = new Properties();
		// you can use put also
		properties.setProperty("user", USER);
		properties.setProperty("password", PASS);
	}
	
	public Connection getConnection() throws SQLException{
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		connection = DriverManager.getConnection(DB_URL, USER, PASS);
		
		return connection;
		
	}
	
	public Statement getStatment() throws SQLException{
		
		Statement statement = connection.createStatement();
		
		return statement;
		
	}
	
	public void closeMethod(ResultSet rs, Statement statement) throws SQLException{
		rs.close();
		statement.close();
		this.connection.close();
	}

}
