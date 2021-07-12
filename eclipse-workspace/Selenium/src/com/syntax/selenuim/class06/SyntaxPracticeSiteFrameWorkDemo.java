package com.syntax.selenuim.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.syntax.utils.BaseClass;

public class SyntaxPracticeSiteFrameWorkDemo {
	
	public static void main(String[] args) {
		
		WebDriver driver=BaseClass.setUp();
		
		driver.switchTo().frame("//iframe[@name='FrameOne']");
		
	    boolean isDisplayed=driver.findElement(By.id("hide")).isDisplayed();
	    
		System.out.println(isDisplayed);
		
		driver.switchTo().defaultContent();//Switching back to parent content.
		
		


		driver.switchTo().frame("FrameTwo");//switch to frameTwo by name.
		
		boolean enrolBtnIsEnabled=driver.findElement(By.className("enroll-btn")).isEnabled();
		
		System.out.println("Enrol Button inside frame Two is Enabled:: "+enrolBtnIsEnabled);

		BaseClass.tearDown();

		
		
		
		
		
		
		
		
	}

}
