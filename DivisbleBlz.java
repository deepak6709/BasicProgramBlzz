package Com.Basic;

import java.util.Scanner;

public class DivisbleBlz {

	public static void main(String[] args) {

		int count = 0;
		for (int num = 1; num <= 100; num++) {

			if (num % 3 == 0 ) {

				System.out.println("The NUmber is divible by 3" + num);
				count++;

			} else if(num%5==0) {

				System.out.println("The Number is divisble by 5");
			}
			else {
				
				System.out.println("number is not divisble by both 3 And 5");
			}

		}
		System.out.println("The count is :" + count);

	}

}
