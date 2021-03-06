package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileReading {

	public static void main(String[] args) throws IOException {
	
		
		String filepath="C:\\Users\\marwa\\eclipse-workspace\\MyfirstProjectSyntaxClasses\\configs\\configuration.properties";
		System.out.println(filepath);
		
		
		String userDirectory=System.getProperty("user.dir");
		System.out.println(userDirectory);
		
		
		String username=System.getProperty("user.name");
        System.out.println(username);
        
        
        String os=System.getProperty("os.name");
        System.out.println(os);
        
        
        String  filepath1=System.getProperty("user.dir")+"\\configs\\configuration.properties";
        FileInputStream fis=new FileInputStream(filepath1);
        
        
        Properties prop= new Properties();
        prop.load(fis);
        
        String browser=prop.getProperty("browser");
        String url=prop.getProperty("browser");
        
        
        System.out.println(browser);
        System.out.println(url);
        System.out.println(prop.get("url"));
        
  
        
        
	}

}
