package com.Basicblz;

import java.util.Scanner;

public class PerfectNUmBlz1 {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		 
		 System.out.println("Enter The Number");
		 
		 int num=s.nextInt();
		 
		 int sum=0;
		 
		 for(int i=1;i<num;i++) {
			 
			 if(num%i==0) {
				 
				 sum=sum+i;
				 
			 }
		 }
			 if(sum==num) {
				 
				 
				 System.out.println("The Number Is Perfect Number :"+num);
			 }
			 else {
				 System.out.println("The Number Is not Perfect Number :"+num);
				 
			 }
			 
		 }

	}


