package com.syntax.selenuim.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQA {
	
	
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("http://demoqa.com/automation-practice-form/");
	
	
	
	//Click on  redioButton
	 driver.findElement(By.xpath("//input[@id='sex-1']")).click();
	 Thread.sleep(1000);
	 //  driver.findElement(By.xpath("//input[@value='Female']")).click();
     WebElement radioM=driver.findElement(By.xpath("//input[@id='sex-0']"));
 
     if(radioM.isEnabled()) {
	 radioM.click();
     }
     if(radioM.isSelected()) {
  	  driver.findElement(By.xpath("//input[@value='Female']")).click();
     }
     
     
     Thread.sleep(3000);
     
    // driver.quit();
	    
	
     
     //Click on checkbox
     driver.findElement(By.xpath("//input[@id='profession-0']")).click();
   WebElement chbox=  driver.findElement(By.xpath("//input[@value='Automation Tester']"));
   if(!chbox.isSelected()) {
	   chbox.click();
   }
     
     
     
	
	
	
	
	
	
	
	
}
}
