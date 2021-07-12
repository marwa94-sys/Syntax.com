package com.syntax.class23;

public class FinalExapmles {
	final String str="I love java";

	final void saySmth(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {

		FinalExapmles obj= new FinalExapmles();
		//obj.str="I do not like java";CE: final variables cannot be modified
	}

}
