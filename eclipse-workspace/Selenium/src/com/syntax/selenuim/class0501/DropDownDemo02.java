package com.syntax.selenuim.class0501;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class DropDownDemo02 extends BaseClass {

      public static void main(String[] args) throws InterruptedException {
		
        setUp();
    	  
    	WebElement contients=  driver.findElement(By.id("continents"));
    	  
		Select select=new Select(contients);
		
		List<WebElement>options=select.getOptions();//It will return list of all options in the DD
		
		for(WebElement option:options) {//Loop on above options list
		String text=	option.getText();
		System.out.println(text);
		
		if(text.equals("Africa")) {
			option.click();
			String gettext=option.getText();
			if(gettext.equals("Africa")) {
				System.out.println("Africa is selected :"+option.isSelected());
			}else {
				System.out.println("Africa is not selected");
			}
			Thread.sleep(2000);
			
		}
			
		}
		
		//select.selectByVisibleText("Antarctica");// Can select an option by visible text 
		//In the parameter 
		
		boolean isMultiple=select.isMultiple();//IsMultiple();
		
		System.out.println("The continents DD  is Multuple ::::::"+isMultiple);
		
		tearDown();
		
		
	}
	
	
	
	
}
