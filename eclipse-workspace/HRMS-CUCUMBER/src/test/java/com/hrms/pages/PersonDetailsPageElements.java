package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class PersonDetailsPageElements {
	
	
	@FindBy(id = "personal_cmbNation")
	public WebElement nationalityDD;

	@FindBy(name = "personal[optGender]")
	public List<WebElement> genderRadioGroup;

	@FindBy(xpath = "//div[@id='pdMainContainer']/div[1]/h1")
	public WebElement lblPersonalDetails;

	@FindBy(id = "personal_txtEmployeeId")
	public WebElement employeeId;
	
	@FindBy(xpath = "//div[@div='profile-pic']//h1")
	public WebElement profilepic;

	public PersonDetailsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	//if we would be keeping elements as private 
	//Then we will  need to create public getters and setters
	//So we can access page elements from test classes
	// if would be keeping elements from classes 
	
	
	
	
}
