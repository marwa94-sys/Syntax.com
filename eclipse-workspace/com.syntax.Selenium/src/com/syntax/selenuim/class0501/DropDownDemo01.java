package com.syntax.selenuim.class0501;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class DropDownDemo01 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		
		setUp();//Open chrome browser and lunch Syntax Practice Site 
		
		
	   WebElement weeeDD=driver.findElement(By.id("select-demo"));
		
	   Select select= new Select(weeeDD);//Object select class accepts Webelement 
	   
	
	
	    /*
	     * Selenuim allows  three methods to select a value from a .
	     * 1) By INDEX
	     * 2)BY visible Text
	     * 
	     * */
	   
	   
	   
	   List<WebElement>options= select.getOptions();
	   
	   System.out.println("Number of options in the DD:"+options.size());
	   
	   
	   //Select By index
	  select.selectByIndex(1);
	  for(int i=1;i<options.size();i++) {
		   select.selectByIndex(i);
		   Thread.sleep(1000);
	   }
	  
	  //Select by InvisibleText
	  select.selectByVisibleText("Friday");
	  
	 
	  
	    Thread.sleep(3000);
				   
	    tearDown();
		
	   
	   
	   
	   
	   
	   
	}

}
