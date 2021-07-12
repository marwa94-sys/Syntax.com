package com.syntax.selenuim.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().fullscreen();
		
		driver.get("https://demoqa.com/automation-practice-form/");
		
		WebElement maleRedio=	driver.findElement(By.id("sex-0"));
		
		System.out.println(maleRedio.isDisplayed());//true
		System.out.println(maleRedio.isEnabled());//true
		System.out.println(maleRedio.isSelected());//true
		
		
		//1Way of clicking on the element  
		maleRedio.click();
		System.out.println(maleRedio.isSelected());
		Thread.sleep(2000);
		
		
		//2 way - preferred way 
		
		String valueToSelect="Automation Tester";
		List<WebElement>elements=driver.findElements(By.name("profession"));
		System.out.println(elements.size());
		
		
		for(WebElement el:elements) {
			
		String value=el.getAttribute("value");
		System.out.println(value);
		
		
		     // if(value.equals(valueToSelect)) {
		      //	el.click();
		       // }
		
		if(el.isEnabled()) {
			el.click();
			Thread.sleep(2000);
		}
		}
		
		
		
		
	   driver.quit();
		
		
	}

}
