package Selenuim.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver; //inoking new package 

import jdk.jshell.Diag;



public class FirstTest {
	public static void main(String[] args) throws InterruptedException {
		
		//Test case 
		
		/*
		 *  1) Open a browser 
		 *  2) Open URL --> Uniform Resource Locator
		 *  3) Enter  user name
		 *  4) Enter password 
		 *  5) Click on ok
		 *  6) Check the page title 
		 *  //forward slash
		 */
		
		//Making connection to the driver 
		System.setProperty("webdriver.gecko.driver","C:\\Users\\marwa\\Documents\\Drivers\\geckodriver.exe"); //The first thing we should write 
		
		//FirefoxDriver driver =new FirefoxDriver();  //Invoke the browser 
		
		WebDriver  driver1 = new FirefoxDriver();   //Interfaces concept (Valid state)  we create an object but we can not instantiated it
		
		driver1.get("http://www.demoaut.com"); //Open URL in the browser 
		
		
		
		//findElement()----> used for find element on the page 
		
		// By.name("")---> it will provide address of the element
		
		//sendKeys()--->used for entering some text in the text box
				
		
		WebElement username=driver1.findElement(By.name("userName"));
		 
		 username.sendKeys("mercury");
		 
		 driver1.findElement(By.name("password ")).sendKeys("mercury");
		 
		 driver1.findElement(By.name("login")).click();  // click on singing button
		 
		String exptitle="Find a Fligh: Mercury Tours: ";
		
		//String acttilt
		
		
		
		Thread.sleep(3000);
		driver1.close();
		
		
		
		
		

		
		
		
		
		
		
	}

}
