package com.syntax.class05;

import java.util.Scanner;

public class Homework_01 {

	public static void main(String[] args) {
		/*Write a program to ask user to enter numbers of worked years and annual salary
		 * If user worked for more or equals to 5 years than user is eligible for the bonus. Otherwise he is not
		 * Once user is eligible and salary is larger than 50000 than bonus=5000. Otherwise bonus =3000.
		 */
		Scanner userInput=new Scanner(System.in);
		
           int year=userInput.nextInt();
		
		if(year>=5) {
			System.out.println("What is your Annual Salary");
			double salary=userInput.nextDouble();
			System.out.println("You are eligible for bonus!!");
			if(salary>=50000) {
				System.out.println("Your bonus amount is 5000.");
			}else {System.out.println("Your bonus amount is 3000");}
			
		}else {
			System.out.println("Sorry, you are not eligible for bonus untill you ");
		}
		
		
		
	}

}
