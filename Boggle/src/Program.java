import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Boggle, by Ansh Verma. \n");

		System.out.println("What is the size of the board?");
		int size = scanner.nextInt();
		scanner.close();
		WordList list = new WordList("WordList.txt", 3, 8);
		Board board = new Board(list, size);
		double startTime = System.currentTimeMillis();
		// add a line breaks
		System.out.println("\n");
		// uses the board's toString()
		System.out.println(board);
		// calls my recursive method
		ArrayList<String> foundWords = board.find();

		// sorts the returned ArrayList using my WordComparator
		Collections.sort(foundWords, new WordComparator());

		// shows amount of words
		System.out.println("Found " + (foundWords.size()) + " word(s) \n");

		// don't print any words if no words were found
		if (foundWords.size() != 0) {
			int index = 0;
			// start at the largest word size
			// since we already sorted, the largest is the first word
			int wordSize = foundWords.get(index).length();

			// we don't want to walk off the edge of the array
			while (index < foundWords.size()) {
				// we don't want to walk off the edge while looping
				// we also don't want to put words with smaller lengths
				// in the wrong category
				while (index < foundWords.size() && foundWords.get(index).length() == wordSize) {

					// we have the "index==0" so that we don't get an Exception.
					// when doing "index-1" which would be -1,
					// which would not be an index on the array

					// the second part of the if statement checks if the
					// word before the current word was a different length.
					// if it was, we reprint the new wordSize
					if (index == 0 || foundWords.get(index - 1).length() != wordSize) {
						System.out.println("\n" + wordSize + " letter words");
					}

					// print the next word in the list
					System.out.println(foundWords.get(index));
					// move index for our next word
					index++;
				}
				// the size of words has changed, so we lower the wordSize
				wordSize--;
			}

		}

		// used to check the time taken
		double endTime = System.currentTimeMillis();
		double timeTaken = (endTime - startTime) / 1000;
		System.out.println("\nTime taken: " + timeTaken + " seconds");
	}

}
