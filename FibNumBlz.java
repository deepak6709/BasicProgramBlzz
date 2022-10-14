package com.Basicblz;

public class FibNumBlz {
	static void fib(int range) {
		int f1 = 1;
		int f2 = 1;
		System.out.println(" " + f1 + "\n" + f2);

		for (int i = 1; i <= range; i++) {
			int f3 = f1 + f2;
			System.out.println(f3);
			f1 = f2;
			f2 = f3;

		}

	}

	public static void main(String[] args) {
		fib(5);

	}

}
