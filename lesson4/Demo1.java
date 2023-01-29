package lesson4;

public class Demo1 {

	public static void main(String[] args) {
		// 순환문을 이용해서 1~ 10 까지의 합
		int sum1 = 0 ;
		for ( int i = 1 ;  i < 11 ; i++ ) {
			sum1 += i;
		}
		System.out.println(" 1~ 10 합계는: " + sum1 );
		
		// 순환문을 이용해서 10 ~100 까지의 합
		int sum2 = 0 ;
		for ( int i = 10 ;  i < 101 ; i++ ) {
			sum2 += i;
		}
		System.out.println(" 10~ 100 합계는: " + sum2 );
		
		// 순환문을 이용해서 100 ~1000 까지의 합
		int sum3 = 0 ;
		for ( int i = 100 ;  i < 1001 ; i++ ) {
			sum3 += i;
		}
		System.out.println(" 100~ 1000 합계는: " + sum3 );
		
	}

}
