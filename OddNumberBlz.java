package Com.Basic;

public class OddNumberBlz {

	public static void main(String[] args) {

		int count = 0;
		for (int num = 20; num > 1; num--) {

			if (num % 2 != 0) {

				System.out.println("The NUmber Is odd" + num);
				count++;

			}

		}
		System.out.println("The count is :" + count);

	}

}
