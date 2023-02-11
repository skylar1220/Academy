package lesson5;
/*
 * 클래스 내부의 변수는 초기화를 생략해도 자동으로 초기화 된다. -> 클래스 내 직접 있는 변수들은 초기화 안해도 됨!
 * 각 타입의 기본값으로 초기화 
 * model 은 공백
 * price 는 0
 */

public class Phone {
	String model ;
	int price ; 
	void print() {
		System.out.printf("%d만원 짜리 %s 스마트폰\n", price , model );
		
	}
	

}
