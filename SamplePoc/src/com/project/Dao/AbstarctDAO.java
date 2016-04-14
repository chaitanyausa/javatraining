package com.project.Dao;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class AbstarctDAO {

	public static final String userName="root";
	public static final String psd="root";
	public static final String url="jdbc:mysql://localhost:3306/test";
	public static final String packageName="org.gjt.mm.mysql.Driver";
	
	public Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName(packageName);
			System.out.println("Connecting to database...");
			connection = DriverManager.getConnection(url, userName, psd);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
}
