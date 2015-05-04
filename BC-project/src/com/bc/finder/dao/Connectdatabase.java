package com.bc.finder.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectdatabase {
	public  static Connection conn = null;
	
	
	public static Connection getConnection() throws SQLException{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver") ; 
			conn = DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:XE" , "system" , "123" ) ; 
		} catch (Exception e) {
			 System.out.println(e);
		}

		return conn;
	}

}
