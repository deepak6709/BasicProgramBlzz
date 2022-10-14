package com.Basicblz;

import java.util.Random;

public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int flip = r.nextInt(2);
		if (flip == 0) {

			System.out.println("HEAD");

		} else {
			System.out.println("TAIL");

		}
	}

}
