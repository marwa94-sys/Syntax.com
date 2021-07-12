package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class LoginPageElement {

	@FindBy(id="txtUsername")
	public WebElement username;
	
	
	@FindBy(name = "txtPassword")
	public WebElement password;
	
	
	@FindBy(css = "input#btnLogin")
	public WebElement LoginBtn;
	
	 @FindBy(xpath = "//div[@id='divlogo']/img")
	 public WebElement logo;
	 
	  
	 public LoginPageElement() {
		PageFactory.initElements(BaseClass.driver, this);  //Refers to the current class 
	}
	 
	
	
	
	
	
}
