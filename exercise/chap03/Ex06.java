package chap03;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("철수 : ");
		String rsp1 = sc.nextLine();
		System.out.print("영희 : ");
		String rsp2 = sc.nextLine();
		
		if(rsp1.equals("s") && rsp2.equals("r")) {
			System.out.println("영희, 승!");
		} else if(rsp1.equals("s") && rsp2.equals("s")) {
			System.out.println("무승부");
		} else if(rsp1.equals("s") && rsp2.equals("p")) {
			System.out.println("철수, 승!");
		} else if(rsp1.equals("r") && rsp2.equals("r")) {
			System.out.println("무승부");
		} else if(rsp1.equals("r") && rsp2.equals("s")) {
			System.out.println("철수, 승!");
		} else if(rsp1.equals("r") && rsp2.equals("p")) {
			System.out.println("영희, 승!");
		} else if(rsp1.equals("p") && rsp2.equals("r")) {
			System.out.println("철수, 승!");
		} else if(rsp1.equals("p") && rsp2.equals("s")) {
			System.out.println("영희, 승!");
		} else if(rsp1.equals("p") && rsp2.equals("p")) {
			System.out.println("무승부");
		}
	}

}
