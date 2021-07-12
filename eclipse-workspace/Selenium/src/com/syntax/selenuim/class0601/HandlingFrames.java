package com.syntax.selenuim.class0601;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingFrames {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://toolsqa.com/iframe-practice-page");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().fullscreen();
		
		Thread.sleep(3000);
		
		
		//Switching to frame 
		driver.switchTo().frame("IF1");
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("marwa");
		Thread.sleep(3000);
		
	
		//Switch to the main page 
		driver.switchTo().defaultContent();
		
		
		
		
		
	}

}
