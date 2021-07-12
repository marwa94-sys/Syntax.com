package com.syntax.selenuim.review.Class01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class getAllLinks  extends BaseClass{
	
    public static void main(String[] args) {
		
    	
    	setUp();
    	
    	List<WebElement>alllinks=driver.findElements(By.tagName("a"));
    	
    	int numberOfLinks=alllinks.size();
    	
    	System.out.println(numberOfLinks);
    	
    	for(WebElement link:alllinks) {
    		String textOfLink=link.getText();
    		 String links=link.getAttribute("href");
    		System.out.println(textOfLink+" "+links);
    	}
    	
    	
    	
    	
    	
    	
    	
	}

}
