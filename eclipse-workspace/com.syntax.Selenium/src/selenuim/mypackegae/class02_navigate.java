package selenuim.mypackegae;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class class02_navigate {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://google.com");
	
	driver.navigate().to("https://facebook.com");
	
	Thread.sleep(2000);
	
    driver.navigate().back();
    
    Thread.sleep(2000);
    
    driver.navigate().forward();
    
    driver.navigate().refresh();
    
    driver.close();  //close current url
    
   // driver.quit();   //close multiple windows
    
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	}
