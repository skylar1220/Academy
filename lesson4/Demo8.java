package lesson4;

import java.util.Iterator;
import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		// 국영수로 입력값을 받음
		int[] score = new int[3];
		for (int i = 0; i < score.length; i++) {
			score[i] = getDataFromConsole();
		}
		// 여기까지... 배열에 각 요소에 데이터가 들어있음.
		int total = 0 ;
		double avge = 0.0 ;
		for (int i = 0; i < score.length; i++) {
			total += score[i] ;
		}
		avge = (double) total / score.length ; // double 타입 캐스팅!! 기억하기!!
		System.out.println("t: " + total );
		System.out.println("a: " + avge );

	}
	
	// 2. 데이터 입력받기 (정수형) -> int
	public static int getDataFromConsole() {
		Scanner sc = new Scanner(System.in) ;
		System.out.print("점수를 입력하세요: ");
		int number1 = sc.nextInt() ;
		return number1 ;
	}
}

