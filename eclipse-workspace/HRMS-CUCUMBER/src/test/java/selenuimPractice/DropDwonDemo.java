package selenuimPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDwonDemo  {
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.getProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		WebElement weekDD= driver.findElement(By.id("sdbf"));
		
		Select select=new Select(weekDD);
	    
		/**
		 * Selenuim provides three different ways to select value from DD 
		 * 1/ By index
		 * 2/ By value
		 * 3/ By visible Text  
		 */
	
	   select.deselectByIndex(4);
	   
	   List<WebElement> options=select.getOptions();
	   System.out.println("The size of the week DD is : "+ options.size());
	    
	   
	   for(int i=0; i<options.size(); i++) {
		   select.selectByIndex(i);
		   Thread.sleep(5000);
	   }
		
	   select.selectByVisibleText("Monday");
	   
	   //===============================================================================================================
	   
	   
	   WebElement content= driver.findElement(By.id("Content"));
	   
	   Select select1= new Select(content);
	    
	   
	   //To get the size of the DD we should stored in list of webelement
	    
			 List<WebElement>options1=  select1.getOptions();  // This will returns list of  all options in the dd 
			 
			 System.out.println(options1.size());
			 
		    for(WebElement list: options1) {
		    	String text= list.getText();
		    	System.out.println(text);
			    	
		    	    if(text.equals("Africa")) {
			    	list.click();
			    	String  ddText= list.getText();
			    		
		    		       if (ddText.equals("Africa")) {
						    System.out.println("Africa is selected " + list.isSelected());
					       }else {
					     	System.err.println("Africa is not selected");
					       }
		    	}
		    } 
				
	
	    
	 //=======================================   
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		
	}
	}
