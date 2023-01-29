package lesson4;

public class Demo5 {


	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			dan(i);
			System.out.println();
		}
	}
	
	public static void dan(int num) {
		for (int i = 1; i < 10; i++) {
			System.out.print(num * i + " ");
		}
	}


}
