package com.syntax.selenuim.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
	public static void main(String[] args) throws InterruptedException {
		/*
		 * test Case
		 * Navigate to facebook
		 * click on forget links 
		 * navigate to facebook again 
		 * navigate forward
		 * navigate back 
		 * refresh the page 
		 * 
		 */
	
	
	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
    driver.get("https://facebook.com");
    driver.findElement(By.linkText("Forgot account?")).click();
    
    
    
	driver.navigate().to("https://facebook.com");
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	driver.close();
	//driver.quit();
	
	
	
	
	}

}
