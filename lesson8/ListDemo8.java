package lesson8;

//변수하나:  radius 변수
//함수 하나: 원의 넓이 구하는 pi r 제곰

class Circle{
	public Circle() {}
	
	public Circle(double radius) { // 이건 매개변수 생성자인데... = 객체가 하나씩 생길 때 마다 이 과정이 자동으로 이루어진다. --- @ 이게 왜 있어야 하는지 이해!! 이게 뭐하는 기능이지 정확히?
		this.radius = radius ;
	}

	private double radius ;
	
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	
	public double getArea() {
		return 3.14 * radius * radius ;
	}
	
}

// @@ 이해 필요@@@ 전체 다!!

public class ListDemo8 {
	
	public static void main(String[] args) {
		// object array - size : 5 객체 배열 5개짜리 배열변수 
		// 각각의 객체의 반지름은 1.0 ~ 5.0 
		
		Circle c = new Circle () ;
		
//		Circle [] ary = new Circle[5] ;
//		ary[0] = new Circle(1.0);
//		ary[1] = new Circle(2.0);
//		ary[2] = new Circle(3.0);
//		ary[3] = new Circle(4.0);
//		ary[4] = new Circle(5.0);
		
		Circle [] ary = { new Circle(1.0) , new Circle(2.0) , new Circle(3.0) , new Circle(4.0) , new Circle(5.0) } ;

		for (Circle cc : ary) { // @ 여기서 cc란 circle에 속한 객체? 그럼 이건 일반 for문으로 풀어쓸 수는 없나? 이해가 잘 안되서 보려고...
			System.out.println("원의 넓이: " + cc.getArea());
		}
		
		
		
	}

}
