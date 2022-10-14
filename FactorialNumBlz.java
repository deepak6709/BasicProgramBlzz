package com.Basicblz;

public class FactorialNumBlz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact = 1;
		int count = 1;
		for (int i = 1; i <= 10; i++) {

			fact = fact * i;
			System.out.println("factorial= " + fact);
			count++;
		}
		System.err.println("count= " + count);

	}

}
