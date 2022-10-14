package com.Basicblz;

import java.util.Scanner;

public class PowerProgBlz {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter The Number");
		
		int n=s.nextInt();
		
		System.out.println("Enter THe Power");
		
		int p=s.nextInt();
		
		int res=1;
		
		for(int i=1;i<=p;i++) {
			
			res=res*n;
			
			
		}
		System.out.println("result="+res);
		
		
		
	}

}
