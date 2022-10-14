package com.Basicblz;

import java.util.Scanner;

public class SmallNumIfElseBlz {
// smaller Number In Three Number
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first number");

		int num1 = scanner.nextInt();

		System.out.println("Enter the Second number");

		int num2 =scanner.nextInt();

		System.out.println("Enter the third Number");

		int num3 =scanner.nextInt();

		if (num1 < num2 && num1 < num3) {

			System.err.println("Number1 is Samller: "+num1);

		} else if (num2 < num3) {

			System.err.println("Number 2 is smaller: "+num2);

		} else {
			System.err.println("Number3 is smaller: "+num3);

		}

	}

}
