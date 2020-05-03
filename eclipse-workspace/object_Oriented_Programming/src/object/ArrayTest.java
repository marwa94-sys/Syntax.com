package object;

public class ArrayTest {

	public static String getLongerString(String [] array) {
		int maxlength=0;
		String longString=null;
		for(String s:array) {
			if (s.length()> maxlength) {
            maxlength=s.length();
            longString=s;
		       }
	}
	return longString;
	//System.out.println("bislmilah inchaalah i will get it ");
	
	
	
	
         /*	What is Overloading? How can it be achieved?  
			What can we overload and what we cannot?*/
	
}
}