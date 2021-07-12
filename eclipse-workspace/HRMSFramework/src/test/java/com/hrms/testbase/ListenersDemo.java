package com.hrms.testbase;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.hrms.utils.CommonMethods;

public class ListenersDemo  implements ITestListener {
	
	
	@Override
   public void onStart(ITestContext context) {// This listener executes based on <Test> from XML File
	System.out.println("Functionality Testing Finished");
	}
	
	
	
    @Override
	public void onTestStart(ITestResult result) {// This Listener executes when @ test method starts
		System.out.println("Test started "+result.getName());
		BaseClass.reporter.createTest(result.getName());// Holding all the informations about our test 
	}
	
    
    
    @Override
    public void onTestSuccess(ITestResult result) {
       System.out.println("Test case passed"+result.getName());
       BaseClass.Test.pass("Test Case pass"+ result.getName());
        try {
			BaseClass.Test.addScreenCaptureFromPath(CommonMethods.takeScreenShot("passed\\"+result.getName()));
		} catch (IOException e) {
		
			e.printStackTrace();
		}
        
       
    }
    
    
    @Override
	public void onTestFailure(ITestResult result) {
	   System.out.println("Test  case failed"+ result.getName());
	   /*BaseClass.Test.fail("Test Case failed"+ result.getName());
       try {
			BaseClass.Test.addScreenCaptureFromPath(CommonMethods.takeScreenShot("failed\\"+result.getName()));
		} catch (IOException e) {
		
			e.printStackTrace();
		}*/
	}
    
	
    @Override
    public void onTestSkipped(ITestResult result) {
    	System.out.println("Test case skipped"+ result.getName());
    }
    
    
    
    

}



























