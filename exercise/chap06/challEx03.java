package chap06;

public class challEx03 {

	public static void main(String[] args) {
		Girl3[] girls = {new Girl3("갑순이"),
		new GoodGirl3("콩쥐"),
		new BestGirl3("황진이")
		};

		for (Girl3 g : girls) {
			g.show();
		}
	}

}

class Girl3 {

	protected String name;

	Girl3(String name) {

	}
	
	void show() {
		System.out.println("그녀는 자바 초보다");
	}

}

class GoodGirl3 extends Girl3 {


	GoodGirl3(String name) {
		super(name);
	}

	void show() {
		System.out.println("그녀는 자바를 잘 안다");
	}
}

class BestGirl3 extends GoodGirl3 {

	BestGirl3(String name) {
		super(name);
	}

	void show() {
		System.out.println("그녀는 자바를 무지하게 잘 안다");
	}
}