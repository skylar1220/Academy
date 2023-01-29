package lesson4;

public class Demo4 {

	public static void show(int count, String name) {
		for ( int i = 0 ; i<count ; i++ ) {
		System.out.println(name);
		}
	}
	
	
	public static void main(String[] args) {
		show(5, "안녕!") ;
	}

}
