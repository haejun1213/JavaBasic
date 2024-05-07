package chap07;

public class Ex02 {

	public static void main(String[] args) {
		//
	}

}

interface Delicious extends Edible, Sweetable {
	
}

interface Edible {
	void eat();
}

interface Sweetable{
	void sweet();
}