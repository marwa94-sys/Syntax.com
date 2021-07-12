package com.hrms.steps;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UIvsDatabaseValidation {
	
	
	
	@Given("user is on employee list page")
	public void user_is_on_employee_list_page() {
	 
	}

	@When("user retrive all data from the ui table")
	public void user_retrive_all_data_from_the_ui_table() {
System.out.println("user retrieves values from ui table");
	}

	@When("user retrieves all the data from database using below query")
	public void user_retrieves_all_the_data_from_database_using_below_query(DataTable query) {
        System.err.println(query.asList().get(0));
	}

	@Then("user compare both data and it should match")
	public void user_compare_both_data_and_it_should_match() {
	    
	}

	@Then("user logs out")
	public void user_logs_out() {
	   
	}
	
	@Given("user validate that drop down conttains following values")
	public void user_validate_that_drop_down_conttains_following_values(List<String> ddvalue) {
	for(int i=0; i<ddvalue.size();i++) {
		System.err.println(ddvalue.get(i));
	}
	}
	
	@Then("user enters following data set")
	public void user_enters_following_data_set(DataTable data) {
		System.err.println(data.asList().get(0));
		System.err.println(data.asList().get(1));
	}
	
	@Then("user click on add employee page")
	public void user_click_on_add_employee_page() {
	   
	}

	@Then("user add the following employees\"<FirstName>\"and\"<MiddleName>\"and \"<LastName>\"and click on save btn")
	public void user_add_the_following_employees_FirstName_and_MiddleName_and_LastName_and_click_on_save_btn(DataTable dataT) {
	for(Map<String, String>data:dataT.asMaps()) {
		System.err.println(data.get("FirstName"));
	
		System.out.println(data.get("MiddleName"));

		System.out.println(data.get("LastName"));
	}
	}




}
