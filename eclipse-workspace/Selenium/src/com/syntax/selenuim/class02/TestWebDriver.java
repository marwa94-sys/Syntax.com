package com.syntax.selenuim.class02;


public class TestWebDriver {
	public static void main(String[] args) {
		
		SWebDriver driver = new SChromeDriver();// did not luch anything 
		driver.get("https://google.com");
		driver.close();
		
		
		SWebDriver driver2=new SFirefoxDriver();
		driver2.get("https://www.google.com");
		
	}

}
