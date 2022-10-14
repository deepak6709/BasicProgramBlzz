package com.Basicblz;

import java.util.Scanner;

public class WeekNumSwtichCase {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.err.println("Enter ur choice  ");

		int week = scanner.nextInt();

		switch (week) {

		case 1:

			System.out.println("Monday");

			break;

		case 2:

			System.out.println("Theusday");

			break;

		case 3:

			System.out.println("Wednesday");

			break;

		case 4:

			System.out.println("Thursday");

			break;

		case 5:

			System.out.println("Friday");

			break;

		case 6:

			System.out.println("Satarday");

			break;

		case 7:

			System.out.println("sunday");

			break;

		default:

			System.out.println("Invalid choice");

		}

	}

}
