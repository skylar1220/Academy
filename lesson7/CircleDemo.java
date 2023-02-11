package lesson7;

public class CircleDemo {

	public static void main(String[] args) {
		// static 멤버 호출
		System.out.println(Circle.circleMaxNum ); // static 멤버 변수라, 클래스를 객체로 안 만들고도 호출 가능! -- 객체 만들 때마다 메모리 차지하니 절약!
		
		// 인스턴스 멤버 호출 : 객체를 통해서 ( 즉, 객체생성)
		Circle c = new Circle();
		c.setRadius(2.36);
		
//		c.MAXCIRCLENUM = 20; // error -- 아래 같은 일들은 할 수 있지만..
		int temp = c.MAXCIRCLENUM ;
		System.out.println(c.MAXCIRCLENUM);
		
		Circle c2 = new Circle();
		System.out.println(c2.MAXCIRCLENUM);
		System.out.println(Circle.circleMaxNum);
		


	}

}
