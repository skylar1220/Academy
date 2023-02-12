package lesson8;

import java.util.ArrayList;
import java.util.Scanner;

public class ListDemo4 {

	public static void main(String[] args) {
		// Scanner 객체를 생성
		Scanner sc = new Scanner(System.in); // 얘는 기본생성자 아니라 매개변수 생성자
		
		// 0 이상의 숫자만 계속 입력해서 입력한 데이터를 저장, 만약 음수를 입력하면 중지
		// 입력한 데이터를 모두 저장하고 평균과 합을 구해서 출력
		
		int sum = 0 ;
		double avg = 0.0 ;
		int data = 0; 
		System.out.print("input data: ");

		
		ArrayList<Integer> ary2 = new ArrayList<Integer>();
		
        
//			int data = sc.nextInt(); // 정수를 사용자로부터 입력받는다.
//			if (data<0)
//				break; 원래 이랬던 애를 아래와 같이 진화!!

		while ( (data = sc.nextInt() )>0) { // @ ver2. 이렇게 while () 안에 입력문 + if break 문도 넣을 수 있다!
			ary2.add(data); // @ ver1. for문을 쓸 필요도 없고, i를 생각할 필요도 없다 왜냐 갯수가 정해져있지 않으니까..
			sum += data ;
			System.out.print("input data: ");

		}
		avg = (double) sum / ary2.size();
		
		System.out.println(" - ".repeat(20));

		System.out.println(avg);
		
	}

}
