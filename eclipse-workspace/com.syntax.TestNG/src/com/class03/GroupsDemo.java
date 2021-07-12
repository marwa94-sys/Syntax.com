package com.class03;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class GroupsDemo {
	
	//Always run attribute will make sure that this method will always execute ===>(alwaysRun = true)
	@BeforeClass
	public void BeoreClass() {
		System.out.println("before class");
	}
	
	
	@AfterMethod
	public void AfterClass() {
		System.out.println("after class");
	}
	
	
	
	@Test(dependsOnGroups = {"smoke"})
	public void test1() {
		System.out.println("test1");
	}
	
	
	@Test(groups ="smoke")
	public void test2() {
		System.out.println("test2");
		//Assert.assertTrue(false);
		SoftAssert soft= new SoftAssert();
		soft.assertTrue(false);
		soft.assertAll();//This statement will collect all soft assert and decide if test passed or failed 
		
		
		
	}
	
	
	
	@Test (groups= {"regression"})
	public void test3() {
		System.out.println("test3");
	}
	
	@Test (groups= {"smoke","regression"})
	public void test4() {
		System.out.println("test4");
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
