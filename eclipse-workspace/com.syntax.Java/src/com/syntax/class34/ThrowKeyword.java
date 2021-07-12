package com.syntax.class34;



class BalanceException extends RuntimeException{
	 public BalanceException(String message ) {
	
		super(message);
	
	}
		
	
}


public class ThrowKeyword {
	public static void main(String[] args) {
		NullPointerException npe= new NullPointerException();
		//throw npe;
		//Throw Keyword is used to throw an exception explicitly 
withdraw(100000, 10000);
browser("edwdwedwe");
			
		}
	
	// get obj of Arithmetic  Exception 
	
	
	
	//Create a method for a balance and amount we are throwing the obj of exception 
	public static void withdraw(int balance, int amount) {
		if(amount>balance) {
			throw new BalanceException("You balance is too low ");}}
	public static void throwException() {
		throw new ArithmeticException();
	}
	
	public static void browser(String browser) {
		switch(browser) {
		case "chrome":
			System.out.println("Using from browser");
			break;
		case "Firefox":
			System.out.println("Using firefox browser");
			break;
			 default:
				 throw new RuntimeException("Invalid browser");
		}
	}

}
