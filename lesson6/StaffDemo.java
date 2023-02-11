package lesson6;

public class StaffDemo {

	public static void main(String[] args) {
		Staff s = new Staff();

		// 버전1
//		s.setAge(20);
//		s.setName("현");
//		s.sayHello();

		// Demo에 오잉 과정이 추가되어야하는 버전2 = 체이닝 연속
		// 장점: 
		s.setName("현").setAge(25).sayHello();
		
		s.setName("kim").sayHello();


	}

}
