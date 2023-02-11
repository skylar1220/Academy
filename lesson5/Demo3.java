package lesson5;

/*
 * 정수형 변수 두개를 받아서 최대값을 출력하는 함수
 * 실수형 변수 두개를 받아서 최대값을 리턴하는 함수
 * 메소드 overloading
 */

public class Demo3 {

	public static void main(String[] args) {
		int a = 7 ;	
		int b = 20 ;
		max( a,  b) ;
		double c = 1.2 , d = 2.3 ;
		System.out.println( max (c,d) );
	}
	
	// 리턴 없는 그냥 출력 버전 
	public static void max(int a, int b) {
//		if ( a > b ) {
//			System.out.println(a);
//		} else {
//			System.out.println(b);
//		}
		// 그냥 삼연산자로 짧게 쓸 수 있다
		System.out.println( ( a > b )? a : b );
	}
	
	// 리턴 있는 버전 
	public static double max(double a, double b) {
		return  (a > b)? a : b  ;
	}

}
