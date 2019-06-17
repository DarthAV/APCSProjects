/* Ansh Verma
 * APCS Period 3
 * 
 * This program finds a .txt file on your system that has names of the
 * most popular baby names from 1900 to 2000.
 * When the user inputs a name, it searches the .txt file for a name matching that name
 * If it finds a match, it prints data in the console and to a file
 * 
 */
import java.io.*; //imports all things for the files
import java.util.*; //imports all things for scanner

public class BabyNames {

	public static void main(String[] args) 
			throws FileNotFoundException {
		
		Scanner inputScanner = new Scanner(System.in); //scanner to read from console
		System.out.println("** Popularity of a baby name since year 1900 ** ");
		boolean anotherName = true;
		while(anotherName) {
			findName(inputScanner);
			
			//asks if they want to look for more names
			System.out.println("\nWould you like to search another name?");
			String input = inputScanner.next().toLowerCase();
			if(!(input.equals("y") || input.equals("yes"))) {
				anotherName = false; //ends program if they are done
			}
		}
	}
	
	public static void findName(Scanner inputScanner) 
			throws FileNotFoundException {
		//we declare this scanner here so that we start from the top of the file
		Scanner fileScanner = new Scanner(new File("names.txt")); 
		System.out.println("\nname?");
		String name = inputScanner.next();
		boolean nameNotFound = true; //variable tells if we found matching name
		
		while(fileScanner.hasNextLine()) {
			String line = fileScanner.nextLine(); //variable with the line
			Scanner lineScanner = new Scanner(line); 
			/* we have a second scanner so we can send one to one method 
			 * and one to another method. This avoids the scanner running out 
			 * of tokens to process
			 */
			Scanner lineScannerConsole = new Scanner(line);
			
			//we need to advance both of the scanners so they are at the same spot
			String currentName = lineScanner.next(); 
			lineScannerConsole.next(); //has no affect
			
			//checks if the name matches for any of them names
			if(name.equalsIgnoreCase(currentName)) {
				printToFile(currentName, lineScanner); //print to file
				printToConsole(currentName, lineScannerConsole); //print to console
				nameNotFound = false; //we found our name
				
				break;
			}
			//if we didn't find the name, print the error
			if(nameNotFound && !fileScanner.hasNextLine()) {
				System.out.println("name not found.");
			}
			lineScanner.close(); //closes scanner to save memory
			lineScannerConsole.close(); //closes scanner to save memory
		}
		
		//close scanner so that if we have to open it again, it saves memory
		fileScanner.close(); 
	}
	
	
	public static void printToFile(String name, Scanner lineScanner) 
			throws FileNotFoundException {
		PrintStream filePrinter = new PrintStream(new File(name + ".txt"));
		filePrinter.println("name?");
		filePrinter.println(name);
		for(int year = 1900; year <= 2000; year+=10) { //goes through every year
			filePrinter.println(year + ": " + lineScanner.next()); //prints to file
		}
		filePrinter.close(); //closes scanner to save memory
	}
	public static void printToConsole(String name, Scanner lineScanner) 
			throws FileNotFoundException {
		for(int year = 1900; year <= 2000; year+=10) { //goes through every year
			System.out.println(year + ": " + lineScanner.next()); //prints to console
		}
	}
}
