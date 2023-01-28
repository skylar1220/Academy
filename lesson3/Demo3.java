/* 다중 if 문
90 이상 a
80-89 b
70-79 c
60-69 d
-59 f
*/

package lesson3;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		System.out.print("정수를 입력하세요: ");
		Scanner sc = new Scanner (System.in) ;
		
		int score = sc.nextInt() ;
		
		if (score >= 90 ) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70 ) {
			System.out.println("C");
		} else if (score >= 60  ) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		}

}

/*

if  ( id == inputid ) {
	if ( pw = inputpw )
	"로그인 성공"
	else ( )   -- pw 틀린 경우
	"비밀번호 확인"
	}
else {
"아이디 확인하세요"
}

 */

/*

if  ( id == inputid && pw = inputpw )
"로그인 성공"
else if ( id == inputid )
"비밀번호 확인"
else (  ) -- id 틀린 경우
"아이디 확인하세요"


 */