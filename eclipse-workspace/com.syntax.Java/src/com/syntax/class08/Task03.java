package com.syntax.class08;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		

		
		
		
			/*
			 * Create a program that will be asking user to apply 
			 *for a credit card 10
			 * times. As soon you get an 
			 *from a user program should
			 *stop asking.
			 */
		Scanner scan = new Scanner(System.in);
		for (int i = 1; i <= 10; i++) {
		System.out.print("Do you want to apply for credit card? ");
		String creditCard = scan.next();
		if (creditCard.equals("yes")) {
		System.out.println("Congratulations!");
		break;}}
	}

}
