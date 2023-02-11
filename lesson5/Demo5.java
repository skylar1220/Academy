package lesson5;

//switch 
//이렇게 많이 쓰는 버전

public class Demo5 {

	public static void main(String[] args) {
		whoIsIt("호랑이");
		whoIsIt("참새");
		whoIsIt("고등어");
		whoIsIt("곰팡이");


	}
	

	public static void whoIsIt(String bio) {
		String kind = "";
		switch (bio) {
			case "호랑이":
			case "사자":
				kind = "표유류";
				break;
			// 이렇게 , 로 한 줄로 써줄 수 있음
			case "참새" , "독수리":
				kind = "조류";
				break;
			case "고등어" , "연어":
				kind = "어류";
				break;
			default:
				System.out.println("ooops!....");
				kind = "...";
				break;
		}
		System.out.printf("%s는 %s이다\n", bio, kind);
	}
}
