package com.hrms.steps;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeSearchSteps extends CommonMethods{
	
	
	@Given("user navigated to HRMS")
	public void user_navigated_to_HRMS() {
	   setUp();
	}
	
	

	@Given("user is logged with valid admin credentials")
	public void user_is_logged_with_valid_admin_credentials() {
	    sendText(login.username, ConfigsReader.getProperty("username"));
	    sendText(login.password, ConfigsReader.getProperty("password"));
	    click(login.loginBtn);
	 }
	
	
	
	@Given("user navigated to employee list page")
	public void user_navigated_to_employee_list_page() {
	    click(dashboard.PIM);
	    click(dashboard.empListPage);
	}
	
	

	@When("user enters valid employee id")
	public void user_enters_valid_employee_id() {
		
	    sendText(viewEmp.empName, "10079");
	}

	
	@When("click on search button")
	public void click_on_search_button() {
	    click(viewEmp.serachBtn);
	}

	
	@Then("user see empoyee information is displayed")
	public void user_see_empoyee_information_is_displayed() {
	   System.out.println("Employee informations are displayed");
	}

	
	
	
	
	
	


}
