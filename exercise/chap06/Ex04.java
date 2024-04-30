package chap06;

public class Ex04 {

	public static void main(String[] args) {

		Parent p = new Child();
		System.out.println(p.name);
		p.print();
		
		
	}

}

class Parent {
	
	String name = "영조";
	
	
	void print() {
		System.out.printf("나는 %s이다.\n", name);
	}
}

class Child extends Parent {
	
	String name = "사도세자";

	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.printf("나는 %s이다.\n", name);
	}

	
}