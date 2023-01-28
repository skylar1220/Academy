package lesson3;

public class Demo7_1 {

	public static void main(String[] args) {
		int number = 2;

		while (number < 10) {
			int j = 1;
			while (j < 10) {
				System.out.print(number * j + " ");
				j++;
			}
			System.out.println("\n");
			number++; // 2단, 3단 ...
		}
	}

}
