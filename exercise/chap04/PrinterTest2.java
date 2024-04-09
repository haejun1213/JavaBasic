package chap04;

public class PrinterTest2 {

	public static void main(String[] args) {
		Printer2 p = new Printer2(10);
		p.print(2);
		p.print(20);
		p.print(10);

	}

}

class Printer2 {

	private int numOfPapers;

	Printer2(int numOfPapers) {

		this.numOfPapers = numOfPapers;

	}

	void print(int amount) {
		if (numOfPapers == 0) {
			System.out.printf("용지가 없습니다.");
		} else if (numOfPapers >= amount) {
			this.numOfPapers -= amount;
			System.out.printf("%d장 출력했습니다. 현재 %d장 남았습니다.\n", amount, numOfPapers);
		} else if (numOfPapers < amount) {
			System.out.printf("모두 출력하려면 %d매 부족합니다. %d장만 출력합니다.\n", amount - numOfPapers, numOfPapers);
			this.numOfPapers = 0;
		}
	}

}
