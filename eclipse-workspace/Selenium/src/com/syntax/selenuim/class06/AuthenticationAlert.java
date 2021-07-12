package com.syntax.selenuim.class06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AuthenticationAlert {

	public static void main(String[] args) {
		
		
		/*
		 * Actual url=http://abcdatabase.com/basicauth
		 * username=test
		 * password=test
		 */
		
		
		
		//Making connection to the driver
		System.setProperty("webdriver.chrome.driver","drivers\\cchromedriver.exe");
		
		//Opening the browser ba calling the constructor of chromedriver class and Upcasting 
		WebDriver driver1= new ChromeDriver();
		
		driver1.get("http://test:test@abcdatabase.com/basicauth/");
		
		
		
		
		
		
	}
	
}
