package com.syntax.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.CommonMethods;


public class FacebookSignUp extends CommonMethods {

	
	
	
	/*
	 * Using functions ONLY Facebook account 
	 */
	
	
	public static void main(String[] args) throws InterruptedException {
	
		
		setUp();
		
		//Webelement sigUp=driver.findelement(By.id("websubmit");
		
		//Select Month 
		WebElement monthDD=driver.findElement(By.id("month"));
		selectDdValue(monthDD, 8);
		
		
		//Select Day
		WebElement dayDD= driver.findElement(By.id("day"));
		selectDdValue(dayDD, "7");
		
		
		//Click on login
		
		
		Thread.sleep(3000);
		
		tearDown();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
}
