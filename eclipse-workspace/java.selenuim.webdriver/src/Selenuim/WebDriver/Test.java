package Selenuim.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		
			//Making connection to the browser 	
			 System.setProperty("webdriver.gecko.driver","Drivers\\geckodriver.exe");
	         //Invoking the browser 
			 WebDriver driver = new FirefoxDriver();

			// Launch the url or Passing the the url 
			driver.get("https://justfly.com");
			String excpectedurl=driver.getCurrentUrl();
			String actulString ="https://justfly.com/";

	
		
			if 	(excpectedurl.equalsIgnoreCase(actulString)) {
				String str=driver.getTitle();
				System.out.println(str);
			}	else {
				System.out.println("why  ");
			}
				//Thread.sleep(3000);	
			///	driver.close();	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	}
