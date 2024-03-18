package loop;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요. : ");
		int num = sc.nextInt();
		int sum = 0;	
		sum += num;
		while(num != 0) {
			System.out.print("숫자를 입력해주세요. : ");
			num = sc.nextInt();
			sum += num;
		}
		System.out.println(sum);

	}



}
