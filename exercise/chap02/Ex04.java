package chap02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("초 단위 정수를 입력하세요 : ");
		int time = input.nextInt();
		int hour = time/3600;
		int min = (time%3600)/60;
		int sec = (time%60)%60;
		System.out.println(hour+ "시간" +min+ "븐" +sec+"초");
	}

}
