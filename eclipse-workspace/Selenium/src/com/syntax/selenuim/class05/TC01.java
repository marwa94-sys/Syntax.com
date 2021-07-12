package com.syntax.selenuim.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01 {
	
	public static String userName="Admin";
	public static String passWord="Hum@nhrm123";
	
	public static void main(String[] args) {
		
		/*
		 * Open chrome browser
		 * Go to "http://166.62.36.207/humanresources/symfony/web/index.php/performance/viewEmployeePerformanceTrackerList#"
		 * Enter valid username and valid passeword and click login 
		 * verify robot icon is displayed
		 * verify "Products" text is available next to the robot icon
		 *  
		 */
		
		
		
		//==========================================================================
		
		
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/performance/viewEmployeePerformanceTrackerList#");		
		
		
		WebElement UserN= driver.findElement(By.xpath("//input[starts-with(@id, 'txtUser')]"));
		UserN.sendKeys(userName);
		
		
		WebElement passW=driver.findElement(By.xpath("//input[starts-with(@id, 'txtPass')]"));
		passW.sendKeys(passWord);
		
		
		//verify Login button 
		WebElement login= driver.findElement(By.xpath("//input[starts-with(@type, 'sub')]"));
		login.submit();
		
		
		boolean isdiplay=driver.findElement(By.cssSelector("a[id^='menu_admin_viewAdmin']")).isDisplayed();
		if(isdiplay) {
			System.out.println("Admin logo is Displayed");
		}else {
			System.out.println("Admin logo is  NOT Displayed");
		}
		
		
		//verify Directory text
		WebElement directory= driver.findElement(By.cssSelector("a#menu_directory_viewDirectory"));
		boolean display=directory.isDisplayed();
		String directoryText=directory.getText();
		
		String excpectedText="Directory";
		
		
		if(display && directoryText.equals(excpectedText)) {
			System.out.println("Element is displayed and text is "+ directoryText);
		}else{
			System.out.println("Element is NOT displayed and text is " + directoryText);
		}
		
		
				
		
		
		
		
		
		
		
		
		
	}
}
