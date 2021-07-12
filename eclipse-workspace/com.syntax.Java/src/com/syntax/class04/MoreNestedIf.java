package com.syntax.class04;

public class MoreNestedIf {

	public static void main(String[] args) {
		
		
		
		
		//Declare date and  a day 
		//If day is Friday -->if date is 13 --> watch a scary movie
		//                 -->if date is not 13 --> watch a comedy
		
		
		
		boolean isFriday=false;
		int date=14;
		
		
		if (isFriday) {
			System.out.println("Today is friday, i am going to  watch a movie ");
			if(date==13) {
				System.out.println("I will scary movie");
			}else {
				System.out.println("I will  watch a comedy");
			}
		}
		else {
			System.out.println("Today is not friday, I am staying home");
		}
		
		
		

	}

}
