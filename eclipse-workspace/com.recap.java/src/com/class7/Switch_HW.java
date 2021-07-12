package com.class7;

import java.util.Scanner;



public class Switch_HW {
	
	public static void main(String[] args) {
		
		
		// Declaring variables 
		Scanner scan;
		char operator;
		double num;
		double num1;
		double result;
		
		scan= new Scanner(System.in);
		
		System.out.println("==Calculator==");
		System.out.println("Please enter two number & an Arithmetic operators");
		
		System.out.println("===============================");
		System.out.println("Number 1:");
		
		
		//Capture nnumber 1
		num=scan.nextDouble();
		
		System.out.println("Choose from (+,-,* or /) :");
		operator=scan.next().charAt(0);
		
		
		System.out.println("Number 2 :");
		num1=scan.nextDouble();
		
		switch (operator) {
		case '+':
			result= num+num1;
			break;
			
		case '-':
			result=num-num1;
			break;
			
		case'*':
			result=num*num1;
			break;
			
		case'/':
			result=num/num1;
			break;
			 default:
				 System.out.println("You have entered wrong operator ");
				 return;
		
		}

		
		//If result was not calculated i do not want to see below message 
		if(result !=0) {
		System.out.println("Your calculation is "+ result);}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
