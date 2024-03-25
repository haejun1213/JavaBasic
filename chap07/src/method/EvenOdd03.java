package method;

import java.util.Scanner;

public class EvenOdd03 {
	
	public static String decideEvenOdd(int number) { //홀짝 구분

		if (number % 2 == 0) {
			return ">>짝수입니다.";
		} else {
			return ">>홀수입니다.";
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = 1;
		while (b != 0) {

			System.out.print("숫자를 입력하세요 : ");
			int number = sc.nextInt();

			String result = decideEvenOdd(number);
			System.out.println(result);

			System.out.print("계속 하시겠습니까? (0-멈춤/1-계속) : ");
			b = sc.nextInt();
		}
		
		System.out.println("멈췄습니다.");
	}
}