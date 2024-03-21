package array;

public class Array01 {

	public static void main(String[] args) {
		double[] gradeArr = {90, 70, 80, 79, 82, 50, 70, 90, 89, 89};
		int sum = 0;
		for (int i = 0; i < gradeArr.length; i++) {
			sum +=gradeArr[i];
		}
		double average = (double)(sum / gradeArr.length);
		
		System.out.printf(">> 합계 : %d\n", sum);
		System.out.printf(">> 평균 : %.1f", average);
		
	}

}
