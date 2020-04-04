package com.syntax.class07;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		boolean workDay = true;
		int variableDay = 1;
		while (workDay) {
		if (variableDay < 6) {
		System.out.println("I need a day off");
		} else {
		System.out.println("I do not need a day off anymore");
		workDay =false;
		variableDay++;
		}
		 }

	}
	}
