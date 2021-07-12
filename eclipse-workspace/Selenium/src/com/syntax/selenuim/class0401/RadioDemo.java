package com.syntax.selenuim.class0401;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RadioDemo {
	
	public static String url="https://demoqa.com/automation-practice-from/";
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		
		
		
		
		
	}
	
	
}
