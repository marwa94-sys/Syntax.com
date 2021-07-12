package comhrms.API.utils;

import org.json.JSONObject;

import com.hrms.API.steps.practice.HardCodeExamples;

public class PayloadConstants {
	
	
	/**
	 * Create employee body
	 * @return
	 */
	public static String createEmployeeBody() {
		String createEmployeeBody="{\r\n" + 
				"  \"emp_firstname\": \"abc\",\r\n" + 
				"  \"emp_lastname\": \"mayadream\",\r\n" + 
				"  \"emp_middle_name\": \"mana\",\r\n" + 
				"  \"emp_gender\": \"F\",\r\n" + 
				"  \"emp_birthday\": \"2020-07-20\",\r\n" + 
				"  \"emp_status\": \"Freelance\",\r\n" + 
				"  \"emp_job_title\": \"Application Developer\"\r\n" + 
				"}";
		return createEmployeeBody;
	}
	
	
	/**
	 * Creating payload using JSONObject and returning it as a string 
	 * We are returning 
	 * @return
	 */
	public static String createEmployeePayload() {
		JSONObject obj= new JSONObject();
		obj.put("emp_firstname", "abc");
		obj.put("emp_lastname", "mayadream");
		obj.put("emp_middle_name", "mana");
		obj.put("emp_gender", "F");
		obj.put("emp_birthday", "2020-07-20");
		obj.put("emp_status", "Freelance");
		obj.put("emp_job_title", "Application Developer");
		return obj.toString();
		
		
		
	}
	
	/**
	 * Create method to return payload - to reduce messy code 
	 * @return
	 */
	public  static String updateCreatedEmpBody() {
		String updateBody=" \"employee_id\": \""+HardCodeExamples.employeeID+"\",\r\n" + 
	 			"  \"emp_firstname\": \"Alaa\",\r\n" + 
	 			"  \"emp_lastname\": \"Alaa Syntax\",\r\n" + 
	 			"  \"emp_middle_name\": \"string\",\r\n" + 
	 			"  \"emp_gender\": \"F\",\r\n" + 
	 			"  \"emp_birthday\": \"1990-07-17\",\r\n" + 
	 			"  \"emp_status\": \"Seasonal Employee\",\r\n" + 
	 			"  \"emp_job_title\": \"Production Manager\"";
	return updateBody;
	}

	
	
	
	
	
	
}
