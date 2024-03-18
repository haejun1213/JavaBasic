package star;

import java.util.Scanner;

public class Star04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = num; i >= 0; i--) {
			
			for(int t = 0; t < num - i; t++) {
				System.out.print(" ");
			}
			for(int j = i; j > 0; j--) {
				System.out.print("*");
			}System.out.println();
			
			}
		}
	}

