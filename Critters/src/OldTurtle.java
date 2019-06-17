/*Ansh Verma
*APCS Period 3
*
*Turtle objects display a T and move 
*/

public class OldTurtle implements Critter {
	private int repeats;
	private int direction;
	private boolean tired;
	
	public OldTurtle() {
		this.repeats = 0;
		this.direction = NORTH; //starting direction is North
		this.tired = false;
	}
    public char getChar() {
        return 'O';
    }

    public int getMove(CritterInfo info) {

    	
		if(this.tired) {
			this.tired = !this.tired; //we have now rested
			return CENTER;
		}
		else if(repeats == 0) {
        	this.repeats++;
        	this.tired = !this.tired; //we are tired after walking
	    	return this.direction;	    	
    	} else if(this.repeats == 1) {
    		this.repeats++;
        	this.tired = !this.tired; //we have are tired after walking
    		return this.direction; //returns the same previously determined direction
    	} else if(this.repeats == 2) {
    		this.repeats++;
        	this.tired = !this.tired; //we have are tired after walking
    		return this.direction; //returns the same previously determined direction
    	} else if(this.repeats == 3) {
    		this.repeats++;
        	this.tired = !this.tired; //we have are tired after walking
    		return this.direction; //returns the same previously determined direction
    	} else if(this.repeats == 4) {
    		this.repeats = 0;
        	this.tired = !this.tired; //we have are tired after walking
    		int tempDirection = this.direction; //temp variable so that we can return the current direction
    		
    		//changes the direction for the next time we move
    		if(this.direction == NORTH) 
	    		this.direction = EAST;
	    	else if(this.direction == EAST) 
	    		this.direction = SOUTH;
	    	else if(this.direction == SOUTH) 
	    		this.direction = WEST;
	    	else 
	    		this.direction = NORTH;
    		
    		return tempDirection; //returns the same original direction
    	}
		return 0;
    }
}
