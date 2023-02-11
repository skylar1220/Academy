package lesson5;

public class CIrcleDemo {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.radius = 3.3 ; 
		double area = c1.findArea();
		System.out.println(area );
		
		//c. 메소드 호출하면 아래와 같은 형태로 출력되도록 새로운 메소드를 circle 클래스에 정의하고 사용
		// 반지름은 000이고 넓이는 000 입니다. 
		
		Circle c2 = new Circle();
		c2.radius = 4.1 ;
		c2.show();

		
	}

}
