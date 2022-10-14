package com.Basicblz;

import java.util.Scanner;

public class VowelsSwichBlz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.err.println("Enter The Charcter");

		String ch = scanner.next();

		switch (ch) {

		case "A":

			System.out.println("It is Vowels");

			break;

		case "E":

			System.out.println("It is Vowels");

			break;

		case "I":

			System.out.println("It is Vowels");

			break;

		case "O":

			System.out.println("It is Vowels");

			break;

		case "U":

			System.out.println("It is Vowels");

			break;

		default:

			System.out.println("It is not vowels it is consonant");

		}
	}

}
