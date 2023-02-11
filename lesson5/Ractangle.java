package lesson5;

/*
 * 독립클래스 명 : Ractangle
 * 필드
 * 메소드
 */

public class Ractangle {
	int width ;
	int height ;
	int findArea() {
		return width * height ;
	}
	void show() {
		System.out.printf("가로는 %d 세로는 %d 사각형의 넓이는 %d", width, height, findArea());
	}

}
