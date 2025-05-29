package com.jdc.mkt.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public final class MyConnection {
	
	
	public static Connection getConnection() {

		try {
//			return DriverManager.getConnection(
//					"jdbc:mysql://localhost:3306/testDb", "root", "admin");
		
//			return DriverManager
//					.getConnection("jdbc:mysql://localhost:3306/testDb?user=root&password=admin");
		
			return DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/testDb", getProps());
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private static Properties getProps() {
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "admin");
		return prop;
	}

}
