package chap04;

public class PrinterDemo {

	public static void main(String[] args) {
		
		Printer3 p = new Printer3(20, true);
		p.print(25);
		p.setDuplex(false);
		p.print(10);
		
		
		
	}

}

	class Printer3{
		
		private int numOfPapers;
		private boolean duplex;
		
		public Printer3(int numOfPapers, boolean duplex) {
			this.numOfPapers = numOfPapers;
			this.duplex = duplex;
			
		}
		public void print(int amount) {
			if(getDuplex()) {
				if (numOfPapers == 0) {
					System.out.printf("용지가 없습니다.");
				} else if (numOfPapers >= amount/2) {
					this.numOfPapers -= (amount % 2 == 0) ? amount / 2 : amount / 2 + 1;
					System.out.printf("양면으로 %d장 출력했습니다. 현재 %d장 남았습니다.\n", (amount % 2 == 0) ? amount / 2 : amount / 2 + 1, numOfPapers);
				} else if (numOfPapers < amount/2) {
					System.out.printf("모두 출력하려면 %d매 부족합니다. %d장만 출력합니다.\n", (amount % 2 == 0) ? amount / 2 : amount / 2 + 1 - numOfPapers, numOfPapers);
					this.numOfPapers = 0;
				}
				
			} else {
			if (numOfPapers == 0) {
				System.out.printf("용지가 없습니다.");
			} else if (numOfPapers >= amount) {
				this.numOfPapers -= amount;
				System.out.printf("단면으로 %d장 출력했습니다. 현재 %d장 남았습니다.\n", amount, numOfPapers);
			} else if (numOfPapers < amount) {
				System.out.printf("단면으로 모두 출력하려면 %d매 부족합니다. %d장만 출력합니다.\n", amount - numOfPapers, numOfPapers);
				this.numOfPapers = 0;
			}
			}
			
		}
		public boolean getDuplex() {
			return this.duplex;
			
		}
		public void setDuplex(boolean duplex) {
			this.duplex = duplex;
		}
		
		
	}
	
	
	
//amount = (amount % 2 == 0) ? amount / 2 : amount / 2 + 1
//도전과제 3
//프로그래밍 1 2 3 8