package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
	

		//Widening, happens implicity
		double d=10;
		System.out.println(d);//10.0
		
		//int i=10.99; --> Compile time error saying 
		//Type mismatch, can not convert double to int 
		
		
		//Narrowing, explicitly implementing 
		int i=(int)10.99;
		System.out.println(i);
		
		//byte -128 to 127
		
		byte b=(byte)1284;
		System.out.println(b);

	}

}
