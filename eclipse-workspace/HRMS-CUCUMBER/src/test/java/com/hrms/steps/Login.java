package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.apache.http.auth.InvalidCredentialsException;
import org.junit.Assert;

import com.hrms.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends CommonMethods {
	
	

@When("user click on login button")
public void user_click_on_login_button() {
    click(login.loginBtn);
    wait(3);
  
}




@Then("admin user is successfully logged in")
public void admin_user_is_successfully_logged_in() {
	String expected ="Welcome Admin";
	String actual=dashboard.welcome.getText();
	Assert.assertEquals("Welcome message is not displayed or not correct",expected,actual);
	System.out.println(actual);
	
}




@When("user entres valid ess {string} and {string}")
public void user_entres_valid_ess_username_and_password(String username , String password) {
	 sendText(login.username,username);
	 sendText(login.password,password);
}

@Then("ess user is successfully logged in")
public void ess_user_is_successfully_logged_in() {
	String expected ="Welcome Elvira";
	String actual=dashboard.welcome.getText();
	Assert.assertEquals( "Welcome message is not displayed or not correct",expected,actual);
	

	
}



@When("user entres valid username and invalid password")
public void user_entres_valid_username_and_invalid_password() {
   login.login("Admin", "Syntax123");
}



@When("user enter valid admin username and password")
public void user_enter_valid_admin_username_and_password() {
   
}

@When("user enter valid {string} and {string}")
public void user_enter_valid_and(String string, String string2) {

}

@Then("{string} is successeffully logged in")
public void is_successeffully_logged_in(String string) {
 
}

@When("user enter valid username and invalid password")
public void user_enter_valid_username_and_invalid_password() {

}

@Then("user see invalid credentials text on login page")
public void user_see_invalid_credentials_text_on_login_page() {
 
}




@Then("user see Invalid Creddentiald text on login page")
public void user_see_Invalid_Creddentiald_text_on_login_page() {
   System.out.println("User can see text valid login credentials loged");
}


@When("I enter invalid username and password and see error message")
public static void I_enter_invalid_username_and_password_and_see_error_message(DataTable InvalidCredentials) {
	List<Map<String, String>>list=InvalidCredentials.asMaps();
	for(Map<String, String>map:list) {
		sendText(login.username, map.get("username"));
		sendText(login.password, map.get("password"));
		click(login.loginBtn);
		
		Assert.assertEquals("Not correct error message is displayed",map.get("ErrorMessage"), login.errorMsg.getText());
	}
//	List<Map<String, String>>list=InvalidCredentialsException.asMap();
	
}

	
	
	
	
	

}
