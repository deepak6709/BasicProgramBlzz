package com.Basicblz;

import java.util.Scanner;

public class OneDigitTwoDigitDemoBlz {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.err.println("Enter The Digit Number");
		
		long digit=scanner.nextLong();
		
		if(digit<=9) {
			
			System.err.println("It is One Digit Number");
			
		}
		else if(digit>=10 && digit<=99) {
			
			System.err.println("It is Two Digit Number");
			
		}
		else if(digit>=100 && digit<=999) {
			
			System.err.println("It is Three  Digit Number");
		}
		else if(digit>=1000 && digit<=10000) {
			
			System.err.println("It is four Digit Number");
		}
		else {
			
			System.err.println("It is five digit Number");
		}
	}

}
