package loop;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		System.out.println("[구구단 " + num +"단]");
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + num*i);
		}
	}

}
