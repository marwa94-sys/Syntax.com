package com.class7;

import java.util.Scanner;

public class ScannerAndLoop {
	
	public static void main(String[] args) {
		
		
		//We want to ask user's name and print good afternon
		
		Scanner scanner;
	    String name;
	    int num =1;
	    scanner=new Scanner(System.in);
	    
	    
	   /* while(num<6) {
	    System.out.println("Please entre your name :"+ num);
	   // scanner=new Scanner(System.in);
	    name=scanner.nextLine();
	    System.out.println("Good afternon "+ name);
	    num++;
	    }*/
		
	   //We are playing a lottery and lucky number is 17
	    //We want to keep asking user any number from 1-20
	    // Until he guesses the lucky
	    
	   
	    
	    int number;
	    int luckyNumber=17;
	      do {
	    	  System.out.println("Please enter any number from 1 to 20");
	    	  number=scanner.nextInt();
	    	  number ++;
	      }while(number!= luckyNumber);
		System.out.println("You got it !!!!!!!!!!!!!");
		
		
		
		
		
		
		
		
		
		
		
	}

}
