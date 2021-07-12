package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

import net.bytebuddy.asm.Advice.This;

public class ViewEmployeePageElements {
	@FindBy(id="empsearch_employee_name_empName")
	public WebElement empName;
	
	@FindBy(id ="empsearch_id")
	public WebElement empID;
	
	
	
	@FindBy(id="searchBtn")
	public WebElement serachBtn;
	
	public ViewEmployeePageElements() {
		PageFactory.initElements(BaseClass.driver,this);
	}

	
	
	
}
