package com.Basicblz;

import java.util.Scanner;

public class FactNumBlzScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.err.println("Plz enter the number= ");
		int num = s.nextInt();
		int fact = 1;
		int count = 1;
		for (int i = 1; i <= num; i++) {

			fact = fact * i;
			System.out.println("factorial= " + fact);
			count++;
		}
		System.err.println("count= " + count);

	}

}
