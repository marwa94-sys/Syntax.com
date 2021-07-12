package com.syntax.class15;

public class MethodsTest {


		


	
		
		//Task.1
		 void largerNumber(int a,int b) {
			 if(a>b) {
				 System.out.println(a);
			 }else {
				 System.out.println(b);
			 }
		 }
		 
		 
		 //Task.2
		 
		 void evenOrodd(int a) {
			 if(a%2==0) {
				 System.out.println("Nuber is even");
			 }else {
				 System.out.println("Number is Odd");
			 }
			 
		 }
		 
		 //Task.3
		 
		 void isPalindrome(String original) {
			
			 
			  
			  
	            String reverse="";
			    char[] words = original.toCharArray();

			    for (int i = original.length() - 1; i >= 0; i--)
			    {  reverse+= words[i];}
	              System.out.println(reverse);
			    if (original.equals(reverse)) {
			      System.out.println(original+"The string is a palindrome.");}
			    else
			    { System.out.println("The string isn't a palindrome.");
			    }
		 }
		
			
		   // Task 4.
	  // Create a method that will say hello in different languages based on the country
	  //That will passed when method is executed.

		
		 
		  void lang(String word) {
		        switch(word.toLowerCase()) {
		        case "russia":
		            System.out.println("Privet");
		            break;
		        case "tajikistan":
		            System.out.println("Salom");
		            break;
		        case "mexico":
		            System.out.println("hola");
		            break;
		            default:
		                System.out.println("wrong language");
		        
		        }

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		   // Task 4.
	    // Create a method that will say hello in different languages based on the country
	    //That will passed when method is executed.

	}

}
