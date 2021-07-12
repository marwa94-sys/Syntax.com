package com.hrms.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.hrms.utils.ConfigsReader;
import com.hrms.utils.Constants;






public class BaseClass {
	
	
	/*public static  void setUp() {
		 read the file to retrieve the data 
		switch(ConfigsReader) {  //How do we retrieve the date from the property File 
		
		
		ConfigsReader.readerProperties(Constants.CONFIGURATION_FILEPATH);
		switch (key) { */

		
	
	public  static WebDriver driver;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports reporter;
	public static ExtentTest Test;
	
	
	
	@BeforeTest (alwaysRun = true)
	public void generateReport() {
		ConfigsReader.readerProperties(Constants.CONFIGURATION_FILEPATH);
	    htmlReporter= new ExtentHtmlReporter(Constants.REPORT_FILEPATH);
		htmlReporter.config().setDocumentTitle(ConfigsReader.getProperty("Hrms Report"));
		htmlReporter.config().setDocumentTitle(ConfigsReader.getProperty("Hrms Execution Report"));
        htmlReporter.config().setTheme(Theme.DARK);
        reporter= new ExtentReports();
	    reporter.attachReporter(htmlReporter);	
			
	}
	
	
	@AfterTest (alwaysRun = true)
	public void writeReport() {
		reporter.flush();
	}
	
	
@BeforeMethod (alwaysRun = true)//To make this method run before every test method 		
	public static  WebDriver setUp() {
		
		//ConfigsReader.readerProperties(Constants.CONFIGURATION_FILEPATH);
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
		
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
	


@AfterMethod (alwaysRun = true)// To make this method to run after every @test method 
	public static void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
	}
	
	
	
		}
	


