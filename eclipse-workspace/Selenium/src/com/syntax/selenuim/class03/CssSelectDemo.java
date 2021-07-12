package com.syntax.selenuim.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectDemo {
	
	public static  String url="http://166.62.36.207/humanresources/symfony/web/index.php/dashboard";

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		
		driver.findElement(By.cssSelector("input[id='txtUsername']")).sendKeys("Admin");
		
		driver.findElement(By.cssSelector("input[name*='txtPassword']")).sendKeys("Hum@nhrm123");  //* contains
		
		driver.findElement(By.cssSelector("input[id^='btn']")).click();   // ^starts with
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("a[class$='Trigger']")).click(); // $ Ends with
		
		driver.findElement(By.cssSelector("a[class$='gger']")).click();
		
		//for id and name  we can use --->'#'
		//for className we can use ---->'.'
		
		
		
		//"//input[id='txtUsername']"
		//How to copy xpath and Css using developer too.
				//select and Right click on the desired tag, go to copy and select Copy Xpath/Selector. 

				//Xpath copied using developer tool.
				//*[@id="txtUsername"]
				//*[@id="divPassword"]/span

				//CSS copied using developer tool.
				//#txtUsername
				//#divPassword > span
				//Not recommanded to use.
				//*[@id="login_form"]/table/tbody/tr[3]/td[2]/div/a
		
		
		
	}

}
