package classtest;

public class Circle1 {
	
	double radius;
	private final double PI = 3.14;
	
	double getArea() {
		return PI * radius * radius; 
	}
	void show(double area) {
		System.out.printf("반지름 = %.2f, 면적 = %.2f\n", radius, area);
		
	} 
	
}
