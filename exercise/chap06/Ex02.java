package chap06;

public class Ex02 {

	public static void main(String[] args) {
		
		

		Person person = new Person("길동이", 22);
		Student student = new Student("황진이", 23, 100);
		ForeignStudent foreignStudent = new ForeignStudent("Amy", 30, 200, "U.S.A");
		
		Person[] personList = new Person[] { person, student, foreignStudent};
		
		for (Person p : personList) {
			p.show();
		}
	}

}

class Person {
	
	String name;
	int age;
	
	Person(){}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void show() {
		System.out.printf("사람[이름 : %s, 나이 : %d]\n", name, age);
	}
}

class Student extends Person {
	
	int num;
	
	Student(String name, int age, int num){
		super(name, age);
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public void show() {
		System.out.printf("학생[이름 : %s, 나이 : %d, 학번 : %d]\n", name, age, num);
	}
	
}

class ForeignStudent extends Student {

	String from;
	
	ForeignStudent(String name, int age, int num, String from) {
		super(name, age, num);
		this.from = from;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}
	
	public void show() {
		System.out.printf("외국학생[이름 : %s, 나이 : %d, 학번 : %d, 국적 : %s]\n", name, age, num, from);
	}
	
}