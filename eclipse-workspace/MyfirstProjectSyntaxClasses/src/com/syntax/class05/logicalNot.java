package com.syntax.class05;

public class logicalNot {

	public static void main(String[] args) {
	
		boolean idCold =false;
		
		if (!idCold) {
			System.out.println("Heloo");
		}else {}
		System.out.println("Bye");
		
		String day1="Monday";
		String day2="Friday";
		
		
		//If it is Monday or Friday --> Find me at syntax
		
	 if (!(day1.equals("Monday")) || ! day2.equals("Friday")) {
		System.out.println("Find me at syntax");
	}
	 
	 if (!(day1.equals("Monday")) && day1.equals("Friday")) {
		 System.out.println("Find me at syntax");
	}
		
		
		
		
		

	}

}
