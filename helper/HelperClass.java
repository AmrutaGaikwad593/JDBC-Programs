package com.jsp.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HelperClass{
	
	public Connection getConnection() {
		String url="jdbc:mysql://localhost:3306/javabatch";
		String username="root";
		String password="root123";
		Connection connection=null;
		
		//step 1: to register the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection=DriverManager.getConnection(url, username, password);
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
		
		
		
		
	}

		}
