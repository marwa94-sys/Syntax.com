package com.syntax.selenuim.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://166.62.36.207/syntaxpractice/window-popup-modal-demo.html");
		
	
	String singUp=driver.getTitle();
	System.out.println(singUp);
	
	String parentWindowHandle=driver.getWindowHandle();//Grab the handle pf parent window.
    System.out.println("What is the Parent Window Handle? "+parentWindowHandle);
    
		
	driver.findElement(By.linkText("Follow On Instagram")).click();	
	Thread.sleep(1000);
	
	driver.findElement(By.linkText("Like us On Facebook")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.linkText("Follow Instagram & Facebook")).click();
	Thread.sleep(1000);
	
	
	Set<String>allWindowHandlesSet=driver.getWindowHandles();//Returns set of window handle of all
	System.out.println("What is the number of windows opened ? "+allWindowHandlesSet);
	
	Iterator<String> it =allWindowHandlesSet.iterator();
	
	while(it.hasNext()) {
		String handle= it.next();//Grab the next window handle
		if(!handle.equals(parentWindowHandle)) {//switch to next window only if not same as parent
			
			driver.switchTo().window(handle);
			System.out.println(driver.getTitle());
			driver.close();
			Thread.sleep(1000);
		}
		
	}
	
	driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
