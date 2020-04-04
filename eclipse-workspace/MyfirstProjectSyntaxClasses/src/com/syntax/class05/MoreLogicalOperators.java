package com.syntax.class05;



public class MoreLogicalOperators {

	public static void main(String[] args) {

		/*We have total 7 days in a week
		 * if day is 2,3--> SDLC Class
		 * if day 6,7--> Java Class
		 * if day 1,5-->Off day
		 * if day 4 --> review class
		 * 
		 */
		
		
		//to compare 2 number we use equality operator
		int day=6;
		if (day==2 && day==3){
			System.out.println("Today is SDLC");
		}else if(day==6 && day==7) {
		System.out.println("Today is JAVA class");
			
		}else if (day==1 && day ==5) {
			System.out.println("Today is no CLASS, it is day pff");
			
		}else if (day==4) {
			System.out.println("Today is a review class with Elion");
		}else {
			System.out.println("Invalid day");
		}
		System.out.println("-------------------Using Strings--------------------");
		
		String day1="Sturday";
		 if(day1.equals("Tuesday") || day1.equals("Wednesday"));{
			System.out.println("Today is SDLC class");} 
		  if (day1.equals("Saturday") || day1.equals("Sunday")) {
			System.out.println("Today is JAVA class");
		}else if (day1.equals("Monday")|| day1.equals("Friday")) {
				System.out.println("Today is no class, it is day off");
		 }
		else if (day1.equals("Thursday")) {
			System.out.println("Today is a review class with Elion");
		}else {
			System.out.println("Invalid day");
		}
	
	
	
	
	
	
	
	
	
	
	
	}
	

}
