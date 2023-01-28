package lesson3;

import java.util.Scanner;

public class Review {

	public static void main(String[] args) {

		// users 입력 받기
		Scanner in = new Scanner(System.in);

		System.out.print("Id?: ");
		String inputId = in.next();

		System.out.print("Password?: ");
		String inputPw = in.next();
	}

}


// scanner in은 한 번만 쓰고 뒤에서 그 in을 계속써도되는 건가? 그럼 맨 앞 한 줄의 의미는 무엇인거지?
