package com.syntax.selenuim.class02;

public class SFirefoxDriver  implements SWebDriver{
 public SFirefoxDriver() {
		System.err.println("Opening Firefox browser....");
 }
	@Override
	public void get(String url) {
		System.out.println("Lunching url ::"+url);
	}

	@Override
	public void getCurrentUrl() {
       System.out.println();		
	}

	@Override
	public void close() {
	//System.out.println();
		
	}

	@Override
	public void getTitle() {
		//System.out.println("");
		
	}

}
