package lesson7;

public class StudentDemo {

	public static void main(String[] args) {
		// 객체 만들고 데이터 적절하게 셋팅하고 값 확인
		Student s = new Student() ;
		s.setName("현지");
		System.out.println(s); // 객체 자체를 출력하면 toString() 호출한다. --- 시스템이 자동으로?!
		
		
	}

}
