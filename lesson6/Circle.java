package lesson6;


public class Circle {
	private String color ;
	private double radius ; 
	
	
	public String getColor() {
		return color;
	}

	public Circle setColor(String color) {
		this.color = color;
		return this;
	}

	public double getRadius() {
		return radius;
	}

	public Circle setRadius(double radius) {
		this.radius = radius;
		return this;
	}
	
	
	
	public Circle() {
		
	}
	
	void show() {
		System.out.printf("원의 색깔은 %s색, 반지름은 %.2f 입니다!\n", color, radius);
	}
	

}
