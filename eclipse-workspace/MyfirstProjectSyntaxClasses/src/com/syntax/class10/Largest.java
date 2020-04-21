package com.syntax.class10;

public class Largest {

	public static void main(String[] args) {
		
		
		
	
		//find largest element from an array
		int[] nums= {200, 30, -1, 900, 56, 787, 3000};
		int largest=nums[0]; //200
		for(int i=1;i<nums.length; i++) {
		if(nums[i]>largest) {
		largest=nums[i];
		}
		}
		System.out.println("Largest num is "+largest);
		
		
		
		
		
       /* int n, max;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
         n = s.nextInt();
         
          int a[] = new int[n];
          System.out.println("Enter elements of array:");
				
				        for(int i = 0; i < n; i++) {
								a[i] = s.nextInt();
								}
							
                              max = a[0];

				        for(int i = 0; i < n; i++) {
				                   if(max < a[i])
				                  {
				                       max = a[i];
				                   }
				               }

        System.out.println("Maximum value:"+max);*/

	}

}
