package Selenuim.WebDriver;




//Difference between driver.get() and driver.navigate()
//Driver.get() will wait for the page  to fully load 
//driver.get() will not keep the history of the browser 

//driver.navigate() Will keep the history of the browser 
//driver.navigate() will not wait for the page to fully  load.



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		 System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		 
		 WebDriver driver= new FirefoxDriver();
		 
		 driver.manage().window().fullscreen();
		 
		 driver.get("https://www.google.com"); // Launching to google 
		 
		 Thread.sleep(3000);
		 
		 driver.navigate().refresh();
		 
		 driver.navigate().to("https://www.facebook.com");//Launching to facebook 
			 
		 	 
		driver.navigate().back();
		
		Thread.sleep(3000);
		//driver.navigate().to("https://amazon.com");
		
		driver.navigate().forward();
		
		
		
		
		
	}
	
	
	

}
