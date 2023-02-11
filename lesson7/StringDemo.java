package lesson7;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = "Hi java!"; // hi 얘는 상수 같은 애라 어차피 같은 값이라 같은 주소에 s1과 s2를 넣어준다 = s1과 s2는 같은 주소를 갖는다
		String s2 = "Hi java!";
		s2 = "abc"; 
		

		String s3 = new String("Hi java!"); // s3, s4는 각각의 독립된 주소를 가짐
		String s4 = new String("Hi java!");
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(" s1 == s2 : " +  ( s1 == s2 ) );

		System.out.println(" s3 == s4 : " +  ( s3 == s4 ) );
		
		System.out.println(" s1 == s3 : " +  ( s1 == s3 ) ); // true
		

		System.out.println(s4);
		
		System.out.println();

	}

}
