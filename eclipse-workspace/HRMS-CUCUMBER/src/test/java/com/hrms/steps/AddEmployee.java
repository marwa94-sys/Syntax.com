package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.eventusermodel.dummyrecord.LastCellOfRowDummyRecord;
import org.junit.Assert;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.Constants;
import com.hrms.utils.ExcelUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployee extends CommonMethods {

	@Given("user navigates to AddEmployeePage")
	public void user_navigates_to_AddEmployeePage() {
		dashboard.navigateToAddEmployee();
	}

	@When("user entres employee firstName and lastName")
	public void user_entres_employee_firstName_and_lastName() {
		sendText(addEmp.firstName, "Maya");
		sendText(addEmp.lastName, "Yara");
	}

	@When("user clicks save button")
	public void user_clicks_save_button() {
		click(addEmp.saveBtn);
	}

	@Then("user is added successfully")
	public void employee_is_added_successfully() {
		String actual = pdetails.profilepic.getText();
		String expected = "Maya Yara";
		Assert.assertEquals(expected, actual);
	}

	@When("user delete employee id")
	public void user_delete_employee_id() {
		addEmp.employeeId.clear();
	}

	@When("user clicks on create login checkbox")
	public void user_clicks_on_create_login_checkbox() {
		click(addEmp.checkboxLoginDetails);
	}

	@When("user entres login credentials")
	public void user_entres_login_credentials() {
		addEmp.createEmployeeLoginCR();

	}

	@When("user entres employees first and last name")
	public void user_entres_employees_firstName_and_lastName() {
		sendText(addEmp.firstName, "Maya");
		sendText(addEmp.lastName, "Yara");
	}



	@When("user clikcs save button")
	public void user_clikcs_save_button() {

	}



	@When("user enters employee details and click on save")
	public void user_enters_employee_details_and_click_on_save(io.cucumber.datatable.DataTable dataTable) {

		List<Map<String, String>> addEmployeeList = dataTable.asMaps();

		for (Map<String, String> map : addEmployeeList) {

			String fnam = map.get("firstName");
			String lName = map.get("lastName");

			sendText(addEmp.firstName, map.get(fnam));
			sendText(addEmp.lastName, map.get(lName));
			click(addEmp.saveBtn);
			click(dashboard.addEmp);

			String actual = pdetails.profilepic.getText();
			String expected = fnam + "" + lName;
			Assert.assertEquals("Employee is not added successfully ", expected);
			click(dashboard.addEmp);
			wait(5);

		}
	}
	

	
	@When("user enter employee {string}, {string} and {string}")
	public void user_enter_employee_and(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("{string}, {string} and {string} is Added successefully")
	public void and_is_Added_successefully(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	

	@When("user enters employee data from {string} execl sheet then employee is added")
	public void user_enters_employee_data_from_execl_sheet_then_employee_is_added(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


	@Then("emplyee is added")
	public void employee_is_added() {
		System.out.println("-------- Employee is added using datatable");
	}
	
}
