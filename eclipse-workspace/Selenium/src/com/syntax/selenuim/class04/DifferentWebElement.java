package com.syntax.selenuim.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* TEST CASE 
 * Navigate to https://Opensource-Demo.Orangehrmlive.Com/
 * enter user name  and password 
 * click login button
 * click on PIM link 
 * click on add employee link 
 * enter employee values
 * Enter first name and last name 
 * click checkbox
 * enter online credentials 
 * and click save 
 * 
 */

public class DifferentWebElement {
	 
           public static void main(String[] args) throws InterruptedException {
	
	
	
	/*
	 * Manually go to toolsqa.com --> demo sites --> automation-practice-form
	 * 
	 *  TEST CASE 
	 * Navigate to https://www.toolsqa.com/
	 * perform all action on all links and text boxes using different locators 
	 * Click on CHECKBOXES, RADIOBUTTONS, select values from drop down 
	 * 
	 */
        	   
	
	
	System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
	
	
	WebDriver driver= new ChromeDriver();
	
	
	driver.get("https://demoqa.com/automation-practice-form/");
	
	Thread.sleep(1000);
	
	driver.findElement(By.name("firstname")).sendKeys("Marwa");
	
	Thread.sleep(1000);
	
	driver.findElement(By.name("firstname")).clear();
	
	Thread.sleep(1000);
	
	driver.findElement(By.id("lastname")).sendKeys("Yaghourtne");
	
	//Better way to work with webelements 
	WebElement textName= driver.findElement(By.name("firstname"));
	
	textName.sendKeys("marwa");
	
	textName.clear();
	
	textName.sendKeys("mama");
	
	
	Thread.sleep(3000);
   // driver.quit();
	

    
    
    //click on radiobutton
	//1 Way
    driver.findElement(By.xpath("//input[@id='sex-1']")).click();
    Thread.sleep(1000);
    
	//2Way   -->using two attributes id thers is no ID
   // driver.findElement(By.xpath("//input[@name='sex'][@value='Female']")).clear();
    
    //3way 
			  List<WebElement>radio=  driver.findElements(By.xpath("//input[@type='radio']"));
			  radio.size();
			  radio.get(0).click();//Clicking on male
			// String value= radio.get(0).getAttribute("value");
	     	//	 System.out.println(value);
			  
			  
			 for(int i=0;i<radio.size();i++) { //Clicking on all button 
				 String value= radio.get(0).getAttribute("value");
				 
				 if(value.equalsIgnoreCase("Male"))
					 
				  radio.get(i).click();
				 
				  Thread.sleep(2000);
			  }
				

	
	
	
	
	
	
	
	
	
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
