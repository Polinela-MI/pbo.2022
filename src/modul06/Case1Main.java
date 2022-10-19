package modul06;

import java.util.Random;
import java.util.Scanner;


public class Case1Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int playAgain = 0;
		int menuChoice = 0;
		
		do {
			System.out.println("1. Random game");
			System.out.println("2. Player 1 vs Random");
			System.out.println("3. Player 1 vs Player 2");
			System.out.println("0. Exit");
			System.out.println("Choose your game: ");
			
			menuChoice = scanner.nextInt();
			Game game;
			Random random = new Random();
			switch (menuChoice) {
			case 1://random
				System.out.println("Playing game...");
				game = new Game();
				game.getPlayer1().setStrategi(random.nextInt(2));
				game.getPlayer2().setStrategi(random.nextInt(2));
				game.hitungPayoff();
				
				System.out.println("Player 1 choose to: " + game.getPlayer1().toString());
				System.out.println("Player 2 choose to: " + game.getPlayer2().toString());
				System.out.println("Player1: " + game.getPlayer1().getSkor() + " - "+
				"Player2: " + game.getPlayer2().getSkor());
				break;
				
			case 2://player1 vs random
				System.out.println("Your strategy:");
				int strategi = scanner.nextInt();
				
				System.out.println("Playing game...");
				game = new Game();
				game.getPlayer1().setStrategi(2);
				game.getPlayer2().setStrategi(random.nextInt(2));
				game.hitungPayoff();
				
				System.out.println("Player 1 choose to: " + game.getPlayer1().toString());
				System.out.println("Player 2 choose to: " + game.getPlayer2().toString());
				System.out.println("Player1: " + game.getPlayer1().getSkor() + " - "+
				"Player2: " + game.getPlayer2().getSkor());
				break;
				
			case 3:
				System.out.println("Player 1's strategy:");
				int strategi1 = scanner.nextInt();
				System.out.println("Player 2's strategy:");
				int strategi2 = scanner.nextInt();
				
				System.out.println("Playing game...");
				game = new Game();
				game.getPlayer1().setStrategi(strategi1);
				game.getPlayer2().setStrategi(strategi2);
				game.hitungPayoff();
				
				System.out.println("Player 1 choose to: " + game.getPlayer1().toString());
				System.out.println("Player 2 choose to: " + game.getPlayer2().toString());
				System.out.println("Player1: " + game.getPlayer1().getSkor() + " - "+
				"Player2: " + game.getPlayer2().getSkor());
				break;
	
			}
			
		} while(playAgain != 0 || menuChoice != 0);
		
		System.out.println("See you again");
	}
}
