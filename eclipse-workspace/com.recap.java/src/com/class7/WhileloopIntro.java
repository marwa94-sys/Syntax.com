package com.class7;



public class WhileloopIntro {
	public static void main(String[] args) {
		
		int time=20;
		
		if (time<12) {
			System.out.println("Good Morning");
		}
		
		
		
	    while(time<=21) {
	    	System.out.println("Good Morning");// Code will execute infinitely 
	    	time++;
	    }
	    
	    
	    //How to print numbers from 1 to 50
	    int num=1;
	    
	    while (num<50) {
	    	System.out.println("Good luck, inchaalah you will be fine"+num);
	    	num++;
	    }
	    
	    
	    //How to print numbers from 20 to 30
	    
	    int num1=20;
	    
	    while(num1<=30) {
	    	System.out.print("Mercedice"+ " ");
	    	num1++;
	    }
	    
	    System.out.println("***********************************************************");
	    //How to print values from 10 to 1
	    
	    int num2=10;
	    while(num2>=1) {
	    	System.out.print(num2+ " ");
	    	num2--;
	    	
	    }
	    System.out.println();
	    
	    //How to print 50 to 1
	    //How to print 1 to 20
	    System.out.println("******************************************************************");
	    int number= 50;
	    while (number>=1) {
	    	System.out.print(number+" ");
	    	number--;
	     }
	    System.out.println(); 
	    
	    System.out.println("*********************************************************************");
	    int number1=1;
	    while (number1<=20) {
	    	System.out.print(number1+" ");
	    	number1+=2;
	    }
		
		
		
		
	}

}
