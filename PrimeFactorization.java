package com.Basicblz;

import java.util.Scanner;

public class PrimeFactorization {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Ur Number");
		
		int num=s.nextInt();
		
		for(int i=3; i<=num; i++) {
			
			while(num%i==0) {
				System.out.println(i);
				
				num=num/i;
				
			
			}
			
			
			
		}

	}

}
