package com.Basicblz;

import java.util.Scanner;

public class PositiveNegativeNumBlz {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enetre Ur number");
		int num=s.nextInt();
		
		if(num<0) {
			System.out.println("number is negative");
			
			
		}
		else if(num>0) {
			
			System.out.println("number is positive");
			
		}
		else {
			
			System.out.println("number is zero");
		}

	}

}
