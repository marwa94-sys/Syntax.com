package com.syntax.class01;

public class VariableDeclaration {

	public static void main(String[] args) {

		//Create a variable and store value
		//Declaring a  variable and assigning a value
		
		boolean b=true;
		
		
		//2 Way: 1 step--> Declare variable
		//       2 step -->assign value
		
		int i;
		i=1000;
		
		//Declare multiple variable and assign value later 
		char a,d,c;
		a='A';
		d='^';
		c='0';
		
		//We can not have variable with same name in 1 program
		//double i=12.34;---> Java will complain
		
		a='*'; //reassining the value 
		i=2000;
		System.out.println(i);
	
	}

}
