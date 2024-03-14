package select;

import java.util.Scanner;

public class If04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int p = input.nextInt();
		char t;
		
		if(p >= 90) {
			t = 'A';
		} else if(p >= 80) {
			t = 'B';
		} else if(p >= 70) {
			t = 'C';
		} else if(p >= 60) {
			t = 'D';
		} else {
			t = 'F';
		}
		System.out.println("등급은 " + t + "입니다");
	}

}
