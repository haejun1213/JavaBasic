package classtest;

import java.util.Scanner;

public class CircleDemo01 {

	public static void main(String[] args) {
		
		System.out.print("원의 반지름 : ");
		Scanner sc = new Scanner(System.in);
		
		Circle1 circle1 = new Circle1();
		circle1.radius = sc.nextDouble();
		double area = circle1.getArea();
		circle1.show(area);
		
		
		
		
		
		
		
		
		
	}
	
}
