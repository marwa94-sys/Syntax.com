package com.syntax.selenuim.class0901;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.syntax.utils.CommonMethods;

public class HW1 extends CommonMethods {
  


	//Tase Case : Delete employee
	/*
	 * Open chrome browser 
	 * Go to "http://166.62.36.207/humanresources/symfony/web/index.php/auth";
	 * Login into application
	 * Add employee 
	 * Verify Employee has been added
	 * Go to Employee List
	 * Delete added Employee
	 * Quit the browser  
	 */
	
     	public static void main(String[] args) throws InterruptedException, IOException {
	
     		
     		
     		setUp();
     		
     		//Login into  HRMS
     		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
     		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
     		driver.findElement(By.id("btnLogin")).click();
     		
     		
     		//Navigate to add employee
     		driver.findElement(By.linkText("PIM")).click();
     		
     		Thread.sleep(500);
     		driver.findElement(By.linkText("Add Employee")).click();
     		WebDriverWait wait= new WebDriverWait(driver, 30);
     		
     		
     		//Adding an employye
     		String enterName="Mana";
     		String enterMiddleName="";
     		String enterLastname="jhdos";
     		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName")));
     		driver.findElement(By.id("firstName")).sendKeys(enterName);
     		driver.findElement(By.id("middleName")).sendKeys(enterMiddleName);
     		driver.findElement(By.id("lastName")).sendKeys(enterLastname);
     		driver.findElement(By.id("btnSave")).click();
     		
     		//Store an employee id 
     		String employeeID=driver.findElement(By.id("EmployeeId")).getAttribute("value");     		
     		driver.findElement(By.id("btnSave")).click();
     		
     		
     		//Verify employee was added 
            String EmployeeDetails= driver.findElement(By.id("profile-pic")).getText();
            if (EmployeeDetails.equals(enterName+" "+enterLastname)) {
            	System.out.println("Employee added successfully");
			}else {
				System.out.println("Employee NOT added ");
			}
            
            
            //Navigate to the employee List
            driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
            
           TakesScreenshot tS=(TakesScreenshot)driver;//istract our d  ---> downcast webdriver to the type of TakesScreenshot
           File screen= tS.getScreenshotAs(OutputType.FILE);//With variable  of a type of Screenshot 
         //  FileUtils.copyFile(screen, new File("Screenshots/HRMS/AdminLogin.png"));  //allows us to perform file manipulations
           
            
            
            
            
            
            
            
            //Get the first table from the employee list
            
          /*  boolean found=false;
            
            while(!found) {
            List<WebElement>rows_f=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td"));
            for(int i=1; i<=rows_f.size();i++) {
            	String rowsText=rows_f.get(i-1).getText();
            	if(rowsText.contains(employeeID)) {
            		found=true;
            		driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[1]"));
            		driver.findElement(By.id("btnDelete")).click();
            		driver.findElement(By.id("dialogDeletBtn")).click();
            		break;
            	}
            	
            }
            
            Thread.sleep(2000);
            driver.quit();
            }
     		
     		*/
     		
     		
     		
	}
	}
