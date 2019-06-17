/* Ansh Verma
 * Period 3 - AP Computer Science
 * 
 * 
 * This program generates a random number
 * It prompts the user for an input and validates it as an int
 * It determines where it is relative to the random number
 * Then it asks for another number until the input provided matches the random number
 * Upon guessing the correct number, the program asks if they wish to play again
 * Plays again until user does not want to play again
 * After the user inputs no, this program prints statistics about the games played 
 * 
 */

import java.util.*;
public class GuessingGame {

	public static void main(String[] args) {
		//initialize the scanner object
		Scanner scanner = new Scanner(System.in);
		//initializes some variables for score tracking
		int totalGames = 1;
		int totalGuesses = 0;
		
		int bestGameGuesses = 0;
		int currentGameGuesses = 0;
		
		//currently the best game is the first game...
		bestGameGuesses = guessGame(scanner);
		totalGuesses += bestGameGuesses;
		
		boolean playAgain = true;
		//runs the code asking if the user wants to play again
		while(playAgain) {
			System.out.println("Play again?");
			int firstChar = scanner.next().toLowerCase().charAt(0);
			if(firstChar == 'y') {
				totalGames++;
				currentGameGuesses += guessGame(scanner);
				if(currentGameGuesses <= bestGameGuesses) {
					bestGameGuesses = currentGameGuesses;
				}
				totalGuesses += currentGameGuesses;
			}
			else {
				playAgain = false;
			}
		}
		
		//close scanner to save memory
		scanner.close();
		
		//prints all the statistics
		System.out.println("Your overall results:");
		System.out.println("Total games = " + totalGames);
		System.out.println("Total guesses = " + totalGuesses);
		System.out.println("Guesses/game = " + (double)((int)(((double)totalGuesses /
															totalGames)*10))/10);
		System.out.println("Best game = " + bestGameGuesses);

	}
	
	public static int guessGame(Scanner scanner) {

		Random rand = new Random();
		System.out.println("I'm thinking of a number between 1 and 100...");
		int currentNum = rand.nextInt(100) + 1; //makes random number
		int guesses = 1; //guesses counter
		int guess = checkInput(scanner); //user input variable
		int previousGuess = 0; //previous guess to see distance
		
		
		while(guess != currentNum) {
			if(guess > currentNum) {
				System.out.println("It's lower.");
			} else if(guess < currentNum) {
				System.out.println("It's higher.");
			} 
			
			//checks if the guess was further away than the previous guess
			if(guesses > 1) {
				if((Math.abs(previousGuess - currentNum) <
					Math.abs(guess - currentNum))) {
					System.out.println("Your guess was further away from the target number");
				}
			}
				
			guesses++;
			previousGuess = guess;
			//prompts for new guess
			guess = checkInput(scanner);
		}
		
		//two different prints because guesses should not be plural if only one guess
		if(guesses == 1) {
			System.out.println("You guessed it in 1 guess!"); 
		} else {
			System.out.println("You guessed it in " + guesses + " guesses!");	
		}
		//returns the number of guesses for use in the statistics
		return guesses;
		
	}
	
	public static int checkInput(Scanner scanner) {
		System.out.println("Your guess?");
		
		//checks if the boolean is an invalid type
		//prompts till correct type is inputed
		while (!scanner.hasNextInt()) {
				scanner.next();
				System.out.println("Your guess was not a whole number between 1 and 100");
				System.out.println("Your guess?");
		}
		
		//takes the input, we already know it is in the correct type
		int guess = scanner.nextInt();
		while(!(guess <= 100 && guess > 0)) {
			System.out.println("Your guess was not a whole number between 1 and 100");
			System.out.println("Your guess?");
			while (!scanner.hasNextInt()) {
				scanner.next();
				System.out.println("Your guess was not a whole number between 1 and 100");
				System.out.println("Your guess?");
			}
			guess = scanner.nextInt();
			
		}
		//returns the proper integer that user guessed
		return guess;
	}

}
