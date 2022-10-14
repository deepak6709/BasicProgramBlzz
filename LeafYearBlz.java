package com.Basicblz;

import java.util.Scanner;

public class LeafYearBlz {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the  Year ");
		
		int year=s.nextInt();
		
		if(year%4==0) {
			
			System.out.println(year+ "It is leaf Year");
			
		}
		else if(year%100==0) {
			
			System.out.println(year+"it is not leaf Year");
			
		}
		else if(year%400==0) {
			
			System.out.println(year+"it is not leaf year");
			
		}
		else {
			System.out.println("it is not leaf year");
			
		}

	}

}
