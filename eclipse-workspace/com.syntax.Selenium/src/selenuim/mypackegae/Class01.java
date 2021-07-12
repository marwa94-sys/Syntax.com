package selenuim.mypackegae;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class01 {
	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://google.com");
	
	String actualurl= driver.getCurrentUrl();
	
	if(actualurl.contentEquals("https://www.google.com/")) {
		System.out.println("pass");
	}else {
		System.out.println("fail");
	}
	
	
	String actualTitle=driver.getTitle();
	
	if(actualTitle.contentEquals("Google")) {
		System.out.println("Tittle Pass");
	}else {
		System.out.println(" Tittle fail");
	}
	
	
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	}
