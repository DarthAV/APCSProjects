/*Ansh Verma
*APCS Period 3
*
*Turtle objects display a T and move 
*/

public class Wolf implements Critter {
	private int repeats;
	
	public Wolf() {
		this.repeats = 0;
	}
	
	//cycles through the letters in the word "Wolf"
    public char getChar() {
    	if(this.repeats == 0) {
    		this.repeats++;
	    	return 'W';	    	
    	} else if(this.repeats == 1) {
    		this.repeats++;
    		return 'o'; 
    	} else if(this.repeats == 2) {
    		this.repeats++;
    		return 'l'; 
    	} else {
    		this.repeats=0;
    		return 'f'; 
    	}
    }

    public int getMove(CritterInfo info) {
        char neighborEast = info.getNeighbor(EAST);
        char neighborNorth = info.getNeighbor(NORTH);
        char neighborSouth = info.getNeighbor(SOUTH);
        char neighborWest = info.getNeighbor(WEST);
        
        
        //if the wolf is next to another wolf it will attack
    	//the other wolf so that it can have better territory
    	
    	//there are only east and south movements because otherwise,
    	//two wolves would continuously switch spots
    	if(neighborEast == 'W' || neighborEast == 'o' || 
    			neighborEast == 'l' || neighborEast == 'f') {
    		return EAST;
    	}
    	
    	if(neighborSouth == 'W' || neighborSouth == 'o' || 
    			neighborSouth == 'l' || neighborSouth == 'f') {
    		return SOUTH;
    	}
    	
    	
    	//it knows that there is about to be a wolf coming for it, 
    	//so it stays where it is to decide who will win after the fight
    	if(neighborNorth == 'W' || neighborNorth == 'o' || 
    			neighborNorth == 'l' || neighborNorth == 'f') {
    		return CENTER;
    	}
    	//i made two if statements to make it more clear
    	if(neighborWest == 'W' || neighborWest == 'o' || 
    			neighborWest == 'l' || neighborWest == 'f') {
    		return CENTER;
    	}
        
        
        
        
        
        //if the wolf is next to another animal it moves in a different  
        //direction because all wolves are vegetarian and it does not 
        //want to be eaten by other animals like frogs  :)
    	if(neighborEast == 'F' || neighborEast == 'T' || 
    			neighborEast == 'O' || neighborEast == 'B') {
    		return NORTH;
    	}
    	if(neighborNorth == 'F' || neighborNorth == 'T' || 
    			neighborNorth == 'O' || neighborNorth == 'B') {
    		return SOUTH;
    	}
    	if(neighborSouth == 'F' || neighborSouth == 'T' || 
    			neighborSouth == 'O' || neighborSouth == 'B') {
    		return WEST;
    	}
    	if(neighborWest == 'F' || neighborWest == 'T' || 
    			neighborWest == 'O' || neighborWest == 'B') {
    		return EAST;
    	}
    	
    	
    	
    	//if the wolf is not next to any other animals, 
    	//it will move around the map randomly
    	else {
        	int num = (int)(Math.random()*5);
        	if(num == 0) 
        		return NORTH;
        	if(num == 1) 
        		return EAST;
        	if(num == 2) 
        		return SOUTH;
        	if(num == 3) 
        		return WEST;
        	return CENTER;
    	}
    	
    	
    	
    }
}
