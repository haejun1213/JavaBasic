package chap03;

public class Ex08 {

	public static void main(String[] args) {
		System.out.println(factorial(5));
	}

	public static int factorial(int n) {
		int res = 1;
		for (int i = 1; i <= n; i++) {
			res *= i;
		}
		return res;
	}

}
