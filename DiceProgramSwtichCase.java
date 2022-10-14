package Com.Basic;

import java.util.Random;
import java.util.Scanner;

public class DiceProgramSwtichCase {

	public static void main(String[] args) {

		Random r = new Random();

		System.out.println("The dice number is");

		int dice = r.nextInt(6) + 1;

		int count = 0;

		switch (dice) {

		case 1:

			System.out.println("one");

			break;

		case 2:

			System.out.println("Two");

			break;

		case 3:

			System.out.println("Three");

			break;

		case 4:

			System.out.println("Four");

			break;

		case 5:

			System.out.println("Five");

			break;

		case 6:

			System.out.println("six");
			break;

		default:

			System.out.println("zero");

		}
		count++;

		System.out.println("total count is " + count);

	}

}
