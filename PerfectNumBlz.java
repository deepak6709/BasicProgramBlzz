package com.Basicblz;

import java.util.Scanner;

public class PerfectNumBlz {

	public static void main(String[] args) {
		 
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter The Number ");
		
		int num=s.nextInt();
		
		int sum=0; 
		
	   for(int i=1; i<num;i++) {
		   
		   if(num%i==0) {
			   
			  sum= sum+i;
			   
		   }
		   
		   
		   
		   
	   }
	   if(sum==num) {
		   
		   
		   System.out.println("Number is perfect");
	   }
	   else {
		   
		   System.out.println("Number is not perfect");
		   
	   }
	                                    // 6=1,2,3,4,5,6 
		                               // addition  6=1,2,3  4,5,6 not divisble
		                 
		

	}

}
