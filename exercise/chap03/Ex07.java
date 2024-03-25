package chap03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		String c = input("철수");
		String y = input("영희");
		whoWin(c,y);
	}

	public static String input(String string) {
		Scanner sc = new Scanner(System.in);
		System.out.print(string +" : ");
		return sc.nextLine();
	}
	
	public static void whoWin(String c, String y) {

		if(c.equals("r")) {
			if(y.equals("r")) {
				System.out.println("무승부");
			} else if (y.equals("s")) {
				System.out.println("철수, 승!");
			} else if (y.equals("p")) {
				System.out.println("영희, 승!");
			}
		} else if(c.equals("s")) {
			if(y.equals("s")) {
				System.out.println("무승부");
			} else if (y.equals("p")) {
				System.out.println("철수, 승!");
			} else if (y.equals("r")) {
				System.out.println("영희, 승!");
			}
		}else if(c.equals("p")) {
			if(y.equals("p")) {
				System.out.println("무승부");
			} else if (y.equals("r")) {
				System.out.println("철수, 승!");
			} else if (y.equals("s")) {
				System.out.println("영희, 승!");
			}
		}
		
		
	}

}
