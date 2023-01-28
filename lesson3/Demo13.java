/*
 * 사용자로부터 계속 반복적으로 숫자를 입력받아서
 * 그 숫자들의 합이 100을 넘어가면 멈춰라 
 */

package lesson3;

import java.util.Scanner;

public class Demo13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in) ;
		
		int sum = 0 ;
		while ( sum < 100 ) {
			System.out.print("현재 합계: " + sum + "\n" );
			System.out.print("합치고 싶은 정수를 입력해주세요: ");
			int num = in.nextInt() ;
			sum = sum + num ;
		}
		System.out.print("합계가 100이 넘었습니다. 최종 합계: " + sum );

	}
}

