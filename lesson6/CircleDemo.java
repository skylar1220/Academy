package lesson6;

public class CircleDemo {

	public static void main(String[] args) {
		Circle c = new Circle();
		
		// 일반 버전 
		c.setRadius(4.2);

		c.setColor("red");
		c.show();
		
		// 메소드 체이닝 버전 
//		c.setColor("red").setRadius(3).show(); ;
		
	}

}
