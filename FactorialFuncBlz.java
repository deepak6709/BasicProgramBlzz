package com.Basicblz;

public class FactorialFuncBlz {

	static void fact(int num) {

		int fact = 1;
		for (int i = 1; i <= 5; i++) {

			fact = fact * i;
			System.out.println("factorial=" + fact);
		}
	}

	public static void main(String[] args) {

		fact(5);

	}

}
