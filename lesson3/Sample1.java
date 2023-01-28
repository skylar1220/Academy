// 조건문 if 
// 단일 조건, 다중 조건 ( &&, || )
// 순환문 
// while문 - 특정 조건  check
// for문 - 횟수를 check

package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {
		Random rd = new Random();
		int computer = rd.nextInt(100); // 0-99 임의 숫자
		int count = 0 ;

		// 사용자 값을 받는
		Scanner sc = new Scanner(System.in);

		// 사용자 값이 > 컴퓨터 ... 크다
		// 사용자 값이 < 컴퓨터 ... 작다
		// 사용자 값이 = 컴퓨터 ... 정답 ... 프로그램 종료
		while (true) {
			System.out.print("추측한 숫자를 입력하세요(~100): ");
			int humanNumber = sc.nextInt();
			
			if (computer == humanNumber) {
				break;
			} else if (computer > humanNumber) {
				System.out.println("정답보다 작습니다.");
			} else if (computer < humanNumber) {
				System.out.println("정답보다 큽니다.");
			}
			count++ ;
		}
		System.out.println("정답입니다. 랜덤숫자 정답: " + computer + ", 총 시도 횟수: " + count );
	}

}
