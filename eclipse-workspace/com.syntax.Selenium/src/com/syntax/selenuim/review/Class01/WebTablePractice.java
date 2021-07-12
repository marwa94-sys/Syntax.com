package com.syntax.selenuim.review.Class01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePractice {
	
      public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("http://testingpool.com/data-types-in-java/");
	
	//getting column number
	List<WebElement> rows=driver.findElements(By.xpath("//div[contains(@class,'su-table')]/table/tbody/tr"));
	int rowaNum=rows.size();
	System.out.println("Total row numbers is : "+rowaNum);
	
	List<WebElement>cols=driver.findElements(By.xpath("//div[contains(@class,'su-table')]/table/tbody/tr[1]/td"));
	int colsNum=cols.size();
	System.out.println("Total number of cols is : "+colsNum);//What kind of manipulation we did here (+)--> concatination
	
	//Extracting cell data 
	for(int r=1; r<=rows.size();r++) {
		for(int c=1;c<=cols.size(); c++) {  // the purpose of nested to access the data 
			WebElement cellData= driver.findElement(By.xpath("//div[contains(@class,'su-table')]/table/tbody/tr["+r+"]/td["+c+"]"));
			String cellDatatext= cellData.getText();
		//	System.out.println(cellDatatext);
			
			if(c==2) {
				System.out.println(cellDatatext);
			}
			
			
			
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}}
