package chap06;

public class Ex01 {

	public static void main(String[] args) {

		Circle circle = new Circle(5);
		ColoredCircle colorCircle = new ColoredCircle(10, "빨간색");
		
		circle.show();
		colorCircle.show();
	}

}

class Circle {
	
	int radius;
	
	Circle(int radius){
		
		this.radius = radius;
		
	}
	
	void show() {
		System.out.printf("반지름이 %d인 원이다.\n", radius);
	}
	
}

class ColoredCircle extends Circle {
	
	String color;
	
	ColoredCircle(int radius, String color) {
		super(radius);
		this.color = color;
	}
	
	void show() {
		System.out.printf("반지름이 %d인 %s 원이다.\n", radius, color);
	}
}