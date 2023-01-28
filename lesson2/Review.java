package lesson2;

import java.util.Scanner;  // import 해줘

public class Review {

	public static void main(String[] args) {
		// 키보드 입력을 받기위한 객체(변수)를 생성
		Scanner in = new Scanner (System.in);
//		int x = in.nextInt();
//		int y = in.nextInt();
//		System.out.printf( "%d * %d의 결과는 %d입니다. \n", x, y, x*y );
		
		System.out.println("프로그램을 종료하고 싶으면 이름을 입력하세요:");
		String input = in.next(); // 기다린다... 사용자가 키보드로부터 값을 입력하기 전까지 대기 + 문자열로 반환
		
		System.out.printf("현재 사용자는 %s입니다. \n", input);
		
		System.out.println("double: ");
		double input2 = in.nextDouble() ;
		System.out.println("double 입력값은: " + input2);
		
		System.out.println("프로그램 종료");
	
		
	}

}

// ? 이렇게 scanner in은 한 번만 쓰고 뒤에서 그 in을 계속써도되는 건가? 그럼 맨 앞 한 줄의 의미는 무엇인거지?