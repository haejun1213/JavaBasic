package chap06;

public class challEx02 {

	public static void main(String[] args) {

		Girl2 g1 = new Girl2();
		Girl2 g2 = new GoodGirl2();
		GoodGirl2 gg = new BestGirl2();
		
		g1.show();
		g2.show();
		gg.show();
	}

}

class Girl2 {

	private String name;

	Girl2(String name) {

	}
	

	Girl2() {}

	void show() {
		System.out.println("그녀는 자바 초보다");
	}

}

class GoodGirl2 extends Girl2 {


	void show() {
		System.out.println("그녀는 자바를 잘 안다");
	}
}

class BestGirl2 extends GoodGirl2 {

	void show() {
		System.out.println("그녀는 자바를 무지하게 잘 안다");
	}
}