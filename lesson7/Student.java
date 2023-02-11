package lesson7;

public class Student {
	//  변수
	private String name ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override // 오?? 새로운 방식!
	public String toString() {
		return "Student [name=" + name + "]";
	} 
}
	
	
	// 메소드

	
