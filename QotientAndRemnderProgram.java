package com.Basicblz;

import java.util.Scanner;

public class QotientAndRemnderProgram {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter The number 1");

		int num1 = s.nextInt();

		System.out.println("Enter The number 1");

		int num2 = s.nextInt();

		int qot = num1 / num2;

		System.out.println("Qotient is =>> " + qot);

		int rem = num1 % num2;

		System.out.println("Reminder is =>> " + rem);

	}

}
