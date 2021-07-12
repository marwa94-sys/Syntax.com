package com.syntax.selenuim.class07;

import java.awt.Frame;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.syntax.utils.BaseClass;

public class Recap {

	public static void main(String[] args) {
		
	
	//Lunch this url from properties file.
	//http://166.62.36.207/syntaxpractice/bootstrap-iframe.html
	
	WebDriver driver= BaseClass.setUp();
	boolean   isHomeDis=driver.findElement(By.xpath("//a[@href='./index.html']")).isDisplayed();
	System.out.println("Is Home Displayed? "+isHomeDis);
	
	driver.switchTo().frame("ReameOne");
	
	String welcomeMsg= driver.findElement(By.xpath("//h3[text()='Welcome to Selenium Easy ']")).getText();
	System.out.println(welcomeMsg);
	
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame("FrameTwo");
	
	boolean buttonEnabled=driver.findElement(By.xpath("//a[@class='enroll-btn']")).isEnabled();
	
	System.out.println("Is enrol BTN enabled?"+buttonEnabled);
	
	
	
	
	
	
	
	
	
	
	}	
}
