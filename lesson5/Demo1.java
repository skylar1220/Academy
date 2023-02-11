package lesson5;

// 용어 : method function (함수)
// 함수 또는 메소드
// 함수 : 독립적으로 생성해서 독립적으로 사용 
// 메소드 : 클래스 내부에 해당 클래스의 멤버로서 생성 객체를 통해 사용
// 함수에 데이터를 전달하는 방식 
// 1. call by value
// 2. call by reference
// 1,2 둘다... 값이 복사되서 함수로 넘어간다... copy
// value 방식: int double long ... 소문자로 시작하는 데이터 타입은 메모리에 직접 다이렉트로 값이 들어있다.
// reference 방식: 딱 두개 배열, 객체 


//1. call by value

public class Demo1 {

	public static void main(String[] args)  {

		int a = 0 ; 
		// 함수 호출
		increment(a) ;
		System.out.println("함수 호출한 후 전달한 a의 값 = " + a);
		

	}
	
	public static void increment (int a) {
		System.out.println("전달받은 값 a = " + a );
		a++ ;
		System.out.println("함수에서 수정한 값 a = " + a );
	}

}
