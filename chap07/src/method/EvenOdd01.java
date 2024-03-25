package method;

import java.util.Scanner;

public class EvenOdd01 {

	public static void decideEvenOdd() {
		System.out.print("숫자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println(">>짝수입니다.");
		} else {
			System.out.println(">>홀수입니다.");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = 1;
		while (b != 0) {

			decideEvenOdd();

			System.out.print("계속 하시겠습니까? (0-멈춤/1-계속) : ");
			b = sc.nextInt();
		}
		System.out.println("멈췄습니다.");
	}
}