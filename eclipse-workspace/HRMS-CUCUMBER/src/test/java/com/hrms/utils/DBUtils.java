package com.hrms.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DBUtils {
	
	private static Connection conn;
	private static Statement st;
	private static ResultSet rs;
	private static List<Map<String, String>> listData;

	
	
	/**
	 * This Method will establish a connection with db   //Called what the method does --> It is called Java Doc the purpose to explain to our cowerkers 
	 * 
	 */
	
	
	public static void getConnection() {
		try {
			Connection conn= DriverManager.getConnection(ConfigsReader.getProperty("dbURL"),ConfigsReader.getProperty("dbUsername"), ConfigsReader.getProperty("dbPasswrd"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		}
	

	/**
	 * this method will execute the query and store the data inside the list of maps
	 * by the given sql query
	 * @param sqlQuery
	 * @return <-- List<Map<String, String>>
	 */
	public static List<Map<String, String>> storeDataFromDB(String sqlQuery) {
		try {
			getConnection();
			st = conn.createStatement();
			rs = st.executeQuery(sqlQuery);
			ResultSetMetaData rsMetaData = rs.getMetaData();
			listData = new ArrayList<>();

			while (rs.next()) {
				Map<String, String> mapData = new LinkedHashMap<>();
				for (int i = 1; i <= rsMetaData.getColumnCount(); i++) {
					mapData.put(rsMetaData.getColumnName(i), rs.getObject(i).toString());
				}
				listData.add(mapData);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listData;

	}
	
	
	/**
	 * This method will close the connection with db 
	 */
	
	
	public static void closeConnection() {
		try {
			if(rs!= null) {
			rs.close();}
			if(st!= null) {
			st.close();}
			if(rs!= null) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	

}
}