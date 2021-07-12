package com.syntax.selenuim.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioDemo {
	
	public static String url = "https://demoqa.com/automation-practice-form/";
	
	public static void main(String[] args) {
		
	
   System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");		
		
     WebDriver driver = new ChromeDriver();

         driver.get(url);
         
         
       WebElement malRadioB=  driver.findElement(By.xpath("//input[@id='sex-0']"));     //make sure if is it selected or not first 
       
       System.out.println(malRadioB.isDisplayed());//True
       System.out.println(malRadioB.isEnabled()); // is clickeble or not -->
       System.out.println("radio button is selected "+malRadioB.isSelected());// false
         System.out.println("================");
       //first way to click on  aradio button
       malRadioB.click();
       System.out.println("Radio button is selected "+malRadioB.isSelected());
       
       
       
       //Second way to click Radio  buttons
    //List<WebElement >  listRadioB= driver.findElement(By.xpath("//input[@name='exp']"));
       
         
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
