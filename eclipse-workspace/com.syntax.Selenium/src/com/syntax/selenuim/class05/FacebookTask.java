package com.syntax.selenuim.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class FacebookTask {
	
	/*
	 * Test Case : Facebook Drop Down verification
	 * 
	 * 1) Open chrome browser 
	 * 
	 * 2)Go to "https;//www.facebook.com"
	 * 
	 * Verify:
	 *   Month dd has 12 month options 
	 *   Day dd has 31 day options 
	 *   Year dd has 115 year options 
	 *   
	 * 4)Select your date of birth
	 * 
	 * 5)Quit browser 
	 * 
	 */
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		
		//Verify how many DD months has (12)
		WebElement months= driver.findElement(By.id("month"));
		Select obj= new Select(months);
	    List<WebElement>listOfMonths=obj.getOptions();
	    System.out.println("Numbers of months is "+listOfMonths.size());
		
	          //Select My Month of birthday 
	    obj.selectByValue("5");
		Thread.sleep(2000);
		
		//Verify how many DD day has (31)
	   WebElement days= driver.findElement(By.id("day"));
	   Select obj1= new Select(days);
	   List<WebElement>  ListOfDays=obj1.getOptions();
	   System.out.println("Numbers of Days is "+ListOfDays.size());
	   
	         //Select my Day of Birthday
	   obj1.selectByValue("31");
	   Thread.sleep(2000);
	   
	    //Verify how many DD Years has (115)
	   WebElement years=driver.findElement(By.id("year"));
	   Select obj2= new Select(years);
	   List<WebElement> listOfYears=obj2.getOptions();
	   System.out.println("Numbers of Yreas is "+listOfYears.size());
		
	         //Select My year of Birthday
	   obj2.selectByVisibleText("1994");
	   Thread.sleep(2000);
	   
	   
	   driver.quit();
		
	}
}
