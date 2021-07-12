package com.syntax.class13;

public class IQ_07 {

	public static void main(String[] args) {
		
		//write a java program to find the second largest number in the array? Maximum and minimum number in the array?

        int [] numbers={32,44,54,23,55,54};
        // how to find the largest number
        // 1st way
       // Arrays.sort(numbers);
        System.out.println("Smallest "+ numbers[0]);
        System.out.println("Biggest "+numbers[numbers.length-1]);
        System.out.println("Second lLargest "+ numbers[numbers.length-2]);


        System.out.println("------The second Way---------");
        // 2nd way
        int [] numbers1={32,43,23,56,23,65};
        int smallest=numbers1[0];
        int largest=numbers1[0];
        int largest2 = numbers1[0];

        for(int i=0; i<numbers1.length;i++){
            int element= numbers1[i];
            if(element>largest){
                largest=element;
            }else if (element>largest2){     //-----> very important
                largest2=element;

            }
            if(element<smallest){
                smallest=element;
            }



        }

		
		
	}

}
