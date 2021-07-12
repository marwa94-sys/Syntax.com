package com.syntax.selenuim.class07;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleWithLoop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-switch-windows-2/");
		
		String singUPTitle=driver.getTitle();
		System.out.println("Main page title is:"+singUPTitle);
		
		String parentWindowHandle=driver.getWindowHandle();//Grab the handle of parent window
		System.out.println("What is the Parent Window Handle?"+parentWindowHandle);
		
		
		for(int i=1;i<=3;i++) {
			driver.findElement(By.xpath("//button[@onclick='newBrwTab()']")).click();
			Thread.sleep(2000);
		}
		
		
		Set<String > allWindowHandles=driver.getWindowHandles();
		for(String handle: allWindowHandles) {
			System.out.println("Id of the the window ::"+handle);
			driver.switchTo().window(handle);
			driver.get("http:\\www.google.com");
			driver.close();
		}
		
		
		
		
		
		
		
		
		
		
	}
}
