package lesson4;


// 각 구동 부분을 눈에 들어오게 나눠 표시하는 용도로 쓰일 때 =  함수
import java.util.Scanner;

public class Demo6 {

	// 사용자로부터 값을 입력을 받아서 (2개)
	// 사칙연산을 하는 프로그램
	
	// 1. 메인코드
	public static void main(String[] args) {
		int number1 = getDataFromConsole();
		int number2 = getDataFromConsole();
		
		calcProcess4(number1, number2) ;
	
	}
	
	// 2. 데이터 입력받기 (정수형) -> int
	public static int getDataFromConsole() {
		Scanner sc = new Scanner(System.in) ;
		System.out.print("숫자를 입력하세요: ");
		int number1 = sc.nextInt() ;
		return number1 ;
	}

	// 3. 사칙연산 결과 출력하기   -> void
	public static void calcProcess4(int n1, int n2) {
		System.out.println( "+ : " +  ( n1 + n2 ) );
		System.out.println( "- : " +  ( n1 - n2 ) );
		System.out.println( "* : " +  ( n1 * n2 ) );
		if (n2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return;
		}
		System.out.println( "/ : " +  ( n1 / n2 ) );
	}
}
