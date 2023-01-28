package lesson1;

public class homework0114 {


	public static void main(String[] args) {
		// 가지고있는 돈이 : 50000원
		// 사과 1200 * 3
		// 바나나 1000 * 2
		// 소고기 12500 *2
		// 총 지불금액 및 잔돈의 총합
		
		// 잔돈  
		// 1000 * ?
		// 5000 * ?
		// 10000 * ?
		// 500 * ?
		// 100 * ?
		
		int total = 50000;
		int app = 1200 * 3;
		int ba = 1000 * 2;
		int beef = 12500 * 2;
		
		int chan = total - ( app + ba + beef );
		System.out.println("총 지불비용: " + total );
		System.out.println("잔돈:" + chan);
		
		int n10000 = chan / 10000;
		int n5000 = ( chan - n10000*10000 ) / 5000 ;
		int n1000 = ( chan - ( n10000*10000) - (n5000*5000 ) ) / 1000 ;
		int n500 = ( chan - ( n10000*10000 ) - (n5000*5000) - ( n1000*1000 ) ) / 500 ;
		int n100 = ( chan - ( n10000*10000 ) - (n5000*5000) - ( n1000*1000 )- (n500*500) ) / 100 ;

		
		System.out.println("만 원:"+n10000);
		System.out.println("오천 원:"+n5000);
		System.out.println("천 원:"+n1000);
		System.out.println("오백 원:"+n500);
		System.out.println("백 원:"+n100);




		

		
		

	}

}