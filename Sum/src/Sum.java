/* Ansh Verma
 * AP Computer Science Period 3
 * 12/7/18
 * 
 * This program takes an input file and adds all the numbers every line
 * This program allows for numbers of up to 25 digits long instead of 13 digits in the type "long"
 */
import java.util.*;
import java.io.*;

public class Sum {
public static int MAX_SIZE = 25; //this is the maximum number of digits
	
	public static void main(String[] args)
			throws FileNotFoundException {
		Scanner fileReader = new Scanner(new File("sum.txt"));
		int[] total = new int[MAX_SIZE]; //array for the sum
		int[] nextNum = new int[MAX_SIZE]; //array for the next number to add
		int count = 0; //counter of lines for last print line
		
		while(fileReader.hasNextLine()) { //repeat for all lines
			String currentLine = fileReader.nextLine();
			Scanner lineScanner = new Scanner(currentLine);
			
			if(lineScanner.hasNext()){ //have it run only when there are tokens
				count++;
				processAll(lineScanner, total, nextNum); //processes and prints everything
			}
			lineScanner.close();
		}
		System.out.println("Total lines: " + count); //print number of lines
		fileReader.close();
	}
	
	
	//adds the next number to the current total
	public static void addNumbers(int[] total, int[] nextNum) {
		for(int i = 0; i < MAX_SIZE; i++) {
			total[i] += nextNum[i];
		}
		for(int i = MAX_SIZE - 1; i > 0; i--) {
			if(total[i] > 9) {
				total[i - 1] += total[i] / 10;
				total[i] = total[i] % 10;
			}
		}
	}
	
	
	//converts the number from string to array of digits and print it
	public static void processNext(String number, int[] nextNum) {
		convertToArray(number, nextNum); //converts number in String to array of digits
		printNumber(nextNum); //prints the sum of the numbers
	}
		
	//converts the number from string into an array
	public static void convertToArray(String numberForConversion, int[] nextNum) {
		for(int i = MAX_SIZE-1; i >= 0; i--) {
			if(numberForConversion.length() > 0) {
				nextNum[i] = numberForConversion.charAt(
									numberForConversion.length() - 1) - '0';
				numberForConversion = numberForConversion.substring(0, 
									numberForConversion.length() - 1);
			} else
				nextNum[i] = 0;
		}
	}
	
	//goes through each of the numbers in the lines and processes them
	public static void processAll(Scanner lineScanner, int[] total, int[] nextNum) {
		
		processNext(lineScanner.next(), total); //processes the next number (prints and makes array)
		
		while(lineScanner.hasNext()) { //goes through each remaining number
			System.out.print(" + "); 
			processNext(lineScanner.next(), nextNum);	
			addNumbers(total, nextNum);	//Add the next number to the total sum
		}
		
		System.out.print(" = ");
		printNumber(total);	//prints the sum of the numbers
		System.out.println();
	}
	
	//prints out the number
	public static void printNumber(int[] n) {
		boolean partOfNum = false;
		for(int i = 0; i < MAX_SIZE; i++) {
			if(n[i] != 0 || partOfNum || i == MAX_SIZE - 1) {
				System.out.print(n[i]);
			}
			if(!partOfNum && n[i] != 0) {
				partOfNum = true;
			}
		}
	}
}