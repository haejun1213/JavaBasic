package loop;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1;
		int sum = 0;
		sum += num;
		do {
			System.out.print("숫자를 입력해주세요. : ");
			num = sc.nextInt();
			sum += num;
		} while (num != 0);
		System.out.println(sum);

	}

}
