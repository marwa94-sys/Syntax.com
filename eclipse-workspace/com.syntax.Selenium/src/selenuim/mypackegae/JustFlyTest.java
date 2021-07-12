package selenuim.mypackegae;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JustFlyTest {
	public static void main(String[] args) {
		
		
		String url="https://www.justfly.com/";
		System.setProperty("webdriver.gecko.driver","drivers\\geckodriver.exe");
		 
		WebDriver driver=new FirefoxDriver();
		
		driver.get(url);
		
		driver.findElement(By.className("airport-related")).sendKeys("Washington, United States - All Airports [WAS]");
		
		driver.findElement(By.name("seg0_to")).sendKeys("Casablanca, Morocco - Mohamed V International Airport [CMN]");
		
		driver.findElement(By.name("seg0_date")).sendKeys("2020-05-31");
		
		//driver.findElement(By.id("date-picker-2")).sendKeys("2020-06-30");
		
	  //  driver.findElement(By.className("passenger-toggle search-dropdown-toggle")).sendKeys("1 Passenger(s)");
		
		//driver.findElement(By.className("form-field-submit-button")).click();
		
		
		
		
		
	}

}
