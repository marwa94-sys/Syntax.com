package com.syntax.selenuim.review.Class01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class AmazonTask extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		

		setUp();
		
	  WebElement searchDropdownBox=driver.findElement(By.id("searchDropdownBox"));
	  Select select = new Select(searchDropdownBox);
	    List<WebElement>option= select.getOptions();
	          for(WebElement DD:option) {
					String ddOtption=  DD.getText();
					System.out.println(ddOtption);
		        }
	  
	  select.selectByVisibleText("Books");
		
	  WebElement searchTextBox =driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
	  searchTextBox.sendKeys("Harry Potter");//Wait until the whole pages loaded we using method get to wait until the page get loaded
	  
	  WebElement searchButton=driver.findElement(By.xpath("//input[@type='submit'][@class='nav-input']"));
	  searchButton.click();
		
	  List<WebElement> bookSeriesCheckBoxes=driver.findElements(By.className("a-spacing-micro"));
	  
		 for(WebElement bookSeriesCheckBoxe:bookSeriesCheckBoxes) {
			String checkBoxText= bookSeriesCheckBoxe.getText();
			   
			if(checkBoxText.equals("Unofficial Cookbook") && !bookSeriesCheckBoxe.isSelected()){
				Thread.sleep(2000);
				bookSeriesCheckBoxe.click();
				break;
			}}
		 
		 

	
	
	}
}
