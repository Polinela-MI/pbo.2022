package modul06;

public class Player {
	private int strategi;
	private int skor;
	
	public Player() {
		strategi = -1;
		skor = 0;
	}

	public int getStrategi() {
		return strategi;
	}

	public void setStrategi(int strategi) {
		this.strategi = strategi;
	}

	public int getSkor() {
		return skor;
	}

	public void setSkor(int skor) {
		this.skor = skor;
	}
	
	public String toString() {
		if(strategi == 0) {
			return "COOPERATIVE";
		}
		
		return "DEFECTIVE";
	}
	
}
