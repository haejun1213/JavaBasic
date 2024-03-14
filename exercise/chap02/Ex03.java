package chap02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final double pi = 3.14;
		System.out.print("원기둥의 밑면 반지름은?");
		int r = input.nextInt();
		System.out.print("원기둥의 높이는?");
		int h = input.nextInt();
		System.out.println("원기둥의 부피는 " + r*r*pi*h +"입니다.");
	}

}
