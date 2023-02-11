package lesson6;

import java.util.Scanner;

/*
 * 학생클래스
        변수 : 이름-name, 배열(국 영 수) scores, 성적 - grade(A B C D F)
        메소드 : 평균 - getMean, 성적(학점) - calcGrade , 학생정보 출력 - studentInfo
             : 국영수 각각 점수 입력 setScores
 */

public class Student {
	String name ; 
	int [] scores = new int [3] ;
	private String grade ; // 기존 입력받는 애로가 아니라 외부에서 입력하지 못하도록 하려면 -> private 씌워주
	private double avg; // private 
	
	double getMean() {
		int total = 0;
		int i = 0 ; 
		for ( i = 0 ; i < scores.length ; i++ ) {
			total += scores[i] ;
		}
		avg = (double) total / scores.length ;
		return avg ;
	}
	
	String calcGrade() {
		// 1. 평균을 구한다.
		// 2. 평균을 가지고 각 학점에 해당하는 구간인지 파악하고 학점을 grade 변수에 입력한다.
		
		double avg = getMean() ; // avg는 앞에 avg랑 중복 아님 -> 포함되어있는 범위가 다르기 때문
		if ( avg > 90 ) { grade ="A";} 
		else if ( avg > 80 ) { grade ="B";} 
		else if ( avg > 70 ) { grade ="C";} 
		else if ( avg > 60 ) { grade ="D";} 
		else if ( avg > 50 ) { grade ="F";}
		return grade;
	}
	
	void inputData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		name = sc.next() ;
		System.out.print("국어: ");
		scores[0] = sc.nextInt() ;
		System.out.print("영어: ");
		scores[1] = sc.nextInt() ;
		System.out.print("수학: ");
		scores[2] = sc.nextInt() ;
		getMean();
		calcGrade();

	}
	
	void studentInfo() {
		System.out.printf( "%s\t%d\t%d\t%d\t%.2f\t%s\n", 
				name, scores[0],scores[1],scores[2], avg , grade );
	}
	

}
