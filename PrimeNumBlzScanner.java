package com.Basicblz;

import java.util.Scanner;

public class PrimeNumBlzScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.err.println("Plz enter the number= ");
		int num = s.nextInt();
		int pri = num / 2;
		if (pri % 2 == 0) {

			System.out.println("It  not is prime");
		} else {

			System.out.println("It is  prime");
		}
	}

}
