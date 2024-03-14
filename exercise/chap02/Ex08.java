package chap02;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int a = num % 10;
		int b = (num/10) % 10;
		int c = (num/100) % 10;
		System.out.println(a+b+c);
	}

}
