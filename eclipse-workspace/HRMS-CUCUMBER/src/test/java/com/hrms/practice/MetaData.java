package com.hrms.practice;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;



public class MetaData {
	
	String dbUsername="syntax_hrm";
	String dbPassword="syntaxhrm123"; 
	String dbURL="jdbc:mysql://18.232.148.34:3306/syntaxhrm_mysql";
	//JDBC --> Java DataBase Connectivity 
	
	
	
	@Test
	public void dbMetaData() throws SQLException {
		Connection conn=DriverManager.getConnection(dbURL,dbUsername, dbPassword);
		
		DatabaseMetaData dbMetaData= conn.getMetaData();
		
		String driverName= dbMetaData.getDriverName();
		
		String dbVersion=dbMetaData.getDatabaseProductVersion();
		
		System.out.println(driverName);
		
		System.out.println(dbVersion); //it is going to return us DataBase Version 
		}
	
	
	
	//Query - display all the info about employee whose emp_number is 14688
	@Test 
	public void rsMetadata() throws SQLException {
		
		Connection conn= DriverManager.getConnection(dbURL, dbUsername, dbPassword);
	    
		Statement st= conn.createStatement();
		
		ResultSet rs=st.executeQuery("select * from hs_hr_employees where emp_number = 14688");
		
		ResultSetMetaData rsMetaData= rs.getMetaData();
		
	    int colNumbers= rsMetaData.getColumnCount();
	    
	    System.out.println(colNumbers);
	    
	    String colName1=rsMetaData.getColumnName(1);
	    
	    System.out.println(colName1);
	    
	    
	    
	    for(int i=1; i<=colNumbers; i++) {
	    	
	    	String colName= rsMetaData.getColumnName(i);
	    	System.out.println(colName);
	    }
	    
	    
	    
	    // How  get the result metadata store it in the arraylist and retrieve it from arraylist 
	    // Also get column type name get the table names 
	    
	    //Metadata means data about data---> And metaData class will return us additional deta about deta 
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
	}

}
