package lesson7;

public class CircleDemo2 {

	public static void main(String[] args) {
		Circle c = new Circle(3.5);
		
		
		// 생성자를 통해서 radius 셋팅하고 getSize의 반환값 출력하기
		c.setRadius(6);
		System.out.println(c.getSize());
		System.out.println(Circle.getSize2());

	}

}
