package com.hrms.API.steps.practice;


import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
/**
 * Rest Assured static package
 */
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

/**
 * importing JUnit package
 */
import org.junit.Assert;
import org.junit.Test;

//Please import 
import org.junit.*;
import org.junit.runners.MethodSorters;

import comhrms.API.utils.PayloadConstants;

/**
 * 
 *We may use below - please comment out for now
 *
 */
//import org.apache.hc.core5.http.ContentType;


/**
 * This @FixeMethodOrder(MethodSorters.Name_Acsending) will execute @Test annotation in acsending 
 * Alphabetical order
 *
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class HardCodeExamples {
	
	
	/**
	 * Rest Assured
	 * 
	 * Given - prepare your request
	 * When- you are making the call to the endpoint
	 * Then - validating
	 * 
	 * @param args
	 */
	
	  static String BaseURI = RestAssured.baseURI="http://18.232.148.34/syntaxapi/api"; 
	  static String token="eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1OTk0ODY1NjgsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU5OTUyOTc2OCwidXNlcklkIjoiMTEwMyJ9.A6GLorEIMN5hG3sLl8HjjwQcgJfjiVPbf-xiMAn7vrw";
	  public static String employeeID;

	
	public void sampleTestNotes() {
		/**
		 * Base URI for all calls 
		 */
	
		RestAssured.baseURI="http://18.232.148.34/syntaxapi/api";  //URL
		
		/**
		 * JWT required for all calls - expires every 12 hours
		 */
	String token="Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1OTkxODMzNzUsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU5OTIyNjU3NSwidXNlcklkIjoiMTEwMyJ9.O95szPqkT84alh0cho5gx2d8pB9HIj1--bB6p7oXIZk";
	
	/**
	 * Oreparing/ getOneEmployee.php request
	 */
	RequestSpecification getOneEmployeeRequest=given().header("Content-Type","application/json").header("Authorization",token).queryParam("employee_id", "1690A");//.log().all();
	
	/**
	 * Storing response
	 */
	
	Response getOneEmployeeResponse=getOneEmployeeRequest.when().get("/getOneEmployee.php"); // log().all() will retourne the payload
	
	
	/**
	 * Two ways to print response 
	 * prettyPrint() method converts JSON object into String and prints - no need to SOP
	 */
	
	getOneEmployeeResponse.prettyPrint();
	//String response=getOneEmployeeResponse.body().asString();
	System.out.println(getOneEmployeeResponse);
	
	
	/**
	 * Verifying response status code is 200
	 * 
	 */
	getOneEmployeeResponse.then().assertThat().statusCode(200);
	
	}
	
	@Test
	public void aPOSTcreateEmployee() {
		
		/**
		 * Preparing request for /CreateEmployee.php
		 */
		RequestSpecification createEmployeeRequest= given().header("Content-Type","application/json").header("Authorization",token).body("{\r\n" + 
				"  \"emp_firstname\": \"Maya\",\r\n" + 
				"  \"emp_lastname\": \"mayadream\",\r\n" + 
				"  \"emp_middle_name\": \"mana\",\r\n" + 
				"  \"emp_gender\": \"F\",\r\n" + 
				"  \"emp_birthday\": \"2020-07-20\",\r\n" + 
				"  \"emp_status\": \"Freelance\",\r\n" + 
				"  \"emp_job_title\": \"Application Developer\"\r\n" + 
				"}");
	
		
		/**
		 * Storing respolnse intocreateEmployeeResponse
		 */
	Response createEmployeeResponse=createEmployeeRequest.when().post("/createEmployee.php");
	/**
	 * Printing response using prettyPrint() method
	 */
	createEmployeeResponse.prettyPrint();
	
	
	/**
	 * JasonPath it belong to jasonClass 
	 * jasonpath() to view body which lets us get the employee ID
	 * The return type is string 
	 * We store employee ID as a global variable so that we may use it with our other calls 
	 */
	
		String employeeID=	createEmployeeResponse.jsonPath().getString("Employee[0].employee_id");
		/** Optional to print employee ID */
		System.out.println(employeeID);
		
		
		/**
		 * Verifying response status code is 201
		 */
		createEmployeeResponse.then().assertThat().statusCode(200);
		
		
		
	    /**
	     * Verifying message using equalTo() method - manually import static package 
	     * import static org.hamcrest.Matcher.*;
	     * 
	     */
		createEmployeeResponse.then().assertThat().body("Message", equalTo("Entry Created"));
		
		
		/**
		 * Verifying created first name 
		 */
		 createEmployeeResponse.then().assertThat().body("Employee[0].emp_firstname", equalTo("mayadream"));
		
	/**
	 * Verifying server using then().header()
	 */
	    createEmployeeResponse.then().header("Server", "Apache/2.4.39 (Win64) PHP/7.2.18");
		 
		 /**
		  * Verifying Content-Type using assertThat().header()
		  */
		createEmployeeResponse.then().assertThat().header("Content-Type", "application/json");
		
		
	
	}
	
	@Test
	public void bGETcreateEmployee() {
		/**
		 * Preparing request for/ getOneEmployee.php
		 */
		
		
		RequestSpecification getCreatedEmployeeRequest= given().header("Content-Type","application/json").header("Authorization",token).queryParam("employee_id", employeeID).log().all();
	 
		/**
		 * Making call to retrieve created employee
		 */
		Response getCreatedEmployeeResponse=getCreatedEmployeeRequest.when().get("/getOneEmployee.php");
		
		/**
		 * Printing response using prettyPrint()
		 */
		
		String response=getCreatedEmployeeResponse.prettyPrint();
		
		/**
		 * 
		 * Storing response employeeID into empID which wil be used for verification
		 * Against stored global employee ID 
		 */
		
		
		String empID=getCreatedEmployeeResponse.body().jsonPath().getString("employee[0].employee_id");
		
		
		/**
		 * Matching  exact employee ID
		 */
		boolean verifyingEmployeeIDsMatch= empID.equalsIgnoreCase(employeeID);
		System.out.println("Employee ID'S match: "+ verifyingEmployeeIDsMatch);
		
		
		/**
		 * Asserting employee ID's match
		 */
		Assert.assertTrue(verifyingEmployeeIDsMatch);
		
		/**
		 * verifying status code is 200
		 */
		getCreatedEmployeeResponse.then().assertThat().statusCode(200);
		
		/**
		 * 
		 * Using JsonPath class to retrieve values from response as a String
		 */
		
		JsonPath js= new JsonPath(response);
		
		String emplID=js.getString("employee[0].employee_id");
		String firstName=js.getString("employee[0].emp_firstname");
		String middleName= js.getString("employee[0].emp_middle_name");
		String lastName=js.getString("employee[0].emp_lastname");
		String empBirthday =js.getString("employee[0].emp_birthday");
		String gender=js.getString("employee[0].emp_gender");
	    String jobTitle= js.getString("employee[0].emp_job_title");
	    String empStatus=js.getString("employee[0].emp_status");
	    
		System.out.println(emplID);
		System.out.println(firstName);
		System.out.println(middleName);
		System.out.println(lastName);
		System.out.println(empBirthday);
		System.out.println(gender);
		System.out.println(jobTitle);
		System.out.println(empStatus);
		
		
		/** Verifying employee ID's match*/
		Assert.assertTrue(emplID.contentEquals(employeeID));
		
		//Second way of asserting 
		emplID.contentEquals(employeeID);
		
		
		/**Verifyig expected first name matches actual first name */
		Assert.assertTrue(firstName.contentEquals("Alaa"));
		
		
		/** Verifying expected lastName matches actual lastNmae */  
		Assert.assertTrue(lastName.contentEquals("mayadream"));
		
		/** Verifying expected birthday matches actual birthday */
		Assert.assertTrue(empBirthday.contentEquals("2020-07-20"));
		
		
		
		
		
		
	
	}

	@Test
	public void  cGETallEmployees() {
		
	   /**
	    * Preparing  /getAllEmployees.php request	
	    */
	 RequestSpecification getAllEmployeesRequest =given().header("Content-Type","application/json").header("Authorization",token);
	 
	 
	 
	 /**
	  * Stroing  response into getALLEmployeesResponse
	  */
	Response  getAllEmployeesReponse = getAllEmployeesRequest.when().get("/getAllEmployees.php");
	
	
	
	/**
	 * Printing all Employees
	 */
	//getAllEmployeesReponse.prettyPrint();
	
	String allEmployees= getAllEmployeesReponse.body().asString();
	
	/**
	 * The below will pass but incorrect
	 */
	
	//allEmployees.contains(employeeID);
	/**
	 * ---------DO RESEARCH-------------
	 */
	
	//allEmployees.matches(employeeID);
	
	
	JsonPath js= new JsonPath(allEmployees);
	
	int sizeOfList=js.getInt("Employees.size()");
	
	System.out.println(sizeOfList);
	
	/**
	 * Print out all employee ID's
	 */
	
	for(int i=0; i<sizeOfList;i++) {
		
	String allEmployeeIDs=	js.getString("Employees["+i+"].employee_id");
	//System.out.println(allEmployeeIDs);
	
	/**
	 * 
	 */
	
	if(allEmployeeIDs.contentEquals(employeeID)){
	
		System.out.println("Employee ID: "+employeeID+" is present in body");
		String employeeFirstName= js.getString("Employees["+i+"].emp_firstname");
		System.out.println(employeeFirstName);
		
		break;
		
		
	}	
	}
	
	
	
	
	
	
	
	}

	@Test
	public void dPUTupdateCreatedEmployee() {
	RequestSpecification 	updateCreatedEmployeeRequest=given().header("Content-Type","application/json").header("Authorization",token).body(PayloadConstants.updateCreatedEmpBody());
		
	 Response updateCreatedEmployeeRespone=	updateCreatedEmployeeRequest.when().put("/updateEmployee.php");
	 
	 String response= updateCreatedEmployeeRespone.prettyPrint();
	 
	}
	
	@Test 
	public void eGETUpdatedEmployee() {
		
		/**
		 * Preparing request to get updated employee
		 */
	RequestSpecification	getUpdatedEmployeeRequest=given().header("Content-Type","application/json").header("Authorization",token).queryParam("employee_id", employeeID);
	
	/**
	 * Storing response into getUpdatedEmployeeResponse
	 */
	
	Response getUpdatedEmployeeResponse= getUpdatedEmployeeRequest.when().get("/getOneEmployee.php");
	
	/**
	 * Printing response
	 */
	getUpdatedEmployeeResponse.prettyPrint();
	
	
	
	/**
	 * Asserting expected first name
	 */
	getUpdatedEmployeeResponse.then().assertThat().body("employee[0].emp_firstname",equalTo("Alaa"));
	
	/**
	 * Verifying response employee ID is equal to globally stored employee ID
	 */
	
	getUpdatedEmployeeResponse.then().assertThat().body("employee[0].emp_lastname",equalTo("Alaa Syntax"));
	
	
	
	
	
	
	
	
	
	
	}
	
	public void fPATCHpartiallyUpdatedEmployee() {

		
		
      RequestSpecification partiallyUpdatingEmployeeRequest=	given().header("Content-Type","application/json").header("Authorization", token).body("{\r\n" + 
				"  \"employee_id\": \""+employeeID+"\",\r\n" + 
				"  \"emp_firstname\": \"MarwaPartiallyupdatedFirstName\"\r\n" + 
				"\r\n" + 
				"}");

       Response partiallyUpdatingEmployeeResponse =partiallyUpdatingEmployeeRequest.when().patch("/updatePartialEmplyeesDetails.php");
       
       partiallyUpdatingEmployeeResponse.prettyPrint();
       
       partiallyUpdatingEmployeeResponse.then().assertThat().statusCode(201);
       
       partiallyUpdatingEmployeeResponse.then().assertThat().body("Message", equalTo("Entry updated"));
       
       
	}
	
	@Test
	public void gDELETEeMPLOYEE() {
		RequestSpecification deleteEmplyeeRequest=given().header("Content-Type","application/json").header("Authorization",token);
		
		Response deleteEmployeeResponse=deleteEmplyeeRequest.when().delete("/deleteEmployee.php");
		
		deleteEmployeeResponse.prettyPrint();
		
		deleteEmployeeResponse.then().assertThat().body("message", equalTo("Entry deleted"));
		
		
	}
	
	
	
	
}
