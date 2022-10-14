package com.Basicblz;

import java.util.Scanner;

public class TableBlzScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.err.println("plz enter the number");
		int n = s.nextInt();

		for (int i = 1; i <= 10; i++) {

			System.out.println(n * i);
		}

	}

}
