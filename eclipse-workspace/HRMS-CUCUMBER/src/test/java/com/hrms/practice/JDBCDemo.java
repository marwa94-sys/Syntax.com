package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;



public class JDBCDemo {
	
	
	String dbUsername="syntax_hrm";
	String dbPassword="syntaxhrm123";
	//jdbc: driver type :hostname:port/db name 
	String dbURL="jdbc:mysql://18.232.148.34:3306/syntaxhrm_mysql";
	//JDBC --> Java DataBase Connectivity 
	
	
	@Test// this annotation will execute this test 
	public void abc() throws SQLException {
		
		Connection conn= DriverManager.getConnection(dbURL,dbUsername,dbPassword); //Higher priority 
		
		System.out.println("DB CONNECTION IS SUCCESSFUL");
		
		Statement st=conn.createStatement();
		
		ResultSet rs=st.executeQuery("select * from hs_hr_employees");
		
		rs.next();
		
		String firstname= rs.getString("emp_firstname");
		System.out.println(firstname);
		
		rs.next();
		
		String firstname2=rs.getString("emp_firstname").toString();
		System.out.println(firstname2);
		
		String allData;
		while(rs.next()) {
			allData=rs.getObject("Emp_firstname").toString();
			System.out.println(allData);
		}
		
		
		rs.close();
		st.close();
		conn.close();
	}
		
		//Retrieve all the job titles and store them in arrylist and show it in 
		//the console from arrylist
		
		@Test
		public void ListTask() throws SQLException {
			
			Connection conn= DriverManager.getConnection(dbURL,dbUsername,dbPassword); //Higher priority 
			
			System.out.println("DB CONNECTION IS SUCCESSFUL");
			
			Statement st=conn.createStatement();
			
			ResultSet rs=st.executeQuery("select * from ohrm_job_title");
			List<String> jobTitles= new ArrayList<>();
			while (rs.next()) {
				jobTitles.add(rs.getObject("job_title").toString());
			
			}
			
			System.out.println(jobTitles);
			for(String jt:jobTitles) {
				System.out.println(jt);
			}
			
			
		}
		
		
		
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
