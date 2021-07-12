package com.syntax.class04;

public class NestedIfCondition {

	public static void main(String[] args) {
		
		
		//Check if patient has any allergies
		//If no allergies --> you are healthy
		//Otherwise check if patient has:
		    //Orange allergy --> Do not eat oranges 
		    //apple allergy --> Do not eat apples
		    //Kiwi allergy --> Do not eat kiwis 
		
		
		
		boolean allergy =true;
		boolean appleAllergy=false;
		boolean orangeAllergy=true;
		boolean kiwiAllergy=false;
		
		
		if(allergy) {
			System.out.println("Please answer below");
			if (orangeAllergy) {
				System.out.println("Do not eat ranges ");
			}if(appleAllergy) {
				System.out.println("Do not eat apples");
			}
		}else {
			System.out.println("You are healthy");
		}
	}

}
