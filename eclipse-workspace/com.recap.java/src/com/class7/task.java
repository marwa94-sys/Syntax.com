package com.class7;

public class task {

	public static void main(String[] args) {
		/**
		 *Create a boolean variable workday and assign true, create int variable day and assign it to 1
		 *
		 *As long as it is workday print "I need a day off"
		 *Once day is 6 print "Ido not need a day off any more"
		 */
		
		boolean workday = true;
		int  num=1;
		
		while (workday) {
			if (num<6) {
			System.out.println("I need a day Off");
			
		}else {
			System.out.println("I do not need a day off ");
			workday= false;
		}
		num ++;
		
		}
		
	
		
		
		
		}
}
