package chap03;

public class Ex05 {

	public static void main(String[] args) {
		
		
		
		for(int a = 1; a < 20 ; a++) {
			for (int b = a; b < 20 ; b++) {
				for (int c = b; c < 20 ; c++) {
					if(a*a + b*b == c*c) {
						System.out.println(a + " " + b + " " + c);
				
					}
				}
			}
		}
		
		
	}

}
