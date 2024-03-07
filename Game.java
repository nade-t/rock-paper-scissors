import java.util.Scanner;

public class Game {

	int playerScore;
	int computerScore;
	int rounds = 1;
	int playerChoice;
	int computerChoice;
	String winner;
	boolean gameOver = false;
	
	String[] moves =  {"rock", "paper", "scissors"};
	
	public void playGame() {
		
		System.out.println("#####  Game Start  #####");
		Scanner playerMove = new Scanner(System.in);
		
		
		do{
			//game will run until either the player or computer scores 3 points
			System.out.println("Round " + rounds);
			System.out.print("Choose your move. Enter 0 for rock, 1 for paper, 2 for scissors");
			playerChoice = playerMove.nextInt();
			computerChoice = (int) (Math.random() * 3);
			System.out.println("Player chose " + moves[playerChoice] + "\tComputer chose " + moves[computerChoice]);
			checkWinner(playerChoice, computerChoice);
			System.out.println("Winner: " + winner);
			System.out.println("Current scores: Player - " + playerScore + "\tComputer - " + computerScore);
			rounds++;
			
			if ((playerScore == 3) || (computerScore == 3)) {
				gameOver = true;
			}
		} while (!gameOver);
		
		
		if (playerScore > computerScore) {
			System.out.println("Congratulations, you beat the computer! Total rounds: " + rounds);
		} else {
			System.out.println("Game over! The computer has won - better luck next time! Total rounds: " + rounds);
		}
	}
	
	public String checkWinner(int player, int computer) {
		
		if (player == computer) {
			winner = "draw";
		} else if ((player == 0 && computer == 1) || (player == 1 && computer == 2) || (player == 2 && computer == 0)) {
			//check conditions for computer win
			winner = "Computer";
			computerScore++;
		} else {
			//return player win
			winner = "Player";
			playerScore++;
		}
		
		
		return winner;
	}
}



