package com.Basicblz;

import java.util.Scanner;

public class EvenOddSwtich {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.err.println("Enter ur choice  ");

		int option = scanner.nextInt();
		
		System.out.println("Enter The Number");

		int num = scanner.nextInt();

		switch (option) {

		case 1:

			if (num % 2 == 0) {

				System.out.println("The Number is even");
			}

			break;

		case 2:

			if (num % 2 != 0)

				System.out.println("The Number is odd");

			break;

		default:

			System.out.println("Invalid choice");

		}

	}
}
