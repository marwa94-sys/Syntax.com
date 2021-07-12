package com.syntax.test;

import com.pages.LoginPageElement;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class LoginPageTest  extends CommonMethods{
	
	public static void main(String[] args) {
		setUp();
		
		LoginPageElement login= new LoginPageElement();
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.LoginBtn);
		
		DashBoardPageElements dashboard= new DashBoardPageElements();
		
		
	}

}
