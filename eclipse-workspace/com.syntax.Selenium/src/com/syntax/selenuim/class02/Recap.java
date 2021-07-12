package com.syntax.selenuim.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {

	public static void main(String[] args) {
		
		//How do we launch a browser 
		//WebDriver driver= new ChromeDriver();
		
		/*
		 * Commands with Page
		 * getCurrentUrl
		 * close
		 * getTitle
		 * 
		 */
		
		
		
		String fbUrl="http://www.facebook.com";
		
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");//Note: Always lower Case
		WebDriver driver = new ChromeDriver();
		
	    driver.get(fbUrl);
	    String url=driver.getCurrentUrl();
	    System.out.println("Current URL is : "+ url);
		
	    String title=driver.getTitle();
	    System.out.println("Title of the page is: "+title);   
		driver.close();
		
		

	}

}
