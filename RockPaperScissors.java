import java.util.*;

// Arthur Xu
// Feb 9th, 2020
// Rock Paper Scissors
// Haven't found out how to do machine learning or anything like that to give the computer an
// advantage, this is solely based off luck and randomness. Will learn how to do that in the future


public class RockPaperScissors {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		print("Welcome to the classic game of Rock Paper Scissors!");
		print("What score would you like to play up to?");
		// Gets the limit or winning score of the game
		int upTo = sc.nextInt();
		
		System.out.println("Perfect! This will be best of " + (upTo*2-1));
		String burner = sc.nextLine();
		
		boolean playing = true;
		// Sets beginning score to 0-0
		int userScore = 0;
		int compScore = 0;
		
		while (playing) {
			print("");
			print("Rock, Paper, or Scissors!");
			Random rand = new Random();
			// Takes in user choice
			String user = sc.nextLine();
			user = user.toLowerCase();
			// Computer randomly chooses R, P, or S
			int comp = rand.nextInt(3)+1; 			
			// Rock = 1; Paper = 2; Scissors = 3;
			
			// Goes through all possible choices and determines the winner accordingly
			if (user.equals("rock") == true) {
				if (comp == 1) {
					print("The computer chooses... ROCK!");
					print("Therefore, a tie!");
				} else if (comp == 2){
					print("The computer chooses... PAPER!");
					print("Therefore, computer wins!");
					compScore += 1;
					print("The score is "+userScore+"-"+compScore+" for you!");
				} else if (comp == 3) {
					print("The computer chooses... SCISSORS!");
					print("Therefore, you win!");
					userScore += 1;
					print("The score is "+userScore+"-"+compScore+" for you!");
				}
			} else if (user.equals("paper") == true) {
				if (comp == 1) {
					print("The computer chooses... ROCK!");
					print("Therefore, you win!");
					userScore += 1;
					print("The score is "+userScore+"-"+compScore+" for you!");
				} else if (comp == 2){
					print("The computer chooses... PAPER!");
					print("Therefore, a tie!");
				} else if  (comp == 3) {
					print("The computer chooses... SCISSORS!");
					print("Therefore, computer wins!");
					compScore += 1;
					print("The score is "+userScore+"-"+compScore+" for you!");
				}
			} else if (user.equals("scissors") == true) {
				if (comp == 1) {
					print("The computer chooses... ROCK!");
					print("Therefore, computer wins!");
					compScore += 1;
					print("The score is "+userScore+"-"+compScore+" for you!");
				} else if (comp == 2){
					print("The computer chooses... PAPER!");
					print("Therefore, you win!");
					userScore += 1;
					print("The score is "+userScore+"-"+compScore+" for you!");
				} else if  (comp == 3) {
					print("The computer chooses... SCISSORS!");
					print("Therefore, a tie!");
				}
			} else {
				print("Invalid input!");
			}
			// Checks if anyone has won yet, and if so, ends the game
			if (userScore == upTo) {
				print("");
				print("You win!");
				print("Final score: "+userScore+"-"+compScore);
				playing = false;			
			} else if (compScore == upTo) {
				print("");
				print("You lose!");
				print("Final score: "+userScore+"-"+compScore);
				playing = false;			
			}
		}
	}

	private static void print(String phrase) {
		
		// Outputs things
		System.out.println(phrase);
		
	}

}
