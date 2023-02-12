package lesson8;

enum CALCTYPE1 { ADD , MINUS, MULTI, DIVIDE} // 밑에 뭐가 더하기고 빼기고 이게 안 보이니까 type 1,2,3 대신 쓰는 것

public class Cal3 {

	public static void getResult(CALCTYPE1 type, Object[] result, int... a) { 
		// CALCTYPE type: CALCTYPE 이라는 데이터타입에 들어있는 계산방식을 가리키는 어떤 데이터 / result[] : 계산결과값 들어간 배열 / ...a[] : 입력할 몇개일지 모르는 수 들어간 배열
		long temp = a[0];

		switch (type) {
		case ADD:
			for (int i = 1; i < a.length; i++) {
				temp += a[i];
			}
			break;
		case MINUS:
			for (int i = 1; i < a.length; i++) {
				temp -= a[i];
			}
			break;
		case MULTI:
			for (int i = 1; i < a.length; i++) {
				if (a[i] != 0)
					temp *= a[i];
			}
			break;
		case DIVIDE:
			for (int i = 1; i < a.length; i++) {
				if (a[i] != 0)
					temp += a[i];
			}
			break;
		default:
			break;
		}

		result[0] = temp;


	}
	
	public static void main(String[] args) {
		int [] result = {0}; // 계산결과 하나 들어갈 result[] 배열 초기화
		getResult(CALCTYPE.ADD, result, 10,50,20,10,20,50);
		System.out.println(result[0]);
	}

}

// 근데 결과에 long 을 이리 저리 해줘야 결과가 제대로 나오네? 왜지...
