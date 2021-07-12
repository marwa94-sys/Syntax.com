package com.hrms.testbase;

import com.hrms.pages.AddEmployeePageElement;
import com.hrms.pages.DashBoardPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.PersonDetailsPageElements;
import com.hrms.pages.ViewEmployeePageElements;


public class PageInitializer extends BaseClass {
	
	
	//Goal of this Class is to initialize all the pages 
	//Initializer all pages class and stores references in static variables 
	//That will called/used in test classes
	public static LoginPageElements login;
	public static DashBoardPageElements dashboard;
	public static AddEmployeePageElement addEmp;
	public static PersonDetailsPageElements pdetails;
	public static ViewEmployeePageElements viewEmp;
	//We made them Accessible (giv e them global access)
	
	
	
	
	
	public static void initialze() {
		
		login=new LoginPageElements();//without making them static them are local we can not access them into another class 
	    dashboard= new DashBoardPageElements();
	    addEmp= new AddEmployeePageElement();
        pdetails= new PersonDetailsPageElements();
		
	}
	
	
	
	
	
	
	
	
	

}
