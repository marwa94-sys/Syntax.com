package com.syntax.selenuim.class11;
import org.openqa.selenium.*;


import com.syntax.utils.CommonMethods;

/*Tast Case 
 * 
 * Navigate to the HRMS
 * Enter u id and pwd 
 * click on login btn using JS executor
 */
public class JSExecutorDemo  extends CommonMethods{
	
	public static void main(String[] args) throws InterruptedException {
		
		
		setUp();
		
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("Hum@nhrm123");
		
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;//Object of driver of javaScript type //Down casting webdriver of javaScript 
		
		WebElement loginBtn=driver.findElement(By.id("btnLogin"));
		
		
		//Highlight login button
		js.executeScript("arguments[0].style.backgroundColor='Red'", loginBtn);
		Thread.sleep(5000);
		
		
		//Clicking Loging button
		js.executeScript("arguments[0].click();", loginBtn);
		Thread.sleep(5000);
		
		
		//Scrolling down
		//js.executeScript("window.scrollBy(0.22050)");//Negative Number will scroll up
		
		
		
		/**
		 * Class called JavaScript Utils
		 * Has JavaScript Methods
		 * 
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
}
}
