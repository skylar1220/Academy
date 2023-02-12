package lesson8;

import java.util.Scanner;

public class ListDemo1 {

	public static void main(String[] args) {
		// Scanner 객체를 생성
		Scanner sc = new Scanner(System.in); // 얘는 기본생성자 아니라 매개변수 생성자
		
		// 0 이상의 숫자만 계속 입력해서 입력한 데이터를 저장, 만약 음수를 입력하면 중지
		// 입력한 데이터를 모두 저장하고 평균과 합을 구해서 출력
		
		int [] ary = new int [10] ;
		int sum = 0 ;
		double avg = 0.0 ;
		
		for (int i = 0; i < ary.length; i++) {
			System.out.print("input data: ");
			int data = sc.nextInt(); // 정수를 사용자로부터 입력받는다.
			if (data<0)
				break;
			ary[i] = data ; 
			sum += data ;
		}
		avg = (double) sum / ary.length ;
		
		System.out.println(avg);
		
		System.out.println(" - ".repeat(20));
		
	}

}
