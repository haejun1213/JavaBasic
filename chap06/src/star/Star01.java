package star;

import java.util.Scanner;

public class Star01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n == 1) {
			System.out.print("*");
		} else
			for (int i = 1; i <= n; i++) {
				for (int t = 1; t <= i; t++) {
					System.out.print("*");
				}
				System.out.println();
			}
	}

}
