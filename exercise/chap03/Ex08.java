package chap03;

public class Ex08 {

	public static void main(String[] args) {
		System.out.println(factorial(5));
	}

	public static int factorial(int n) {
		int res = 1;
		while (n > 0) {
			switch (n) {
			case 0: break;
			default: res *= n--;
			}
		}
		return res;
	}

}
