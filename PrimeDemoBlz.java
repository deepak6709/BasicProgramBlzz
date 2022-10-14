package Com.Basic;

import java.util.Scanner;

public class PrimeDemoBlz {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter The Number");

		int num = s.nextInt();
		
		for(int i=0;i<=num/2;i++) {
			
			if(i%2==0) {
				
				System.out.println("The number is not prime: "+i);
				
			}
			else {
				
				System.out.println("The number is  prime: "+i);
				
			}
			
		}

	}

}
