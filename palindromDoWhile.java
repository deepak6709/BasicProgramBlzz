package Com.Basic;

import java.util.Scanner;

public class palindromDoWhile {

	public static void main(String[] args) {

		int s1 = 0;
		int num1;
		do {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the number");

		num1 = s.nextInt();

		int c = num1;

		

			int rem = num1 % 10;

			s1 = ((s1 * 10) + rem);
			num1 = num1 / 10;

			if (c == s1) {

				System.out.println("The Number is Palindrom " + c);

			} else {
				System.out.println("The Number is not Palindrom " + c);
			}

		} while (num1 > 0);

	}

}
