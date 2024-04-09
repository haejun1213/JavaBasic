package chap04;

public class Ex02 {

	public static void main(String[] args) {

		Triangle t1 = new Triangle(10.0, 5.0);
		Triangle t2 = new Triangle(5.0, 10.0);
		Triangle t3 = new Triangle(8.0, 8.0);

		System.out.println(t1.isSameArea(t2));
		System.out.println(t1.isSameArea(t3));
	}

}

	class Triangle {
		
		private double l;
		private double h;
		
		public Triangle(double l, double h) {
			this.l = l;
			this.h = h;
		}
		
		public double findArea() {
			return l * h / 2;
		}
		
		public boolean isSameArea(Triangle t) {
			
			return t.findArea() == findArea();
		}
}