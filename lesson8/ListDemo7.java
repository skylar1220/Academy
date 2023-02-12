package lesson8;

public class ListDemo7 {
	
	// 가변 매개변수 : 매개변수의 갯수가 정해지지 않고... 사용자가 입력하는 대로 사용
	
	
	// sum(1,2,3,4, 12.52) --> 어디까지가 매개변수니?
	
	public static int sum( double b , int...a ) { // 가변매개변수 꼭 맨 끝에!, 얘는 2개도 안됨: 순서가 int...a가 뒤로 가야지 어디까지가 매개변수인지 헷갈리지 않음
		while(true) {
			System.out.println("abc");
			break;
		}
		return 0 ;
	}
	
	public static int sum(int...a) { // sum()에 들어간 숫자 갯수만큼 배열로 만들어주는 것 = 가변매개변수
		int total = 0 ;
		for (int data : a) { // foreach문 써서 간단하게 for 문 만들어 "가변매개변수" 사용하기
			total += data;
		}
		return total;
	}

	public static void main(String[] args) {
		sum(10);
		sum(10,20);
		
		System.out.println(sum(10,20,30));
		int[] a = {10,20,30};
		


	}

}
