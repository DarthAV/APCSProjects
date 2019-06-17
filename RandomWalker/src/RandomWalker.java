/* Ansh Verma
 * Period 3 APCS
 * 
 * This class is a random walker class
 * It uses the Random class to decide a direction in which to move in
 */

// for random class
import java.util.Random;

public class RandomWalker {
	private int x;
	private int y;
	private int steps;
	
	// always starts at (0,0)
	public RandomWalker() {
		this.x = 0;
		this.y = 0;
	}
	
	// getter methods
	public int getX() { return this.x; }
	public int getY() {	return this.y; }
	public int getSteps() { return this.steps; }
	
	
	
	public void move() {
		Random rand = new Random();
		int currentNum = rand.nextInt(4); //value between 0-3 inclusive
		
		// return of 0 moves point right
		// return of 1 moves point up
		// return of 2 moves point left
		// return of 3 moves point down
		if(currentNum == 0) {
			this.x++;
		} else if(currentNum == 1) {
			this.y++;
		} else if(currentNum == 2) {
			this.x--;
		} else if(currentNum == 3) {
			this.y--;
		}
		//add one to steps
		this.steps++;
	}
}
