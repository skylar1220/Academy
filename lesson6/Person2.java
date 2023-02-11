package lesson6;

// 접근자, 설정자 지정 단축키 : 마우스 오른쪽 source - generate getters 
public class Person2 {
	
	private int age ;
	private int height, weight ;
	private String name ; 
	private String addr ;
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	} 

	
}
