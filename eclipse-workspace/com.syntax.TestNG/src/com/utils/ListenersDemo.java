package com.utils;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersDemo  implements ITestListener {
	
    @Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test started "+result.getName());
	}
	
    
    
    @Override
    public void onTestSuccess(ITestResult result) {
       System.out.println("Test case passed"+result.getName());
    }
    
    
    @Override
	public void onTestFailure(ITestResult result) {
	   System.out.println("Test  case failed"+ result.getName());
	}
    
	
    @Override
    public void onTestSkipped(ITestResult result) {
    	System.out.println("Test case skipped"+ result.getName());
    }
    
    
    
    

}



























