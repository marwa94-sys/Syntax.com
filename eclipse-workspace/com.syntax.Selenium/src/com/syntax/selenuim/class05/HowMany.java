package com.syntax.selenuim.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowMany {
	
	
	public static void main(String[] args) {
		
		
		//Go to WlartMart and capture of links and print ONLY links that have text
		
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.ebay.com/");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		int count=0;
		
		 for(WebElement link:links) {
			 String linktext=link.getText();
			 if(!linktext.isEmpty()) {
			 System.out.println(linktext);
			 count++;
			 }
		 }
		
		
		
		System.out.println("Total number of links "+count);
		driver.quit();
		
		
		
	}
}
