package com.syntax.class02;

public class ArithmeticOperations {

	public static void main(String[] args) {
	
		
		//Declare 2 variable and initialize them
		//Perform addition, subtraction, multiplication and division
		

			
			int num1,num2;
			
			num1=20;
			num2=10;
			System.out.println(num1+num2);     //30
			System.out.println(num1-num2);     //10
			System.out.println(num1*num2);     //200
			System.out.println(num1/num2);     //2
			
			
			//How can we print value of num1 and num2 together 
			
			System.out.println(num1+","+num2);
			
			
			int sum=num1+num2;
			int sub=num1-num2;
			int mult=num1*num2;
			int div=num1/num2;
			
			System.out.println("The addition of 2 numbers is "+sum);
			System.out.println(sub);
			System.out.println(mult);
			System.out.println(div);
			
	}

}
