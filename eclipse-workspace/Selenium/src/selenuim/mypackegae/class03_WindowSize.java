package selenuim.mypackegae;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class class03_WindowSize {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://google.com");
	
	driver.navigate().to("https://amazon.com");
	
	//driver.close();   --------->It will close the current page that you opened by selenuim 
	//driver.quit();     -------->It will close all the pages that was opened by selenuim 
	
	 driver.manage().window().fullscreen();      //Usually using   ------>maximize(); instead fullscreen();
	 
	 System.out.println(driver.getWindowHandle());
	 
	 
	 
	 
	 
	 
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
