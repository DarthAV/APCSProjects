/*Ansh Verma
*APCS Period 3
*
*Turtle objects display a T and move 
*/

public class Bird implements Critter {
    public char getChar() {
        return 'B';
    }

    public int getMove(CritterInfo info) {
    	//decides randomly one of the four directions to move in
    	int num = (int)(Math.random()*4);
    	if(num == 0) 
    		return NORTH;
    	if(num == 1) 
    		return EAST;
    	if(num == 2) 
    		return SOUTH;
    	return WEST;
    }
}
