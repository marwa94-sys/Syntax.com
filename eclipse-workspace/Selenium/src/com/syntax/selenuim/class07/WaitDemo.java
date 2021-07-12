package com.syntax.selenuim.class07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitDemo {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://uitestpractice.com/Students/Contact");
		//driver.manage().window().fullscreen();
		
		
		/*
		 * Implicit wait Kinda global wait and it will wait for each and every element 
		 * it waits on for element to be found, meaning it will work for findelement 
		 * and findelements methods only. as soon as its found, the remaining time will be ignored
		 */
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.className("This is a Ajax link")).click();
		
		String text= driver.findElement(By.className("ContactUs")).getText();
		System.out.println(text);
		
		
		
		
		
		
		
	}

}
