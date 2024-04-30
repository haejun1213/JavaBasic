package chap06;

public class Ex06 {

	public static void main(String[] args) {

		Car c = new Car("파랑", 200, 1000, 5);
		c.show();
		
		System.out.println();
		Vehicle v = (Vehicle)c;
		v.show();
		
	}

}

class Vehicle {

	String color;
	int speed;

	public Vehicle(String color, int speed) {

		this.color = color;
		this.speed = speed;
	}

	
	void show() {
		System.out.println("자종차 색상 : " + color + "\n자동차 속도 : " + speed);
	}

}

class Car extends Vehicle {

	int displacement;
	int gear;

	public Car(String color, int speed, int displacement, int gear) {

		super(color, speed);
		this.displacement = displacement;
		this.gear = gear;
	}
	
	@Override
	void show() {
		System.out.println("자종차 색상 : " + color + "\n자동차 속도 : " + speed + "\n자동차 배기량 : " + displacement + "\n자동차 기어 단수 : " + gear);
	}

}