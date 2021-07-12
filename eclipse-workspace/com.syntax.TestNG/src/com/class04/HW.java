package com.class04;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utils.CommonMethods;
import com.utils.ConfigsReader;
import com.utils.ExcelUtility;

public class HW extends CommonMethods {
	
	
	
	@Test (dataProvider = "userDataFromExcel", groups = {"homework","addEmp","regression"})
	public void test(String FirstName,String LastName,String Username,String Password) {
		//System.out.println(firstName+""+lastName+""+userName+""+password);
		//Login into Hrms
		login.login(ConfigsReader.getProperty("username"),ConfigsReader.getProperty("password"));
		dashboard.navigateToAddEmployee();
		wait(3);
		
		//Add employee information
		
				sendText(addEmp.firstName, FirstName);
				sendText(addEmp.lastName, LastName);
				
				// get EmployeeID
				String expectedEmpId = addEmp.employeeId.getAttribute("value");

				// click on Create Login Details
				click(addEmp.checkboxLoginDetails);
				wait(1);
				sendText(addEmp.username, Username);
				sendText(addEmp.password, Password);
				sendText(addEmp.confirmPassword, Password);
				wait(1);
				jsClick(addEmp.saveBtn);
				wait(1);

				// validation
				waitForVisibility(pdetails.lblPersonalDetails);
				String actualEmpId = pdetails.employeeId.getAttribute("value");
				Assert.assertEquals(actualEmpId, expectedEmpId, "Employee ID did not match!");

				takeScreenShot(FirstName+"-"+LastName);
				//TakesScreenshot(firstName + "_" + lastName);
			}

	
	
	@DataProvider (name = "userData")
	public Object [][] getData(){
		Object [][] data= {
				           {"Raj","Capoor","raj@123","Amirkhan@123"},
					       // {"John","Smith","john@123","Amirkhan@123"},
						  // {"Mary","Ann","mary@123","Amirkhan@123"},
				   		  // {"Rohani","Sakhi","Rohani@123","Amirkhan@123"}
						   };
		return data;
	}
	
     @DataProvider(name="userDataFromExcel")
	public Object [][] getData2(){
		
    return	 ExcelUtility.excelIntroArray(System.getProperty("user.dir")+"\\testData\\Test.xlsx", "Employee");
    	 
	}	
	
	
	
	

}
