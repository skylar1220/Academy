package lesson6;
/*
 * 그렇다면 getter, setter를 불편하게 지정해줘야하는데 왜 private을 쓸까?
 * 클래스의 95% 이상은 멤버 변수를 만들 때 캡슐화 한다... private
 */

public class Person {
	
	private int age ;
	
	
	void setAge(int age) { // 설정자 set
		this.age = age ; 
	}
	
	int getAge() { // 접근자 get
		return age ; 
	}

}
