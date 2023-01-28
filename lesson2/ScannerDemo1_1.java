package lesson2;

import java.util.Scanner;

public class ScannerDemo1_1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("이름을 입력하세요: ");
		String name = in.next();
		System.out.print("나이를 입력하세요: ");
		int age = in.nextInt();
		System.out.printf("당신은 %d살의 %s이군요!", age, name );
		
		
	}

}
