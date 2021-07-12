package com.hrms.steps;

import java.util.List;
import java.util.Map;

import com.hrms.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauceDemoLoginSteps extends CommonMethods {
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	
	}

	@When("user enters invalid username")
	public void user_enters_invalid_username() {
	sendText(SauceLogin.userName, "Admin");
	}
	@When("user enters invalid password")
	public void user_enters_invalid_password() {
	   sendText(SauceLogin.password, "Admin@123"); 
	}

	@When("click on login button")
	public void click_on_login_button() {
	   click(SauceLogin.LoginBTN);
	}

	@Then("user should see the error message")
	public void user_should_see_the_error_message() {
	 System.out.println("User can see error message");
	}
	
	@When("user enter invalid username as {string}")
	public void user_enter_invalid_username_as(String userName) {
	System.out.println(userName);
	}

	@When("user enter invalid password as {string}")
	public void user_enter_invalid_password_as(String password) {
	 System.out.println(password);
	}
	

@Given("i open database connection")
public void i_open_database_connection() {
   System.err.println("*****************************");
}

@When("user enter invalid username")
public void user_enter_invalid_username(String docString) {
 System.out.println(docString);
}

@When("user enters invalid username as below")
public void user_enters_invalid_username_as_below(DataTable dataTable) {
 for(Map<String,String>data:dataTable.asMaps()) {
	System.err.println(data.get("username"));
 }
 
}



}
