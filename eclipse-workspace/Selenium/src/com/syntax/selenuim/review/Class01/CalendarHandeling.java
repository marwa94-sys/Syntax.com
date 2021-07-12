package com.syntax.selenuim.review.Class01;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import com.syntax.utils.CommonMethods;

public class CalendarHandeling extends CommonMethods{//Access to the all methods 
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://jqueryui.com/");
		
		WebElement datepikerButton=driver.findElement(By.xpath("//a[text()='Datepicker']"));
		
		wait(10);
		
		datepikerButton.click();
		
		WebElement frame=driver.findElement(By.className("demo-frame"));	
		//3 way that  we can handle the frame 
		   //By WebElement 
		 driver.switchTo().frame(frame);
		 
		 wait(15);
		 
		WebElement calender= driver.findElement(By.id("datepicker"));
		
		//click(calender);  -->Will throw an exception NullPointerException =-----> Because we have driver initialized in line 13 and 15
		 calender.click();
		 
		 String departMonth="August 2020";
		 
		
		while(true) {	
			WebElement nextButton=driver.findElement(By.xpath("//span[text()='Next']"));
		    String monthText= driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		
			System.out.println(monthText);
			if(!departMonth.equals(monthText)) {
				nextButton.click();
			}else {
				break; //In this situation we will need the else to break the loop, otherwise the loop not going to stoop. It will loop and loop and you might get an error  
			}}
		
		
	/*	List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		selectCalenderDate(dates, "10");
		driver.switchTo().defaultContent();
		//Prove the test case if paste or failed :when ever you say that you crate a defect a debuf and they start to reject in it that is why we need Screenshot 
		
		TakesScreenshot tS= (TakesScreenshot)driver;//---> down casting it to driver 
	     File pic=tS.getScreenshotAs(OutputType.file);  //impot the file //what is going to give us ---> it is gonna store the screenShot That we took in the file which is coming from Java 
	     //It the line 65 we took the screenShot 
	     FileUtil*/
		
		
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class = 'ui-datepicker-calendar']/tbody/tr/td"));
		selectCalenderDate(dates, "10");
		driver.switchTo().defaultContent();

		TakesScreenshot ts = (TakesScreenshot)driver;
		File pic = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(pic, new File("screenshots/HRMS/calendar.png"));
		driver.quit();
		// to handle window based pop ups and upload files you can use RObot class or AutoIT
		
		
		
		
		
		
		
	}
}
