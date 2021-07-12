package com.syntax.class03;

public class ShortHandOperators {

	public static void main(String[] args) {
		
		int num=200;
		num=num+200;
		System.out.println(num);



		num=num-100;
		System.out.println(num);
				
				//Compound shorthand assignment operators

		num-=num;
		System.out.println(num);// 300

		num+=50;
		System.out.println(num);//350

		num/=70;
		System.out.println(num);//50

		num*=10;
		System.out.println(num);//500

		num%=5;
		System.out.println(num);//0



	}

}
