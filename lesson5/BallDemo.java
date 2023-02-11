package lesson5;

public class BallDemo {

	public static void main(String[] args) {
		// 변수 만들듯이 Ball 이라는 새로운 타입 (클래스)를 이용해서 만든다. 
		// 초기화 한다.
		
		int a = 0 ; // 1
		a = 0 ; // 2
		System.out.println(a);
	
		
		Ball b  ;
		b = new Ball();
		
		// 클래스이름 변수;
		// 변수 = new 클래스이름(); --- 생성자라고 한다.
		// 위 둘을 합쳐서
		// 클래스이름 변수 =  new 클래스이름();
		
		Ball c = new Ball();		
		System.out.println( c.radius );
		System.out.println( c.getvolume() );

	}

}
