package com.Basicblz;

import java.util.Scanner;

public class ArrayDemoEvenOdd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter The size Of Array");
		
		int a=s.nextInt();
		
		
		int arr[]=new int[a];
		
		for(int i=0;i<=arr.length;i++) {
			
			arr[i]=s.nextInt();
			
			
		}
		
		for( int i=0;i<=arr.length;i++) {
			
			
			if(arr[i]%2==0) {
				
				System.out.println("The NUmber Is Even");
				
			}
			else {
				
				System.out.println("The NUmber Is odd");
				
				
			}
			
			
		}

		
		}

}
