/*
 * while 순환문과
 * System.out.print 명령어를 이요해서 아래와 같이 출력
 * 1234
 */

package lesson3;

public class Demo6 {

	public static void main(String[] args) {
		
		int i = 1 ;
		while ( i < 5 ) {
			System.out.print(i); // System.out.print(i++); 또는 한방에 이렇게도 됨
			i++ ;
		}
	}

}
