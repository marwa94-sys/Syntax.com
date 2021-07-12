package com.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;






public class BaseClass {
	
	
	/*public static  void setUp() {
		 read the file to retrieve the data 
		switch(ConfigsReader) {  //How do we retrieve the date from the property File 
		
		
		ConfigsReader.readerProperties(Constants.CONFIGURATION_FILEPATH);
		switch (key) { */

		
	
	public  static WebDriver driver;
@BeforeMethod //To make this method run before every test method 		
	public static  WebDriver setUp() {
		
		ConfigsReader.readerProperties(Constants.CONFIGURATION_FILEPATH);
		
		
	    switch(ConfigsReader.getProperty("browser".toLowerCase())) {
	    case "chrome":
	    	System.setProperty("webdriver.chrome.driver",Constants.CHROME_DRIVER_PATH );
	         driver= new ChromeDriver();
	    	break;
	    	
	    case "Firefox":
	    	System.setProperty("webdriver.gecko.driver",Constants.GECKO_DRIVER_PATH);
	        driver= new FirefoxDriver();
	        break;
	        
	        default:
	        	throw new RuntimeException("browser is not supported ");
	       }
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		driver.get(ConfigsReader.getProperty("url"));
		//Initialize all page Objects as part of setup
		PageInitializer.initialze();
		return driver;
		
	    }
	


@AfterMethod // To make this method to run after every @test method 
	public static void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
	}
	
	
	
		}
	


