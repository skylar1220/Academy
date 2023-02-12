package lesson8;

import java.util.ArrayList;

public class ListDemo3 {

	public static void main(String[] args) {
		// 어레이 리스트를 만들고
		// 임의의 값을 넣어주고 ( 갯수는 맘대로) - 랜덤하게 넣어주세요.
		// foreach 라는 순환문으로 순환
		
		ArrayList<Integer> ary = new ArrayList<Integer>() ;

		
		for (int i = 0; i < 20; i++) {
			ary.add((int)(Math.random() * 20) );  // math는 클래스, random이는 따로 객체 선언 안했지만 뜨느 걸 보니 static이다
			// random 메소드는 0~1사이라 *10 이런 걸 해줘야한다.
		}
		
		System.out.println(ary);
		System.out.println("ary의 몇번째:" + ary.get(2));

		System.out.println("-".repeat(50));
		
		// 10보다 큰 수만 출력
		for (Integer data : ary) { // 알아서 갯수만큼 순환을 해준다. 한 줄로 for문을 해주는 것, data라는 변수에 13 12를 각각 넣어준다 @@ 이거 이해 필요!
			if(data > 10)
				System.out.print(data + " ");
		}
		
	}

}
