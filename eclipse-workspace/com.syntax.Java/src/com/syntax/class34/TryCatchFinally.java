package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TryCatchFinally {
public static void main(String[] args) {
	
	
	division(10, 5);
	division(10, 0);
	
//public static void division(int num,int num1) {}	
}
	
	
public static int division(int num,int num1) {
	int result=0;
	
	try {
		result=num/num1;
	}catch (ArithmeticException ae) {
		//ae.printStackTrace();  //detailed message of an exception
		
		System.out.println(	ae.getMessage());   // provide friendly msg , this method  will give us message of an exception
		//System.out.println();
		
	}finally {
		System.out.println("I am finally block");
	}
	return result;
}	
	
	
	public static void read(String filepath)  {
		
		FileInputStream fis=null;
		try {
			fis = new FileInputStream(filepath);
			Properties prop= new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			try {
				if (fis!=null) {
					fis.close();
				}
				
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
