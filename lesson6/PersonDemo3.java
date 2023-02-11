package lesson6;

public class PersonDemo3 {

	public static void main(String[] args) {
		
		// 경우1: 이렇게 만들어도 되고
		Person3 p = new Person3(); // 생성자 Person()  생긴게... 메소드를 호출하는 모양 - 실제로 호출
		
		// 경우2: 이렇게 만들어놓고 나중에 채워도 되고
//		Person3 p = null;
//		p = new Person3();

		Person3 p2 = new Person3(1, 2, 4, "ㅇ") ; // 왜 오류?
		
		
		// 생성자는 초기화 할 때 사용 - 주로 멤버 변수를 적절하게 초기화 할 때


	}

}
