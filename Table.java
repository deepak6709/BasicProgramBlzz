package com.Basicblz;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the number");
		
		int num=s.nextInt();
		
		for(int i=0 ; i<=10;i++) {
			
			System.out.println("Table is "+num*i);
			
			
		}

	}

}
