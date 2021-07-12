package com.syntax.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class LoginWithAdvancedXpath extends CommonMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		
		//Identify username based on the parent 
		WebElement userName=driver.findElement(By.xpath("//div[@id='divUsername']/input"));
		sendText(userName, ConfigsReader.getProperty("username"));
		
		
		//Identify password based on the sibling
		WebElement passWord=driver.findElement(By.xpath("//span[text()='Password']/preceding-sibling::input"));
		sendText(passWord, ConfigsReader.getProperty("password"));
		
		
		//Identify login based on parents sibling 
		//WebElement login=driver.findElement(By.xpath("//div[@id='divLoginHelpLink']/following-sibling::div/input"));//Whenever we can 
		//login.click();
		
		
		//identify login btn based on grandparent 
		WebElement login=driver.findElement(By.xpath("//form[@id='frmLogin']/div[5]/input"));//Whenever we can 
		login.click();
		
		Thread.sleep(2000);
		tearDown();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
