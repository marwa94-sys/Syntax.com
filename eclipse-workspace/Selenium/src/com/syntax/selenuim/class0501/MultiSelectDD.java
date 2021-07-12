package com.syntax.selenuim.class0501;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import com.syntax.utils.BaseClass;

public class MultiSelectDD  {
	
	public static void main(String[] args) throws InterruptedException {
		
		
	WebDriver driver=BaseClass.setUp();
	
	WebElement multiSelectDD=driver.findElement(By.id("continentsmultiple"));
	
	Select select = new Select(multiSelectDD);
	
    boolean ismultiple=	select.isMultiple();
	
    System.out.println("This DropDown is Multiple Select?:"+ ismultiple );
	
	if(ismultiple) {
		select.selectByIndex(1);
		select.selectByIndex(3);
		select.deselectByIndex(1);
		select.selectByVisibleText("South America");
		Thread.sleep(2000);
		//select.deselectByIndex(1);
		select.deselectAll();
		
	}
	
	
		
		
	}

}
