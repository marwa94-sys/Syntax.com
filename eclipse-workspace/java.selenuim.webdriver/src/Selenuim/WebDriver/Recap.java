package Selenuim.WebDriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Recap {
	public static void main(String[] args) {
		
	
		
	System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	
	
	driver.get("https://www.facebook.com");
	String url= driver.getCurrentUrl();
	
	System.out.println("Current URL is :" + url);
	
	String title=driver.getTitle();
	System.out.println("The title of this page is "+title);
	
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
