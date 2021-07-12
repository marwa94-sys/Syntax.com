package com.hrms.steps;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

import io.cucumber.core.gherkin.Named;
import io.cucumber.core.gherkin.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
 @Before
 public void start() {
	 BaseClass.setUp();
 }
 

	
 
 @After
 public void end() {
	 
//	byte[] pic;
//	
//	if (scenario.isFailed()) {
//	pic=CommonMethods.takeScreenShot("failed/"+scenario.getName());
//	}else {
//	pic=CommonMethods.takeScreenShot("passed/"+scenario.getName());
//	}
//     scenario.attach(pic,"image/png",scenario.getName());
	 BaseClass.tearDown();
	
}
	

}
