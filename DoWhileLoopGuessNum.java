package com.Basicblz;

import java.util.Random;
import java.util.Scanner;

public class DoWhileLoopGuessNum {

	public static void main(String[] args) {

		int guessNum = 1;

		int userNUm = 0;

		Scanner s = new Scanner(System.in);

		Random r = new Random();

		do {

			System.out.println("Enter the number");

			userNUm = s.nextInt();

			guessNum = 1 + r.nextInt(100);

			System.out.println("Guess Number is" + guessNum);

			guessNum++;

		} while (guessNum != userNUm);

	}

}
