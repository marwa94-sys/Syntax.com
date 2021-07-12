package com.hrms.steps;
import java.util.List;
import java.util.Map;
import com.hrms.utils.DBUtils;
import com.hrms.utils.GlobalVariables;
import io.cucumber.java.en.Then;


public class DBSteps {
	
	
	public static List<Map<String, String>> dbData;
	
	@Then("get frist name form table")
	public void get_frist_name_form_table() {
		
			String sqlQuery = "select emp_firstname from hs_hr_employees where employee_id = " + GlobalVariables.empID;
			dbData = DBUtils.storeDataFromDB(sqlQuery);
		}

	}



