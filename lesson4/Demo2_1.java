package lesson4;

import java.util.Scanner;

public class Demo2_1 {


	public static int sum(int num1, int num2 ) { // 1. 함수 이름 앞에 데이터 타입이 있으면 return 뭔가를 꼭 값을 돌려줘야함
		int sum = 0 ;
		for ( int i = num1 ; i <= num2 ; i++ ) {
			sum += i;
		}
		return sum;
	}
	
	
	public static void main(String[] args) { // 2. void = 리턴 값이 없다.-> 돌려줄 값이 없음  원래라면 저자리에 돌려줄 값의 데이터타입을 알려줌.
		Scanner in = new Scanner(System.in) ;
		System.out.print("시작 숫자를 입력해주세요: ");
		int num1 = in.nextInt() ;
		
		System.out.print("마지막 숫자를 입력해주세요: ");
		int num2 = in.nextInt() ;
		
		System.out.println(sum(num1, num2));
	}
	

	

}


// sum = 0
// for (int i = 시작숫자; i<=마지막숫자; i++) {
// sum += i
// }