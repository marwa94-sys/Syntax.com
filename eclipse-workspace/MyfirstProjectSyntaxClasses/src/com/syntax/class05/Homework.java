package com.syntax.class05;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
		/*Create a Java program that will ask if user has a credit card or not.
		 * If you user does not have a credit card then offer them. If they do have one 
		 * ask what is balance on the credit? If balance of the card is larger than 1000;
		 *tell them to pay off immediately, otherwise you can tell them that they can
		 *spend more
		 */
		Scanner userInput=new Scanner(System.in);
		
		System.out.println("Do you use credit card?");
		String answer=userInput.nextLine();
		
		
		if(answer.equalsIgnoreCase("Yes")) {
			System.out.println("What is the current balance on your credit card?");
			double c=userInput.nextDouble();
			if(c>1000) {
				System.out.println("Please pay off your dues immediately");
			}else {
				System.out.println("Please spend more to get higher credit limit");
			}
			
			
		}else {
			System.out.println("We have a great credit cad offer for you.are you interst ");
		}
		
	}

}
