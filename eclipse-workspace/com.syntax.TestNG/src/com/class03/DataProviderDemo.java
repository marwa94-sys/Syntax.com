package com.class03;

import org.testng.Assert;
import org.testng.annotations.*;

import com.utils.CommonMethods;

public class DataProviderDemo extends CommonMethods {
	
	@Test(dataProvider = "getData") 
	public void login(String username,String password, int age) {
		System.out.println(age);
		sendText(login.username, username);
		sendText(login.password, password);
		click(login.loginBtn);
		
		
		boolean isDisplayed= dashboard.welcome.isDisplayed();
		Assert.assertTrue(isDisplayed,"Welcome msg is not displayed");
		
	}
	
	
	@DataProvider
	public Object[] [] getData(){
		Object[][] data= {{"Admin","Hum@nhrm123",42},
				           {"Syntax","Syntax123",63},
	         	          {"SyntaxUser","Syntax123!",66}
		};
		return data;
		}
	
	
	

}
