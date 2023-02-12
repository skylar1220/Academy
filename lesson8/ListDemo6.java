package lesson8;

public class ListDemo6 {
	// 예외처리 기능이긴한데 --> 단점: 이 경우는 예외인 상황을 알고있을 때만 가능 ( ex) 나누는 수가 0인 경우 )

	// 0으로 나누면 안됨
	// 그래서 0이 아닐 때는 a/b 한 결과를 리턴하고, 
	// 만약 0이 들어오면 a/b 안되고 .. 그럼 뭘 리턴? --> 그 리턴값이 정상적으로 나눈 값인지, 예외처리한 값인지
	// 정상이면 정상값 리턴하고
	// 오류면 오류라는 정보를 리턴
	
	public static boolean divide(int a, int b, double[] result) {
		if (b==0) {
			return false;
		}
		else {
			result[0] = (double) a/b;
			return true;
		}
		
	}
	public static void main(String[] args) {
		double [] result = {0.0};
		if ( !(divide(10, 2, result)) ){ // 위의 리저트의 주소를 넘겨준 것 = 배열이니까 가능했음 = 값을 바꿀 수 있음
			System.out.println("by..zero");
			return;

		}
		System.out.println("result: " + result[0] );
	}

}
