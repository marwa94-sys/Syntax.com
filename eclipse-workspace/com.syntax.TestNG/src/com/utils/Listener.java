package com.utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

	//Default methods it's not force you to override methods 
	
	@Override
	public void onStart(ITestContext context) {
		System.out.println("Functionality Testing start");
	}
	
	
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Functoinality Testing finish");
	}
	
	@Override
	public void onTestStart(ITestResult result) {
    System.out.println("Test started"+result.getName());
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
	System.out.println("Test passed");
	}
	
	  @Override
	public void onTestFailure(ITestResult result) {
	System.out.println("Test failed");
	}
	
	  
	
	
	
	
}
