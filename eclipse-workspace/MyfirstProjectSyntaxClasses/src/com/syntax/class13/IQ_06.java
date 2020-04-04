package com.syntax.class13;

public class IQ_06 {

	public static void main(String[] args) {
		
		
		
		



	   // Write a java program to find whether a string is palindrome or not
	
	       
			
			String str="Kayak m kayak";
	
	        //1st way
	        char[] charArray =str.toCharArray();
	
	        String reverse="";
	        System.out.println(reverse.isEmpty());
	        for(int i=charArray.length-1; i>=0;i--){
	            reverse+=charArray[i];
	
	        }
	        System.out.println("reverse is ="+ reverse);
	        if(str.equals(reverse)){
	            System.out.println("yes, it is a palindrome");
	        }else{
	            System.out.println("No, it is not a palindrome");
	        }
	}
}
