package com.syntax.selenuim.class06;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.syntax.utils.BaseClass;

public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException{
	
    WebDriver driver=BaseClass.setUp();  //Below code is for UItestPractise
    
	WebElement alertBox=driver.findElement(By.xpath("//input[@value='alert box']"));
	alertBox.click();
	//driver.findElement(By.xpath("//input[@value='confirm box']")).click();
	
	
	
	//Handling simple alert/PopUps
   	Alert simpleAlert=driver.switchTo().alert();
   	Thread.sleep(1000);
    String simpleAText=simpleAlert.getText();
    System.out.println("The simple alert text: "+simpleAText);
    Thread.sleep(1000);
    simpleAlert.accept();
    
    
    
    
    //Handling confirmation Alert
    driver.findElement(By.xpath("//input[@value='confirm box']")).click();
	Alert confirmAlert=driver.switchTo().alert();
	Thread.sleep(2000);
	String confirmAtext=confirmAlert.getText();
	System.out.println("The confirmation alert text :"+confirmAtext);
	Thread.sleep(1000);
	confirmAlert.dismiss();
	
	
	
	
	//Handling prompt alerts/confirmation alerts by providing some confirmation message 
	driver.findElement(By.xpath("//input[@value='prompt box']")).click();
	Alert promptAlerts=driver.switchTo().alert();
	Thread.sleep(1000);
	String prompttext=promptAlerts.getText();
	System.out.println("The prompt text :"+prompttext);
	promptAlerts.sendKeys("Marwa");
	Thread.sleep(2000);
	promptAlerts.accept();
	Thread.sleep(2000);
	
	
	//driver.findElement(By.xpath("//dic[@id='demo']")).getText();
   //System.out.println(text);
  /* if(Text.contains("Marwa")) {
	   System.out.println("Text was seccessfully added");
   }else {
	   System.out.println("Text was not entered");
   }*/
	
    BaseClass.tearDown();
	

	
	
	
	
	
	
	
	
	
	
	
	
		
	}
}
