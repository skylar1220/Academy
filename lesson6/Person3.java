package lesson6;

// 생성자 단축키 : 오른쪽 - source - constructor by field

public class Person3 {

	private int age ;
	private int height ,weight ; 
	private String name ;
	
	// 생략되어 있다. 생성자... 매개변수가 없는 --> 기본생성자 -> 객체를 만들어준다.. -> 흐름상.. 생성자 호출 뒤에  
	// 시스템에서 알아서 객체를 생성해준다.
	// 생성자는 리턴 타입을 기술하지 않는다.
	// 왜? special 해서
	
	
	public Person3() {
	this (1,1,1,null); 
	// 아래의 매개변수 생성자를 갖고오는 것 = 매개변수 생성자를 통해 스페셜한 일을 하는 것 (생성자 위임)
	}  
	
	// 매개변수 생성자
	public Person3(int age, int height, int weight, String name) {
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.name = name;
	}
	
	
}
