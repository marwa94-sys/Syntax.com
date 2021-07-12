package com.syntax.selenuim.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebElementCommands {
	
	
	
	public static String UserName="Admin";
	public static String PassWord="admin123";
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		    
	
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//Maximize 
		driver.manage().window().fullscreen();
		//Perform action in the textbox
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployeeList");
		
	
		//Get the sccSelector and Storing the UserName
		WebElement userName=driver.findElement(By.cssSelector("input[name*='txtUser']"));
		userName.sendKeys(UserName);
		Thread.sleep(1000);
		userName .clear();
		userName.sendKeys(UserName); //SendKeys -->Will append text
		
		
		
		//Get the sccSelector and Storing the Password
		WebElement PW=driver.findElement(By.cssSelector("input[type='password']"));
		PW.sendKeys(PassWord);
		
		
		//Get the sccSelector and Storing Login button
	     WebElement login= driver.findElement(By.cssSelector("input[type='submit']"));
	     login.click();
	     
	     
	     //Verify logo is displayed
	     boolean  isDisplayed= driver.findElement(By.xpath("//b[text()='PIM']")).isDisplayed();
	     
	     
	     if(isDisplayed) {
	    	 System.out.println("WebOrder logo is displayed");
	     }
	     else {
			System.out.println("WebOrder logo is NOT displayed");
		}	
	     
	     
	     
	     //Capture Welcome element 
	     WebElement welcome= driver.findElement(By.xpath("//a[@class='panelTrigger']"));
	     String value=welcome.getText();
	     
	     if (value.contains(UserName)) {
			System.out.println(UserName+" is logged in . Test Case PASS");
		}else {
			System.out.println(UserName+" is NOT logged in. Test Case FAIL");
		}
	     
		 //driver.quit();
	     
	     
	     
	     
		
		
	}

}
