package jump;

public class Continue01 {

	public static void main(String[] args) {
		for (int j = 2; j <= 9; j++) {
			if (j == 4 || j == 7) {
				continue;
			}
		for (int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n",j , i, j*i);
			
		}
		}
	}

}
