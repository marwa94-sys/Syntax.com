package com.syntax.selenuim.class06;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class HandelAlerts {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		String url="http://www.rediff.com/";
		
		driver.get(url);
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
	   //Click on sign in link 
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		
		//click on go button
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		Thread.sleep(2000);
		//handling alert 
		Alert alert=driver.switchTo().alert();
		String alertText=alert.getText();
		
		System.out.println("Text on alert is"+alertText);
		alert.accept();
		
	     Thread.sleep(10000);
		
		driver.quit();

	
	
	
	}
}
