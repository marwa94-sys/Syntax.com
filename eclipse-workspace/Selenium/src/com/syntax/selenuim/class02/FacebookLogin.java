package com.syntax.selenuim.class02;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement( By.id("email")).sendKeys("Syntax@tech.com");

	    //driver.findElements(By.id("email"))).sendKeys("syntaxtest@yahoo.com"));
	   //driver.findElements(By.id("pass")).sendKeys("syntax123");
		//driver.findElement(By.tagName(tagName))
	
	    driver.findElement(By.id("pass")).sendKeys("Sysntax123");
	    
	    driver.findElement(By.id("u_0_b")).click();
	    		
	    
	    
	    
	    
	    
	    
	    
	}

}
