
package lesson5;
//switch 
// 잘 안쓰는 버전
public class Demo8 {

	public static void main(String[] args) {
		whoIsIt("호랑이");
		whoIsIt("참새");
		whoIsIt("고등어");
		whoIsIt("곰팡이");


	}
	
	// demo5를 이렇게 -> 를 써서 한 줄로 쓸 수도 있
	public static void whoIsIt(String bio) {
		String kind = switch (bio) {
			case "호랑이", "사자" -> "표유류";
			case "참새" , "독수리" ->  "조류" ;
			case "고등어" , "연어"  ->  "어류";
			default -> {
				System.out.println("ooops!....");
				yield "..." ; // 위 출력을 먼저 하고 양보하고 뒤에 걸 하겠다.
		}
			
		};
		System.out.printf("%s는 %s이다\n", bio, kind);
	}
}
xxx