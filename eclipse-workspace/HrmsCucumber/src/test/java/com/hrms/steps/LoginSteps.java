package com.hrms.steps;



import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends CommonMethods{
	
	

	@When("user click on login button")
	public void user_click_on_login_button() {
        click(login.loginBtn);
	}

	@Then("admin user is successfully logged in")
	public void admin_user_is_successfully_logged_in() {
	   
	}

	@When("user enters valid ess username and password")
	public void user_enters_valid_ess_username_and_password() {
	    
	}

	@Then("user is successfully logged in")
	public void user_is_successfully_logged_in() {

	}

	@When("user entres valid usernmae and invalid password")
	public void user_entres_valid_usernmae_and_invalid_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user see invalid credentials test on login page")
	public void user_see_invalid_credentials_test_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
	

}
