package com.hrms.runners;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src\\test\\resources\\Features\\SauceDemoLoginWithDataTable.feature",
		
		glue="com\\hrms\\steps",
		dryRun=false,
		monochrome=true,
		strict=true,
		plugin= {
				"pretty",
				"html:target\\cucumber-default-report", // create basic html report in specified 
				"json:target\\cucumber.jason"
		}
		)

//The order it does not matter 

public class SingleTestRunner {

	
	
	
	
	
	
	
	
}
