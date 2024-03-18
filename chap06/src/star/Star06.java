package star;

import java.util.Scanner;

public class Star06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = num; i != 0; i--) {
			for(int t = 0; t < num - i; t++) {
				System.out.print(" ");
			}
				for(int j = 2; j <= i*2; j++) {
					System.out.print("*");

			}System.out.println();
		}
	
	}
}

