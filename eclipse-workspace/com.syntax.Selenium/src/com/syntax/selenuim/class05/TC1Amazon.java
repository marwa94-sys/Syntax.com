package com.syntax.selenuim.class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC1Amazon {

	public static void main(String[] args) {
		
		/*
		 * Open chrome browser
		 * Go to "https://www.amazon.com/"
		 * Using Iterator get text of each link 
		 * Get number of links that has text 
		 * 
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		
		
		//Capture All links
		List<WebElement>links=driver.findElements(By.tagName("a"));
		int count=0;
		Iterator<WebElement> listIT=links.iterator();
		while(listIT.hasNext()) {
			String linktext=listIT.next().getText();
			if(!linktext.isEmpty()) {
				System.out.println(linktext);
				count++;
			}
		}
		
		System.out.println("Total number of links with text "+count);
		driver.quit();
		
		
		
	}
}
