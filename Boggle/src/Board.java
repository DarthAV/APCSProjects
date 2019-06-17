/* Ansh Verma
 * Period 3 AP Computer Science
 * 
 * 
 */


import java.util.ArrayList;

public class Board {
	private char[][] board;
	private WordList allWordList;
	
	public Board(WordList wordList, int size) {
		this.board = new char[size][size];
		this.allWordList = wordList;
		
		
	    //use the created string to generate the board's characters randomly
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				//needs to populate the array with random letters from random words in the list		
				board[i][j] = allWordList.nextLetter(); 
			}
		}
	}
	
	public ArrayList<String> find() {
		ArrayList<String> foundWords = new ArrayList<String>(); 	
		boolean visited[][] = new boolean[board.length][board[0].length];
        
		//start from every tile on the board 
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                find(board, visited, i, j, "", foundWords);
            }
        }
        
        //foundWords was passed as a reference to find()
        //so it's value was changed here as well
        return foundWords;
        
    }
	
	private void find(char board[][], boolean visited[][], 
			int i, int j, String currentWord, ArrayList<String> foundWords) {

		//change the current word based on the current letter
		currentWord += board[i][j];

		//base case is checking if word is longer or the board than the longest word
		if(currentWord.length() > allWordList.getLongestWordLength()) {
			return;
		}
		
	
		//sets the current square as visited
		visited[i][j] = true;
		
		//goes through each of the surrounding squares of the current square
		//we also make sure we don't walk off the board
		for (int row = i - 1; row <= i + 1 && row < board.length; row++) {
			for (int col = j - 1; col <= j + 1 && col < board.length; col++) {
				//make sure we don't repeat letters
				//also make sure we don't go off the board when we did -1
				if (row >= 0 && col >= 0 && !visited[row][col]) {
					find(board, visited, row, col, currentWord, foundWords);
				}
				
			}
		}
		
		//checks if it is a valid word and if we already added the word
		if(allWordList.contains(currentWord) && !foundWords.contains(currentWord)) {
			//add the word to the found words
			foundWords.add(currentWord);
		}
		//remove the bread crumbs
		visited[i][j] = false;
	}
	
	//toString returns the board as a string
	public String toString() {
		String result = "";
		//goes through each tile
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				//adds the letter and a space
				result += board[i][j] + "  ";
			}
			//add a line break for the next row
			result += "\n";
		}
		//return the built string
		return result;
	}
}
