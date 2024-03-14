package select;

import java.util.Scanner;

public class StringConv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("세 개의 숫자를 입력하세요 : ");
		
		int a = Integer.parseInt(input.next());
		int b = Integer.parseInt(input.next());
		int c = Integer.parseInt(input.next());
		
		if(a < b) {
			a = b;
		}
		if(a < c) {
			a = c;
		}
		System.out.println(a);
	}

}
