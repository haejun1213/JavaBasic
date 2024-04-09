package chap04;

public class Ex01 {

	public static void main(String[] args) {

		Triangle1 t = new Triangle1(10.0, 5.0);
		System.out.print(t.findArea());
		
		
	}

}

	class Triangle1 {
		
		private double l;
		private double h;
		private double area;
		
		Triangle1(double d, double e){
			
			this.l = d;
			this.h = e;
			
		}
		public double findArea(){
			this.area = l * h / 2;
			return area;
		}
		
		
		
	}