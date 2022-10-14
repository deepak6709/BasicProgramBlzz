package com.Basicblz;

import java.util.Scanner;

public class ReverseDemoJavaBlz {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=s.nextInt();
		
		while(n>0) {
			
			int r=n%10;
			
			System.out.print(r);
			
			n=n/10;
			
		} 
		
		
       // int n=12;
         
         int r;
         
         for(int i=1;i<n;i++) {
          
         r=n%10;
         
         System.out.println(r);
         
         n=n/10;
         System.out.println(n);
         
         }
         
         
	}

} 
