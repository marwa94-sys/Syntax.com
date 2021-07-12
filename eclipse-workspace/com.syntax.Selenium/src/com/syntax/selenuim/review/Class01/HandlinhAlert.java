package com.syntax.selenuim.review.Class01;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.syntax.utils.BaseClass;

public class HandlinhAlert extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe"); //Locating the browser
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		
		WebElement alertButton=driver.findElement(By.id("alert"));
		alertButton.click();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();//Switching focue to alert Simple Alert 
		alert.accept();

		//Thread.sleep(2000);
		WebElement timingAlertButton=driver.findElement(By.id("timingAlert"));
		timingAlertButton.click();
		
		WebDriverWait wait= new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(2000);
		alert.accept();
		
		
		
		
	
	}
}
