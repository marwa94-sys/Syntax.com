package com.utils;

import com.pages.AddEmployeePageElement;
import com.pages.DashBoardPageElements;
import com.pages.LoginPageElements;
import com.pages.PersonDetailsPageElements;


public class PageInitializer extends BaseClass {
	
	
	//Goal of this Class is to initialize all the pages 
	//Initializer all pages class and stores references in static variables 
	//That will called/used in test classes
	public static 	LoginPageElements login;
	public static DashBoardPageElements dashboard;
	public static AddEmployeePageElement addEmp;
	public static PersonDetailsPageElements pdetails;
	//We made them Accessible (giv e them global access)
	
	
	
	
	
	public static void initialze() {
		
		login=new LoginPageElements();//without making them static them are local we can not access them into another class 
	    dashboard= new DashBoardPageElements();
	    addEmp= new AddEmployeePageElement();
        pdetails= new PersonDetailsPageElements();
		
	}
	
	
	
	
	
	
	
	
	

}
