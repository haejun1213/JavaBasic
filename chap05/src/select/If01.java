package select;

import java.util.Scanner;

public class If01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("세개의 숫자를 입력하세요.");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int max  = a;
		
		if(max < b) {
			max = b;//b 조사
		}
		if(max < c) {
			max = c;//c 조사
		}
		System.out.println("가장 큰 수는" + max + "입니다");
		
		
	}

}
