package lesson7;

public class Circle {
	static int circleMaxNum = 100 ; // 정적 멤버 변수 
	
	public static final int MAXCIRCLENUM = 200; // 1.
	public final int MAXCIRCLENUM2 = 200; // 2. 따라서 final에는 static 자동 붙여라
	// 위 두개의 차이는 1. static 이 붙으면 demo 파일에서 굳이 2. circle c 객체 만들어서 c.max로 부를 필요 없이, 그냥 circle.max로 클래스로 부를 수 있음
	// static은 이런 변수도 되지만 메소드에 붙여도 됨
	
	private static double radius ; 		// 인스턴스 멤버 변수 (static 안 붙은 애들은 다)
	

	public Circle(double d) {
		this.radius = radius ;
	}

	public double getRadius() {
		return radius;
	}

	// 생성자를 통해서 radius 셋팅한다의 뜻은 이거다
	public void setRadius(double radius) { // 매개변수 생성자 ?? 이거 이해해야해
		this.radius = radius;
	}
	
	
	
	// 인스턴스 메소드 : 안에서는 static 정적 요소를 사용할 수 있음
	public double getSize() {
		System.out.println(MAXCIRCLENUM); // static 변수도 잘 써지네?
		return radius * radius * 3.14 ; 
	}
	
	// 정적 메소드 : 안에서는 인스턴스 요소를 사용할 수 없다.
	public static double getSize2() { // ??어차피 static인데 public 써줘야하나?
		System.out.println(MAXCIRCLENUM); // MAXCIRCLENUM2는 인스턴스라 안된다
		return radius * radius * 3.14 ; 
	}
	
	// static 은 끼리끼리 논다... 나쁜 애들ㅋㅋ 
}
