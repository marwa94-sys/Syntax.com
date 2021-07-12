package com.hrms.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\resources\\Features\\Login.feature",
		glue="com\\hrms\\steps\\Login",
	    dryRun=false,//if set to true it will quickly scan that all gherkin steps have implementation code
		            // if set to
		
	    monochrome=true,
		strict=true,
		tags="@smoke1"
//        plugin= {
//		"pretty",
//				"html:target\\cucumber-default-report",
//				"json:target/cucumber.json"
//		}
		)
		

public class TestRunner {
	

	
	
	
	

}













