package com.syntax.selenuim.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");//method to launch to URL
		
		WebDriver driver= new ChromeDriver();
	
		driver.get("https://www.facebook.com");
		driver.manage().window().fullscreen();
		driver.navigate().refresh(); 
		driver.navigate().to("https:/www.google.com");
		
		//Commands:
		driver.navigate().back();
		Thread.sleep(3000);
		//driver.navigate().to("https://www.amazon.com");
		driver.navigate().forward();
		driver.close();
		
		
		
	}

}
