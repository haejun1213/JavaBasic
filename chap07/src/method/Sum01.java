package method;

import java.util.Scanner;

public class Sum01 {

	public static void main(String[] args) {
		
		int num;
		//숫자가 양수먄 진행
		while ((num = getNumber("양의 숫자를 입력하세요 : ")) > 0) {
			int result = getSum(num);
			printSum(result);
		}
		System.out.println("멈췄습니다.");
	}


	public static int getNumber(String message) {//숫자 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		return sc.nextInt();//입력받은 숫자 num으로 반환
	}

	public static int getSum(int number) {//반환 받은 값 number로 받고 sum 계산
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		return sum;//sum result 반환
		
	}
	
	private static void printSum(int value) {//result 반환 값 받고

		System.out.println(value);//결과 출력
	}
}