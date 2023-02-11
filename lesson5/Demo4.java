package lesson5;

// switch 
// case : 시작점을 정해주는 

public class Demo4 {

	public static void main(String[] args) {

		int number = 4 ;
		switch (number) {
		case 3: 
			System.out.println("3를 선택했군요");
//			break ;
		case 2: 
			System.out.println("2를 선택했군요");
			break ;
		case 1: 
			System.out.println("1를 선택했군요");
			break ;
		default:
		System.out.println("3 2 1 이 아닌 수를 선택했군요 ");
		}
	}

}
