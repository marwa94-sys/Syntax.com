package com.syntax.selenuim.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HrmsLogin {
public static void main(String[] args) {
	
	String url="";
	
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook,com");
}
}
