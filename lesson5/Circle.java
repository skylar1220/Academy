package lesson5;

public class Circle {
	double radius ;
	double findArea(){
		return 3.14 * radius * radius ;
	}
//	double area = findArea(); 
	// 이렇게 했을 때 자꾸 오류 나는 이유?
	
	void show() {
		System.out.printf("반지름은 %f이고 넓이는 %f입니다.", radius, findArea());
	}

}
