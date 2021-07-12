package com.syntax.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {
	
	
	public static Properties prop;
	
	/**
	 * This method will read properties file
	 * @param filePth
	 */
	
     // reader e file one me reading and other one retrieving some properties
	public static void readerProperties(String filePth) {
		try {
			FileInputStream fis= new FileInputStream(filePth);
			 prop= new Properties();
			prop.load(fis);
			fis.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	/**
	 * This method will return value of specified Key
	 * @param  String key
	 * @return String value 
	 */
	
	public static String getProperty(String key) {
		return prop.getProperty(key);
	}

}
