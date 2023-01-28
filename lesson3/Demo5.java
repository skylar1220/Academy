/*
 * 순환문 : 반복
 */

package lesson3;

public class Demo5 {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += 10;
		}
		System.out.println("sum = " + sum);

		
		int sum2 = 0;
		int j = 0;
		while (j < 10) {
			sum2 += 10;
			j++;
		}
		System.out.println("sum2 = " + sum);

	}

}
