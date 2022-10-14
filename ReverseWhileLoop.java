package com.Basicblz;

import java.util.Scanner;

public class ReverseWhileLoop {

	public static void main(String[] args) {
		
Scanner s= new Scanner(System.in);
		
		System.out.println("Enter The Number");
		
		int n=s.nextInt();
		
		while(n>0) {
			
			int rem=n%10;
			
			System.out.print(rem);
			
			n=n/10;
			
			
			
			
			
			
			
		}
		System.out.println(n);
	}

}
