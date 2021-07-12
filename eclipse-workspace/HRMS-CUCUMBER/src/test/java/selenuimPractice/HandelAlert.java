package selenuimPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandelAlert {
	
	public static void main(String[] args) {
		
		
	   System.setProperty("webdriver.chrome.driver","the path of the driver");
	   
	   WebDriver driver= new ChromeDriver();
	   
	  // WebElement alert= driver.findElement(By.id("kdsmoermf"));
	   
	   
	   /**
	    * Handling Simple Alert/PopUps
	    * 
	    */
	   Alert alert=driver.switchTo().alert();
	   String alertText=alert.getText();
	   System.out.println(alertText);
	   alert.accept();  // .accept(); == Ok 
	   
		
		
	   
	   /**
	    * Handling Confirmation Alert 
	    */
	   driver.findElement(By.id("Confirm")).click();// The first thing we should swith the focus to the alert 
	   Alert confirmAlert= driver.switchTo().alert();
	   String comfirmAlertText= confirmAlert.getText();
	   System.out.println("This is Alert Confirm Text: "+ comfirmAlertText);
	   confirmAlert.dismiss();  // .dismiss(); == Cancel
	   
	   
	   
	   
	   /**
	    * Handling Prompt box 
	    * 
	    */
	   

	    driver.findElement(By.id("Prompt"));
	    Alert promtpAlert=driver.switchTo().alert();
	    String promptAlertText= promtpAlert.getText();
	    
	    System.out.println("The Prompt Alert text:"+ promptAlertText);
		promtpAlert.sendKeys("MarwaY");
		promtpAlert.accept();
		
		
		
		
		/**
		 * To handle Alerts in JavaScript we can use Alert Class 
		 *  in JavaScript we have 3 kind of Alerts 
		 *  1/Alert Box
		 *  2/Confirm Box
		 *  3/Prompt box 
		 * 
		 * 
		 *  
		 */
		
		
		
		
		
		
	}

}
