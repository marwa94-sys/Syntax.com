package com.syntax.selenuim.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/*
 * Tools QA check all elements 
 * 
 * 1) Open chrome browser
 * 
 * 2) Go to "https://toolsqa.com/automation-practice-form/"
 * 
 * 3) Fill out :
 *   First Name
 *   Last Name 
 *   Check that sex radio buttons are enabled and select "Male"
 *  --> Check all years of experience radio buttons are clickable 
 *   Date
 *   Select both checkboxes for profession 
 *  --> Check all Automation Tools checkboxes are clickable and keep "Selenuim WebDriver" option as selected 
 *   
 * 4) Quit browser
 * 
 */
//for(WebElement list: sex) {
//	if(list.isEnabled()) {
	//	list.click();
		//Thread.sleep(2000);
//	}
//}
 
 public class Task03 {
	
	 
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().fullscreen();
		
		driver.get("https://demoqa.com/automation-practice-form/");
		
		
		//First Name 
		WebElement name=driver.findElement(By.name("firstname"));
	    name.sendKeys("Marwa");
	    Thread.sleep(2000);
		
	    
	    //Last Name
		WebElement lastName=driver.findElement(By.id("lastname"));
		lastName.sendKeys("Yaghourtne");
		Thread.sleep(2000);
		
		
		//Check Radio buttons is it clickable or not 
		List<WebElement>sex=driver.findElements(By.name("sex"));
		
		String sexExpected="Male";
		for(WebElement list:sex ) {
			String value=list.getAttribute("value");
			if(value.equals(sexExpected)) {
				list.click();
			}
		}
		
		
		// --> Check all years of experience radio buttons are clickable 
		
		List<WebElement>list0 =driver.findElements(By.name("exp"));
		 for(WebElement lt0: list0) {
			if( lt0.isEnabled()) {
			 lt0.click();
			 Thread.sleep(2000);
			 }
		 }
		
		
		
		
		
		//--> Check all Automation Tools checkboxes are clickable and keep "Selenuim WebDriver" option as selected 
		
	      List<WebElement>list1 =driver.findElements(By.name("tool"));
	      for(WebElement lt:list1) {
	    	  if(lt.isEnabled())
	    		  lt.click();
	    	  Thread.sleep(2000);
	      }
		
		
		
		
		
		driver.quit();
		
		
		
		
		
		
		
		
	}

}
