package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExample {
public static void main(String[] args) throws FileNotFoundException  {
	multplesleep();
	read(" ");
	
	
	
}
public static void read (String filepath) throws FileNotFoundException {
	FileInputStream fis= new FileInputStream(filepath);//Try to build up connection 
	
}

public static void  multplesleep()  {
	try {
		sleep();
	} catch (InterruptedException e) {
	
		e.printStackTrace();
	} // is being delegated 
}

public static void sleep() throws InterruptedException {
	Thread.sleep(2000);
}
}
