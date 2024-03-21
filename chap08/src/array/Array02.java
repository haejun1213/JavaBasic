package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array02 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("학생 수 : ");
		int student = Integer.parseInt(br.readLine());
		
		System.out.printf("%d명의 성적 : ", student);
		String inStr = br.readLine();
		
		StringTokenizer st = new StringTokenizer(inStr, " ");
		
		int[] scores = new int[student];
		
		for (int i = 0; i < student; i++) {
			scores[i] =Integer.parseInt(st.nextToken());
		}
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		double average = (double)(sum / scores.length);
		System.out.printf(">> 합계 : %d\n", sum);
		System.out.printf(">> 평균 : %.1f", average);
	}

}
