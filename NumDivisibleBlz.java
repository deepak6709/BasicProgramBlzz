package com.Basicblz;

import java.util.Scanner;

public class NumDivisibleBlz {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.err.println("Enter The Number ");

		int num = scanner.nextInt();

		if (num % 3 == 0) {

			System.out.println("The Number is divisble 3");

		} else if (num % 3 == 0 && num % 5 == 0) {

			System.out.println("The Number Is Divisble by both 3 and 5");

		} else {

			System.out.println("The Number is not Divisble by both 3 and 5");
		}

	}

}
