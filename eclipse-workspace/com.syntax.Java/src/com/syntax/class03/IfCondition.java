package com.syntax.class03;

public class IfCondition {

	public static void main(String[] args) {
		//Declare a number and  compare if number is larger than 100
		//if number is larger than 100 --> my number is larger 
		
		
		System.out.println("Starting coding ");
		
		int num=178;
		
		if(num>100) {
			System.out.println("MY number larger ");
		}
		System.out.println("End of the program");

		
		System.out.println("--------------------------------");
		
		
		int expectHours=15;
		int actualHours=4;
		
		//If actual hours more than expected --> you will love java 
		
		
		if(actualHours>=expectHours) {//if true go inside if block 
			System.out.println("I will love java ");
		}
		
		else {
			//Otherwise (if false )--> go inside else block
			System.out.println("You will not like java ");}
		
		
		System.out.println("-----------------------------");
		
		
		double budget=1000;
		double carPrice=12000;
		
		if (budget>carPrice) {
			System.out.println("I will buys this car today");
		}
		else {
			System.out.println("Iwill not buy this car today, " +
		                        "I will go learn java  ");
			System.out.println("I am code after if condition");
		}

	}

}
