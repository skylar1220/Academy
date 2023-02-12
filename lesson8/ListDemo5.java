package lesson8;

public class ListDemo5 {
	
	public static void increase(int[] x) {
		x[0]++;
	}


	public static void main(String[] args) {
		int [] number = {10} ;
		
		System.out.println("before function call: " + number[0] );
		increase(number);
		System.out.println("after function call: " + number[0] ); // int number = 10 으로 했을 때는 안바뀐다. --> 이걸 객체로 바꾸면 바뀐다 @@왜?? 이해필

	}
	
	
	// 안되는 버전
//	public static void increase(int x) {
//		x++;
//	}
//
//
//	public static void main(String[] args) {
//		int number = 10 ;
//		
//		System.out.println("before function call: " + number );
//		increase(number);
//		System.out.println("after function call: " + number ); // int number = 10 으로 했을 때는 안바뀐다. --> 이걸 객체로 바꾸면 바뀐다 @@왜?? 이해필
//
//	}

}

