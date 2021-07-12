package com.class05;

import org.testng.annotations.Test;

public class Recap {
	
	@Test
	public void arrayRecap() {
		 Object[][] data= new Object [2][3];

		// ==>Store Data
		  data[0][0]=12;
		  data[0][1]=13;
		  data[0][2]=34;
		  data[1][0]=42;
		// -----------------

		System.out.println(data[1][1]);//What will be the output
	}

}
