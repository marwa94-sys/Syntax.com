package com.hrms.steps;


import org.junit.Assert;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;
import com.hrms.utils.GlobalVariables;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeSearchSteps extends CommonMethods{
	
	

	@Given("user is navigated to HRMS")
	public void user_is_navigated_to_HRMS() {
		setUp();
	}
	
	

	@When("user entres valid admin username and password")
	public void user_entres_valid_admin_username_and_password() {
		 sendText(login.username,ConfigsReader.getProperty("username"));
		 sendText(login.password,ConfigsReader.getProperty("password"));
		 click(login.loginBtn);
	   
	}

	@Given("user navigate to employee list page")
	public void user_navigate_to_employee_list_page() {
	  dashboard.navigateToSearchEmployee();
	}
	
	
	

	@When("user enters valid employee id {string}")
	public void user_enters_valid_employee_id(String EmpID) {
	sendText(viewEmpelements.empID, EmpID);
	GlobalVariables.empID=EmpID;
	}
	
	
	

	@When("click on search button")
	public void click_on_search_button() {
	  jsClick(viewEmpelements.searchBtn);
	}
	
	

	@Then("user see employee information is displayed")
	public void user_see_employee_information_is_displayed() {
	    System.out.println("Employee is displayed");
	}
	
	
	

	@When("user enters valid employee name and last name")
	public void user_enters_valid_employee_name_and_last_name() {
		sendText(viewEmpelements.empName, "Marwa Yaghourtne");
	}

	
	@When("user entres valid employee id {string}")
	public void user_entres_valid_employee_id(String string) {
	
	}

	@Then("verify table is dispaly")
	public void verify_table_is_dispaly() {
	   Assert.assertEquals(true, viewEmpelements.isTableDisplayed());
	}


	@Then("get data from db")
	public void get_data_from_db() {
      System.out.println(viewEmpelements.getFirstNameFromTable());
	}

	@Then("validate first name from ui against db")
	public void validate_first_name_from_ui_against_db() {
    Assert.assertEquals(DBSteps.dbData, viewEmpelements.getFirstNameFromTable());
	}

	
	
	
	
	
	

}
