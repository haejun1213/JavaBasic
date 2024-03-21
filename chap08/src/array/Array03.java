package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array03 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int numStudent = getNumderKeyboard("학생 수 : ");
		int[] scores = getScoresLine(numStudent);
		printSumAverage(scores);
	}

	public static int getNumderKeyboard(String string) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(string);
		return Integer.parseInt(br.readLine()); //학생 수 받기
	}

	public static int[] getScoresLine(int num) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("%d명의 성적 : ", num);
		String inStr = br.readLine();//학생 수 만큼 점수 받기
		StringTokenizer st = new StringTokenizer(inStr, " ");
		int[] scores = new int[num];
		for (int i = 0; i < num; i++) {
			scores[i] = Integer.parseInt(st.nextToken());//문자형으로 받은 점수들을 정수로 배열에 넣기
		}
		return scores;
	}

	public static void printSumAverage(int[] scores) {
		double sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		double average = (double) (sum / scores.length);
		System.out.printf(">> 합계 : %d\n", (int) sum);
		System.out.printf(">> 평균 : %.1f", average);

	}
}
