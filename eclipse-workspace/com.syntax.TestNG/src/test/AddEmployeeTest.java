package test;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.utils.CommonMethods;
import com.utils.ConfigsReader;
import com.utils.ExcelUtility;

public class AddEmployeeTest extends CommonMethods {

	

	
	
/*	@Test
	public void addEmployeeAdd() {
		 login.login(ConfigsReader.getProperty("username"),ConfigsReader.getProperty("password"));
		  dashboard.navigateToAddEmployee();
		  wait(7);
		  
		  //sendText(addEmp., text);

	
	//Add assertion to verify that employee has been added  successfully
	}*/
	
	
	@Test (dataProvider = "userDataFromExcel", groups = {"homework","addEmp","regression"})
	public void test(String firstName,String lastName,String username,String password) {
		//System.out.println(firstName+""+lastName+""+userName+""+password);
		//Login into Hrms
		login.login(ConfigsReader.getProperty("username"),ConfigsReader.getProperty("password"));
		dashboard.navigateToAddEmployee();
		wait(3);
		
		//Add employee information
		
				sendText(addEmp.firstName, firstName);
				sendText(addEmp.lastName, lastName);
				// get EmployeeID
				String expectedEmpId = addEmp.employeeId.getAttribute("value");

				// click on Create Login Details
				click(addEmp.checkboxLoginDetails);
				wait(1);
				sendText(addEmp.username, username);
				sendText(addEmp.password, password);
				sendText(addEmp.confirmPassword, password);
				wait(1);
				jsClick(addEmp.saveBtn);
				wait(1);

				// validation
				waitForVisibility(pdetails.lblPersonalDetails);
				String actualEmpId = pdetails.employeeId.getAttribute("value");
				Assert.assertEquals(actualEmpId, expectedEmpId, "Employee ID did not match!");

				// take screeshot
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
		
    return	 ExcelUtility.excelIntroArray(System.getProperty("user.dir")+"\\testData\\Test.xlsx","Sheet1");
    	 
	}	
	
	
	
	
	
}
