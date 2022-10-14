package com.Basicblz;

import java.util.Scanner;

public class UseAllDatatype {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the integer Value ");
		int num = s.nextInt();
		System.out.println("Enter The byte Value ");

		byte b = s.nextByte();

		System.out.println("enter The Short Number ");

		short ss = s.nextShort();

		System.out.println("Enter The LoNg value ");

		long l = s.nextLong();

		System.out.println("Enter The Folat Value ");
		float f = s.nextFloat();

		System.out.println("Enter The Double Value ");

		double d = s.nextDouble();

		System.out.println("enter The Character ");

		char ch = s.next().charAt(0);

		System.out.println("Enter The String ");

		String sss = s.next();

		System.out.println("enter the Boolean value");
		boolean bb = s.nextBoolean();

		System.err.println("Integer num  :" + num);
		System.err.println("Byte Number  :" + b);
		System.err.println("Short Value  :" + ss);
		System.err.println(" long value  :" + l);
		System.err.println("Float Value  :" + f);
		System.err.println("Double Value :" + d);
		System.err.println("Charactyer   :" + ch);
		System.err.println("String       :" + sss);
		System.err.println("Bollean Value:" + bb);

	}

}
