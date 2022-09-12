package q1ex2;

import java.util.Scanner;

public class Q1Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Sets up a scanner variable that I can call whenever I need user input

		// Configurable variables
		int minValue = 1;
		int maxValue = 10;
		int range = maxValue - minValue + 1;
		int tries = 3;

		// Continues to loop until "end game" is inputed and the break line and is activated
		while (true) {
			System.out.print("Welcome to Higher or Lower! What will you do? \n"
					+ "-Start game \n"
					+ "-Change settings \n"
					+ "-End application \n");

			String playerGameChoice = sc.nextLine();

			System.out.print("\n");

			if (playerGameChoice.equalsIgnoreCase("start game")) {
				String continueGame;

				// one game is played and then the player is asked if they want to play again
				do {
					int correctValue = (int) Math.floor(Math.random() * range) + minValue; // sets a new random number
																							// every game

					String hint = ""; // Default empty so that the first cycle doesn't have any hints
					String outcomeText = "You lost..."; // Displays if the player wins or losses. Gets updated if the player guesses the correct number

					// System.out.println(correctValue); //For debugging purposes. Or for cheating if you can find this

					for (int i = tries; i > 0; i--) {
						System.out.printf("%s You have %d guess(es) left. What is your guess? ", hint, i);
						int numGuess = Integer.parseInt(sc.nextLine()); // sc.nextInt() causes the next sc.nextLine() to not work. parseInt(sc.nextLine()) makes it more reliable

						if (numGuess == correctValue) {
							outcomeText = "You got it!"; // Updates outcomeText if the correct answer is found
							break; // Ends the game
						} else if (numGuess > correctValue) {
							hint = "Guess lower!";
							continue; // Skips next code to continue to the next guess. Technically useless, but makes the code more readable
						} else if (numGuess < correctValue) {
							hint = "Guess higher!";
							continue; // Skips next code to continue to the next guess. Technically useless, but makes the code more readable
						}
					}

					System.out.println(outcomeText);

					System.out.print("Play again? ");
					continueGame = sc.nextLine();

					System.out.print("\n");
				} while (continueGame.equalsIgnoreCase("y")); // Only loops if the input is y to prevent misinputs from causing problems
			} else if (playerGameChoice.equalsIgnoreCase("change settings")) {
				System.out.print("What is the lower limit of the random number?\n"
						+ "What is the upper limit of the random number\n"
						+ "How many guesses are allowed?\n");

				System.out.print("Lower limit: ");
				minValue = Integer.parseInt(sc.nextLine());
				System.out.print("Upper limit: ");
				maxValue = Integer.parseInt(sc.nextLine());
				System.out.print("Guesses: ");
				tries = Integer.parseInt(sc.nextLine());

				range = maxValue - minValue + 1; // Updates the range variable since limits are changed

				System.out.print("\n");
			} else if (playerGameChoice.equalsIgnoreCase("end application")) {
				System.out.println("Thank you for playing!");
				break; // Ends the infinite loop, ending the game
			} else {
				System.out.println("Please try again");
			}
		}
	}
}
