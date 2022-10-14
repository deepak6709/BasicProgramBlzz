package com.Basicblz;

import java.util.Scanner;

public class EmpSalDemoBlz {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the pin");

		int pin = scanner.nextInt();

		double bal = 25000;

		System.out.println("Enter The ur pin");

		int Userpin = scanner.nextInt();

		System.out.println("Enter Ur amount");

		long useramount = scanner.nextLong();

		if (pin == Userpin) {

			if (useramount <= bal) {

				double finalbal = bal - useramount;

				System.err.println("Final balnce is" + finalbal);

			} else if (useramount < 0) {

				System.err.println("invalid amount ");

			}
			else {
				
				System.out.println("Valid amount");
			}
		} else {
			System.out.println("Invalid pin");

		}
	}

}
