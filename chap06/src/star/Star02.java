package star;

import java.util.Scanner;

public class Star02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n == 1) {
			System.out.print("*");
		} else
			for (int i = n; i != 0; i--) {
				for (int t = 1; t <= i; t++) {
					System.out.print("*");
				}
				System.out.println();
			}
	}

}
