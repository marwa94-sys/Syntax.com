package com.syntax.test;

import com.pages.LoginPage;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class HrmsLogin extends CommonMethods{
 
	public static void main(String[] args) {
	
		
		setUp();
		
		LoginPage login= new LoginPage();
		
		sendText(login.username, ConfigsReader.getProperty("username"));
		
		sendText(login.password, ConfigsReader.getProperty("password"));
		
		
	    click(login.loginBtn);
	    
	    wait(5);
	    
	    tearDown();
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
}
