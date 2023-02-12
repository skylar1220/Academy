package lesson8;

import java.util.ArrayList;

public class ListDemo2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>() ;
		
		// ArrayList의 값 추가: .add()

//		list.add(10);
		for (int i = 10; i < 15; i++) {
			list.add(i);
		}
		
		
		System.out.println(list);
		// ArrayList의 값 갖고오기: .get()
		System.out.println(list.get(0));
		// ArrayList의 값 설정: .set()
		list.set(0, 100); 
		System.out.println(list.get(0));

		// ArrayList의 길이: .size()
		for (int i = 0; i < list.size() ; i++) {
			System.out.print(list.get(i) + " ");
			
		}
	}

}
