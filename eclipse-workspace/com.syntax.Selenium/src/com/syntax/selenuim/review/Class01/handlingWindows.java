package com.syntax.selenuim.review.Class01;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingWindows {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe"); //Locating the browser
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.seleniumframework.com/Practiceform/");
		
		WebElement newBrowserTabButton=driver.findElement(By.xpath("//button[text()='New Browser Tab']"));
		newBrowserTabButton.click();
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);// -->Getting parent window ID the handle of parent window 
		Thread.sleep(2000);
		driver.close();//It's going to  close the current browser
		
		
		//Getting all the window handles 
		Set<String> allWindow=driver.getWindowHandles();
		Iterator<String>it=allWindow.iterator();   //-->Iteratinng through the windows
		
		while(it.hasNext()) {  //-->Checking if there is any other window handle coming up
			
			String childWindow=it.next();//store next window
			if(!parentWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow); //Syntax to switch to child window	
			    //We only can switch if they are different 
			}
		}
		
	   WebElement header=driver.findElement(By.xpath("//strong[contains(text(), 'Agile Testing')]"));
	   String headerText=header.getText();
	   System.out.println(headerText);
		
		
		
		
		
		
		
		
		
	}
}
