/*Ansh Verma
*APCS Period 3
*
*Turtle objects display a T and move 
*/

public class Turtle implements Critter {
	private int repeats;
	private int direction;
	
	public Turtle() {
		this.repeats = 0;
		this.direction = NORTH; //the starting direction is north
	}
	
    public char getChar() {
        return 'T';
    }

    public int getMove(CritterInfo info) {
        
        if(repeats == 0) {
        	this.repeats++;
	    	return this.direction;	    	
    	} else if(this.repeats == 1) {
    		this.repeats++;
    		return this.direction; //returns the same previously determined direction
    	} else if(this.repeats == 2) {
    		this.repeats++;
    		return this.direction; //returns the same previously determined direction
    	} else if(this.repeats == 3) {
    		this.repeats++;
    		return this.direction; //returns the same previously determined direction
    	} else if(this.repeats == 4) {
    		this.repeats = 0; //sets times repeated back to 0 to find new random value

    		int tempDirection = this.direction; //temp variable so that we can return the current direction
    		
    		if(this.direction == NORTH) 
	    		this.direction = EAST;
	    	else if(this.direction == EAST) 
	    		this.direction = SOUTH;
	    	else if(this.direction == SOUTH) 
	    		this.direction = WEST;
	    	else 
	    		this.direction = NORTH;
    		
    		return tempDirection; //returns the original direction
    	} 
    	return 0;
    }
}
