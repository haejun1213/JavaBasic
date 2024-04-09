package chap04;

public class Ex03 {

	public static void main(String[] args) {

		
		
		
	}

}
	class Member {
		
		private String name;
		private String ID;
		private String PW;
		private int age;
		
		
		public Member(String name, String iD, String pW, int age) {
			this.name = name;
			ID = iD;
			PW = pW;
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getID() {
			return ID;
		}
		public void setID(String iD) {
			ID = iD;
		}
		public String getPW() {
			return PW;
		}
		public void setPW(String pW) {
			PW = pW;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		
	}
