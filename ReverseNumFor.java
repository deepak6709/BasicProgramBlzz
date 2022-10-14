package com.Basicblz;

import java.util.Scanner;

public class ReverseNumFor {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter The Number");
		
		int n=s.nextInt();
		
		for(int i=1;i<n;i++) {
			
			int rem=n%10;
			System.out.print(rem);
			
			n=n/10;
			
		
			
		}
		System.out.println(n);
	}

}
