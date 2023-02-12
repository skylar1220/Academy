package lesson8;

class Gender{
	// 여, 남
	public static final String MALE = "male" ; // 상수는 대문자로 표시, 바꾸지 않는 상수여야하니까 final 
	public static final String FEMALE = "female" ; // 어차피 모두가 다같이 보고 써야하니까 static 

}

// 요즘 방식: 위와 똑같은 기능
enum GenderE{ M, F }


public class Enum1 {

	public static void main(String[] args) {
		System.out.println(Gender.MALE);
		System.out.println(Gender.FEMALE);
		System.out.println(GenderE.F);
		
		GenderE a = GenderE.F;
		
		switch (a) {
		case F:
			break;
		case M :
			break;
		}
		default:
			System.out.println(GenderE.F);
		}
	}


