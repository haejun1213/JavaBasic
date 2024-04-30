package chap06;

public class Ex03 {

	public static void main(String[] args) {
		Point point = new Point(10, 5);
		
		MovablePoint movablePoint = new MovablePoint(10, 5, 10, 6);
		
		System.out.println(point.toString());
		System.out.println(movablePoint.toString());
	}

}

class Point {
	private int x;
	private int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}

class MovablePoint extends Point {
	
	private int xSpeed;
	private int ySpeed;
	
	
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	public int getxSpeed() {
		return xSpeed;
	}
	
	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}
	
	public int getySpeed() {
		return ySpeed;
	}
	
	public void setySpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}

	@Override
	public String toString() {
		return "MovablePoint [xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
	}
	
	
}
