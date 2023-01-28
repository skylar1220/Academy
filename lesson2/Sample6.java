package lesson2;

public class Sample6 {

	public static void main(String[] args) {
		// 논리 연산자
		
		int num1 = 1 ;
		int num2 = 2 ;
		
		boolean a = num1 > num2 ;
		boolean b = num1 < num2;
		
		System.out.println( a && b );  // and 둘 다 true 어야  -> true
		System.out.println( a || b );  // or 둘 중 하나만 true 여도 -> true


	}

}
