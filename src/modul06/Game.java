package modul06;

public class Game {
	private Player player1;
	private Player player2;
	
	public Game() {
		player1 = new Player();
		player2 = new Player();
	}

	public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}
	
	public void hitungPayoff() {
		if(player1.getStrategi() == 0) {
			if(player2.getStrategi() == 0) {
				player1.setSkor(8);
				player2.setSkor(8);
			} else {
				player1.setSkor(4);
				player2.setSkor(10);
			}
		} else {//player1.getStrategi() == 1
			if(player2.getStrategi() == 0) {
				player1.setSkor(10);
				player2.setSkor(4);
			} else {
				player1.setSkor(6);
				player2.setSkor(6);
			}
		}
	}
}
