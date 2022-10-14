package Com.Basic;

import java.util.Scanner;

public class ProgramDemo {

	public static void main(String[] args) {
		



	
		int a;
		int Choices;
		int fact = 1;
		System.err.println("Enter a number");
		Scanner AA=new Scanner (System.in);
		a=AA.nextInt();
		
		System.err.println("Enter your choice ");
		System.err.println("1. Prime Number  2.Even/Odd  3.Factorial Number ");
		Choices=AA.nextInt();
		
		switch (Choices) {
		case 1:
				if(a==1||a==3||a==5||a==7||a==2) {
					System.err.println("This is prime number"+a);
					
				}
				else if(a%2>0&&a%1>0&&a%3>0&&a%5>0&&a%7>0) {
						System.err.println("This  prime number  ");
				}
				else {
					System.err.println("This is not prime number  ");
				}
				break;
		case 2:
				if(a%2==0) {
					System.err.println("This is Even  number  "+a);
					
				}
				else if (a%2!=0) {
					System.err.println("This is odd number  "+a);
				}
				break;
		case 3:
				for (int i=1;i<=a;i++) {
					fact=fact*i;
					
				}
				System.err.println("Fact. num is  "+fact );
			default:
				System.err.println("Invalid choice option ");
		}
	
	

	

	}

}
