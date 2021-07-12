package com.syntax.selenuim.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	
	public static void main(String[] args) {
		
		
		String url="http://newtours.demoaut.com/";
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
	
		driver.findElement(By.linkText("REGISTER")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("marwa");
		
		driver.findElement(By.name("lastName")).sendKeys("Yaghourtne");
		
		driver.findElement(By.name("phone")).sendKeys("3748347032");
		
		driver.findElement(By.id("userName")).sendKeys("marwa.yaghourtne@gmail.com");
		
		driver.findElement(By.name("address1")).sendKeys("usa.2341");
		
		driver.findElement(By.name("city")).sendKeys("Virginia");
		
		driver.findElement(By.name("state")).sendKeys("vienna");
		
		driver.findElement(By.name("postalCode")).sendKeys("22182");
		
		/*driver.findElement(By.id("email")).sendKeys("maya");
		
		driver.findElement(By.name("password")).sendKeys("smgalaxies");
		
		driver.findElement(By.name("confirmPassword")).sendKeys("smgalaxies");
		
		driver.findElement(By.name("register")).click();*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
}