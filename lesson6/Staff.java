package lesson6;

public class Staff {
	// 변수: name, age
	// 메소드 : sayHello 리턴타입 없고 내용 없는
	
	private String name;
	private int age, height, weight ; 
	
	public String getName() {
		return name;
	}
	
	// 메소드 체이닝을 위한 준비도 해보자 
	public Staff setName(String name) { // 1. 오잉? void, int 자리에 Staff를 넣고?
		this.name = name;
		return this;  // 2. 그리고 자기 자신을 리턴? -- 원래 버전과 다르게 장점 바꾸길, 추가하길 원하는 값만 설정해놓고 나머지는 비워놔도 되기 때문
	}
	public int getAge() {
		return age;
	}
	public Staff setAge(int age) {
		this.age = age;
		return this; 
	}


	
	public Staff() {
		
	}
	
	

	
	void sayHello() {
		System.out.printf("안녕 나는 %s이고 %d살이야. 반가워!\n", getName(), getAge() );
	}

}
