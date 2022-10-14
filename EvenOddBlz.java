package com.Basicblz;

import java.util.Scanner;

public class EvenOddBlz {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.err.println("Enter the Number:");
		
		int number= scanner.nextInt();
		
		if(number%2==0) {
			
			System.out.println("The Number is Even:");
			
		}
		else {
			
			
			System.out.println("The Number is Odd:");
		}

	}

}
