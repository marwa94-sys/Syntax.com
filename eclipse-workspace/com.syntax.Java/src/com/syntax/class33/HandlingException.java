package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HandlingException {
	
	
	public static void main(String[] args) {
		
	try {
		Thread.sleep(2000);
	}catch(InterruptedException e) {
		
	}
	
	
	String path="";
	try {
		FileInputStream fis= new FileInputStream(path);
	}catch(FileNotFoundException fne) {
		System.out.println("Catch FileNotFoundException Exception");
	}
	
	
	int a=10;
	int b=0;
	  
	try {
		System.out.println(a/b); //new ArithmeticException
		System.out.println("Ï am code inside try37  block"); //This block will get ignored if exception occurs
		
		
	}catch(ArithmeticException ae) {  //Matching exception 
		System.out.println("Catch ArithmeticException  Exception");
	}
	
	System.out.println("End of the program");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
