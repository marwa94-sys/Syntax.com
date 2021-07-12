package com.syntax.selenuim.class0501;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import com.syntax.utils.BaseClass;

public class DropDownDemo03 extends BaseClass {
	
	public static void main(String[] args) {
		
		ArrayList<String> expectedList= new ArrayList<>();
		expectedList.add("Asia");
		expectedList.add("Europe");
		expectedList.add("Africa");
		expectedList.add("Australia");
		expectedList.add("South America");
		
		
		
		setUp();
		
		WebElement continenets=driver.findElement(By.id("continents"));
		
		Select select = new Select(continenets);
		
        select.selectByValue("NA");
        
        List<WebElement>option=select.getOptions();
        
         Iterator<WebElement>it=option.iterator();
        
      while (it.hasNext()) {
    	  
    	String text=  it.next().getText();
    	  System.out.println(text);
	}
      
      if (expectedList.containsAll(option)) {
    	  System.out.println("The list  matches");
      }else {
		System.out.println("The list did  not  matches");
	}
		
		
		
		
		
		
		
		
	}

}
