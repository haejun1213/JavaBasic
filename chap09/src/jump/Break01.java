package jump;

import java.util.Scanner;

public class Break01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;    
		while (true) {
			System.out.print("양의 숫자를 입력해주세요 : ");
			n = sc.nextInt();
			
			if (n > 0) {
				break;	
			}
			System.out.println("0보다 큰 숫자를 입력하세요.");
			
		}
		
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.printf("1부터 %d 까지의 합 : %d", n, sum);
		
		
	}

}
