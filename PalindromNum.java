package com.Basicblz;

import java.util.Scanner;

public class PalindromNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter The Number");

		int n = s.nextInt();
		
		int c=n;
		int pal=0;
		
		
		while(n>0) {
			
			int rem=n%10;
			
			  pal=((pal*10)+rem);
			  
			  n=n/10;
			 
		}
		if(c==pal) {
			System.out.println("the Number is palindrom");
			
			
		}
		else {
			
			
			System.out.println("The Number is not palindrom");
		}

	}

}
