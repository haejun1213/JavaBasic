package select;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int a = input.nextInt();
		
		if(a > 0) {
			System.out.println("양수입니다.");
		} else if(a == 0) {
			System.out.println("0입니다.");
		} else {
			System.out.println("음수입니다.");
		}
	}

}
