package chap02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("화씨온도를 입력해주세요 : ");
		double f = input.nextDouble();
		double a = (double)5/9;
		System.out.println(a*(f-32) + "C");
		
	}

}
