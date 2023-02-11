package lesson5;

public class PhoneDemo {

	
	// 객체 지향
	public static void main(String[] args) {
		// phone 객체 2개를 만들어서 각각의 변수를 적당히 셋팅하고 show 함수 호출
		
	Phone p1 = new Phone() ;
	p1.model = "samsung" ;
	p1.price = 100 ;
	p1.print();
	
	Phone p2 = new Phone() ;
	p2.model = "apple" ;
	p2.price = 150 ;
	p2.print();
	
	// 참조 타

	p1 = p2 ; // 삼성 = 애플 --- p1, p2는 같은 주소를 가지는 객체  즉... 같은 객체 
	p1.print(); // 삼성을 프린트해도 애플이 나오겠지
	p1.price = 0 ; // 그 애플이 된 삼성의 가격을 0으로 바꾸고
	
	p2.print(); // 애플을 프린트하면 가격이 0이되어 나오겠지.
	

	}

}
