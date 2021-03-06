package com.syntax.selenuim.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchChromeBrowser {
	
	public static void main(String[] args) {
		
		
		//for Windows users. drivers\\chromedriver.exe
		
		//Making connection to the driver
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe"); //This is  the first argument we should pass ---  careful to the case sensitive ---> The second argument is The path to the driver 
		
		//opening the browser by calling the constructor of ChromeDriver class and upcasting.
		WebDriver driver =new ChromeDriver(); // invoke the driver 
		
		//System.setProperty("webdrover.chrome.driver","path to the driver");
		
		
		driver.get("https://www.google.com");

		String url=driver.getCurrentUrl();
		System.out.println(url);

		System.out.println(driver.getTitle());
		
		
	}

}
