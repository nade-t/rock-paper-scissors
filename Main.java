import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean rematch = true;
		
		do {
			Game rps = new Game();
			rps.playGame();
			Scanner playAgain = new Scanner(System.in);
			System.out.println("The computer is preparing for a rematch");
			System.out.print("Do you want to play again? y/n ");
			char goAgain = playAgain.next().charAt(0);
			if ((goAgain == 'n') || (goAgain == 'N')) {
				rematch = false;
			}
			
		} while (rematch);	
	}

}
