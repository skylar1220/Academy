package lesson7;

public class Array2dDemo {
	
	public static double round(double x, int index) {
		// 1 10
		// 2 100
		
		return Math.round((x)*(index *10))/(index *10) ;
		
	}

	public static void main(String[] args) {
		// 2차원 배열을 만들고 초기화
		double [][] interest = { 
				{3.2, 3.1, 3.2, 3.0}, // 1차 년도의 이자
				{2.9, 2.8, 2.7, 2.6}, // 2차 년도의 이자
				{2.7, 2.6, 2.5, 2.4} // 3차 년도의 이자
		};
		
		double totalIntr = 0 ;
		double totalAvg = 0 ;

		
		// 1차 년도의 평균 이자율
		for (int i = 0; i < interest.length; i++) {
			double total = 0 ;
			double avg = 0 ;
			for (int j = 0; j < interest[i].length; j++) {
				total += interest[i][j];
			}
			avg = total / interest[i].length ;
			System.out.printf("%d차 년도의 이자는 %.2f퍼센트입니다.\n", i+1, avg);
			totalIntr += avg ; 
			totalAvg = totalIntr / interest.length ;
		} 			
		System.out.printf("3년 간의 평균 이자율은 %.2f퍼센트입니다.\n", totalAvg);

		System.out.println(round(totalAvg,2));
		
	}

}
