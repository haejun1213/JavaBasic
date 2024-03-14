package chap02;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("전공 이수 학점 : ");
		int ji = input.nextInt();
		System.out.print("교양 이수 학점 : ");
		int gi = input.nextInt();
		System.out.print("일반 이수 학점 : ");
		int ii = input.nextInt();
		
		if(ji >= 70) {
			if(gi >= 30 && ii >= 30) {
				System.out.println("졸업 가능");
			} else if (gi +ii >= 80) {
			System.out.println("졸업 가능");
		}else {
			System.out.println("졸업 불가능");
		}
	}else {
		System.out.println("졸업 불가능");
	}
	}
	}
