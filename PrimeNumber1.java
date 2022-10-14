package Com.Basic;

import java.util.Scanner;

public class PrimeNumber1 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int num =s.nextInt();
		
		if(num%2>0 && num%1>0&& num%3>0 && num%5>0 && num%7>0) {
			
			System.out.println("the number is prime: "+num);
			
		}
		else {
			
			System.out.println("Number is not prime :"+num);
		}

	}

}
