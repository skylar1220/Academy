package lesson4;

/*
 * 배열 : 연속적인 데이터의 집합
 * 		 동일한 데이터 타입 - 묶는다.
 * 	 	 동적 배열 지원 안함 - 생성시 	배열 갯수를 지정
 *  	 타입[] 배열 변수명;
 */
public class Demo7 {

	public static void main(String[] args) {
		// 정수형 데이터 5개를 저장할 수 있는 배열 만들기
		int [] ary = {1,0,0,0,0} ; // 생성과 동시에 초기화
		System.out.println(ary[0]);
		
		// 배열의 크기는 배열변수명.length
		System.out.println("ary length: " + ary.length);
		
		int [] ary2 = new int[5] ;
		System.out.println("ary2 length: " + ary2.length);
		
		
		// 배열 만드는 방법 - 생성과 동시에 초기화
		int [] ary3 = {1,0,0,0,0} ; 

		// 배열 만드는 방법 - 선언 먼저 하고 데이터 나중에 초기화
		// 배열은 타입의 기본값으로 초기화가 자동으로 됨
		int [] ary4  ;
		ary4 = new int[5] ;
		System.out.println(ary4[2]);
		
		// 배열 만드는 방법 - 이건 안됨
		int [] ary5  ;
//		ary5 = {1,0,0,0,0} ; 


	}

}
