package com.syntax.selenuim.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC02 {
	
	public static String us="admin";
	public static String pw="admin";
	
	public static void main(String[] args) {
		
		/*
		 * Swag Labs Negative Login:
		 * Go to "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login"
		 * Enter invalid userNmae and password and click Login 
		 * Verify error message contains:"Username and password do not match any user in this service"
		 * 
		 */
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		
		
		WebElement UserN= driver.findElement(By.xpath("//input[starts-with(@id, 'txtUser')]"));
		UserN.sendKeys(us);
		
		
		WebElement passW=driver.findElement(By.xpath("//input[starts-with(@id, 'txtPass')]"));
		passW.sendKeys(pw);
		
		
		//verify Login button 
		WebElement login= driver.findElement(By.xpath("//input[starts-with(@type, 'sub')]"));
		login.submit();
		
		
		
		
		
	}

}
