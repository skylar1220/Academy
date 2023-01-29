package lesson4;

public class Demo10 {

	public static void main(String[] args) {
		// one class
		// student number : 5
		// subject per student : 3

		String[] studentNames = { "김", "이", "박", "홍", "최" };

		int[][] subjects = { { 80, 90, 70 }, { 90, 80, 60 }, { 50, 60, 70 }, { 20, 30, 40 }, { 10, 20, 30 } };

		double[] avgs = { 0.0, 0.0, 0.0, 0.0, 0.0 }; // 초기화 한 번 시키기!

		// 목차
		System.out.println("이름\t국\t영\t수\t평균");

		// 2차원 배열이 subjects를 순환하면서 각 1차원 배열의 평균을 구해서 해당 순서에 맞게 avgs에 대입한다.
		
		for (int i = 0; i < subjects.length; i++) { // 2차원을 구성하는 1차원 갯수
			
			// 필요한 변수들 생성 모음.zip --- 최대한 그대로 쓰지 않고 변수로 쓰려고 변환 했다.
			int total = 0;
			String tab = "\t" ;
			String name = studentNames[i] ;
			String subject =  tab ;
			double avg = 0.0 ;

			for (int j = 0; j < subjects[i].length; j++) { // 1차원을 구성하는 데이터의 갯수 // 오.. 3이라고 쓰지말고 subjects[i].length 쓰면 되겠구나
				total += subjects[i][j];
				subject += subjects[i][j] + tab  ;
			}

			avgs[i] = total / subjects[i].length;
			avg = avgs[i] ;
			

			// 종합적으로 출력
			System.out.println( name + subject + avgs[i]);	
		}
	}
}


