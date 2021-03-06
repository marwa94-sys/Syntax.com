package com.syntax.hw;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginToHrms {

	static WebDriver driver;
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
	//String filePath="C:\\Users\\marwa\\eclipse-workspace\\Selenium\\configs\\configuration.properties";
		
		
	String filepath=System.getProperty("user.dir")+"\\configs\\configuration.properties"; //  Graphite it dynamically  
	System.out.println(filepath);	
	
	
	//String filePath1="C:\\Users\\marwa\\eclipse-workspace\\Selenium\\configs\\configuration.properties"; // we are always have different user Name 
	
	FileInputStream fis= new FileInputStream(filepath);
	Properties prop=new Properties();
	prop.load(fis);
	
	
	
	//To Navigate
	String browser=prop.getProperty("browser");
	//WebDriver driver;
	
	
	
	switch(browser.toLowerCase()) {
	case "chrome":
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
	    driver= new ChromeDriver();
		break;
	case "firefox":
		System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
		 driver=new FirefoxDriver();
		break;
	}
	
	driver.get(prop.getProperty("url"));
	Thread.sleep(3000);
	
	driver.close();
	
	
	
	
	
	}
}
