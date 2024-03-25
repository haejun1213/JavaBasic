package string;

public class Example01 {

	public static void main(String[] args) {
		String s1 = "문자열";
		String s2 = "문자열";
		
		String s3 = new String("문자열");
		String s4 = new String("문자열");
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
	}

}
