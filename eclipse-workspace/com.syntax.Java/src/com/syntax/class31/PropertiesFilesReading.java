package com.syntax.class31;

//import java.beans.PropertyChangeEvent;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesFilesReading {
public static void main(String[] args) throws IOException {
	
	
	//To read the file:
	//Have file
	
	String filePath="C:\\Users\\marwa\\eclipse-workspace\\MyfirstProjectSyntaxClasses\\configs\\Examples.properties";
	
	//2. Bring Object of FileInputStream.
	
	FileInputStream fileInput= new FileInputStream(filePath);
	
	
	//To handle data from .properties file we need property class
	
	Properties prop = new Properties();
	
	prop.load(fileInput);
	String name =prop.getProperty("name");
	System.out.println(name);
	
	String city=prop.getProperty( "City");
	System.out.println(city);
	
	Set<Object> keys=prop.keySet();
	for(Object key:keys) {System.out.println(key);}
	
}
}
