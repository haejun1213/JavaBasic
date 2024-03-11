package scanner;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("정수을 입력하세요 : ");
		int intNum  = input.nextInt();
		System.out.print("실수을 입력하세요 : ");
		double doubleNum  = input.nextDouble();
		
		System.out.println(intNum + "+" + doubleNum + "=" + (intNum + doubleNum));
		System.out.println(intNum + "-" + doubleNum + "=" + (intNum - doubleNum));
		System.out.println(intNum + "*" + doubleNum + "=" + (intNum * doubleNum));
		System.out.println(intNum + "/" + doubleNum + "=" + (intNum / doubleNum));
	
	}

}
