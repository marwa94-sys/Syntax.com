package com.syntax.class03;

public class ComparNumbers {

	public static void main(String[] args) {
		
		double numberOne=10;
		double number2=10;
		
		
		if(numberOne>=number2) {
			System.out.println("number one is karger than number 2");
			
		}else if (numberOne<number2) {
			System.out.println("Number one is smaller than number 2");
		}else {
			System.out.println("Numbers are eqaul ");
		}
		System.out.println("=---------------------------------");
		
		//Declare variable for a day then based on the value we will 
		//output 
		
		int day =5;
		
		if (day==1) {
			System.out.println("It is monday, no class today ");
		}else if (day==2) {
			System.out.println("It is tuesday, we have SDLC Class");
		}	else if (day==3) {
			System.out.println("It is Wednseday, we have SDLC Class");
		}	else if (day==4) {
			System.out.println("It is thursday, we have SDLC Class");
		}	else if (day==5) {
			System.out.println("It is friday, we do not have a Class");
		}	else if (day==6) {
			System.out.println("It is Saturday, we have Java  Class");
		}	else{
			System.out.println("It is Sunday, we have Java  Class");
		}	
		
		
		

	}

}
