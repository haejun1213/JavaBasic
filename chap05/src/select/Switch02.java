package select;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("등급을 입력하세요 : ");
		String t = input.nextLine();
		
		switch (t) {
		case "A":
			System.out.println("아주 열심히 하셨군요~~~!!!");
			break;
		case "B":
			System.out.println("아주 열심히 하셨군요~~~!!");
			break;
		case "C":
			System.out.println("남들만큼 하셨네요~~");
			break;
		case "D":
			System.out.println("조금 더 노력이 필요합니다.");
			break;
		case "F":
			System.out.println("교무실로 찾아오세요");
		}
	}

}
