/*Ansh Verma
*APCS Period 3
*
*Frog objects display a F and move randomly by three
*/

public class Frog implements Critter {
	private int repeats;
	private int direction;
	
	public Frog() {
		this.repeats = 0;
		this.direction = 0;
	}
	
    public char getChar() {
        return 'F';
    }

    public int getMove(CritterInfo info) {
    	//repeats 3 times before finding a new random direction to move in
    	if(repeats == 0) {
	    	int random = (int)(Math.random()*4);
	    	this.repeats++;
	    	
	    	if(random == 0) 
	    		this.direction = NORTH;
	    	else if(random == 1) 
	    		this.direction = EAST;
	    	else if(random == 2) 
	    		this.direction = SOUTH;
	    	else 
	    		this.direction = WEST;
	    	return this.direction;
	    	
    	} else if(this.repeats == 1) {
    		this.repeats++;
    		return this.direction; //returns the same previously determined direction
    	} else if(this.repeats == 2) {
    		this.repeats = 0; //sets times repeated back to 0 to find new random direction
    		return this.direction; //returns the same previously determined direction
    	} 
    	return 0;
    }
}
