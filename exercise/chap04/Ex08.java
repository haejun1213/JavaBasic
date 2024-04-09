package chap04;

import java.util.Random;

public class Ex08 {

	public static void main(String[] args) {

		Dice d = new Dice();
		System.out.println("주사위 숫자 : " + d.roll());
		
		
	}

}
	class Dice {
		
		public int roll() {
			Random rd = new Random();
			int nun = rd.nextInt(1, 6);
			return nun;
		}
		
		
	}
