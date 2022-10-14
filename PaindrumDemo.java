package com.Basicblz;

import java.util.Scanner;

public class PaindrumDemo {

	public static void main(String[] args) {
	   
		 Scanner s= new Scanner(System.in);
		 
		 System.out.println("Enter The Number");
		 
		 int n=s.nextInt();
		 
		 int s1=0;
		 
		 int c=n;
		 
		  while(n>0) {
			  
			  int r=n%10;
			  
			s1=( ( s1*10)+r);
			
			n=n/10;
			  
		  }
		  if (c==s1) {
			  
			  System.out.println("Number is Paimdrum");
		  }
		  else {
			  
			  System.out.println("The Number Is NOt Pailndurm");
		  }
		 
	}

}
