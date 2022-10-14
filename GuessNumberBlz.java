package com.Basicblz;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberBlz {

	public static void main(String[] args) {

		int guessNum = 1;
		int userNum = 0;

		Scanner s = new Scanner(System.in);

		Random r = new Random();

		while (guessNum != userNum) {

			System.out.println("Enter The Number");

			userNum = s.nextInt();

			guessNum = r.nextInt(100) + 1;

			System.out.println("Guess Number= " + guessNum);

			guessNum++;

		}

	}

}
