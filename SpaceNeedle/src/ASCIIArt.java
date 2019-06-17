/* Name: Ansh Verma
 * Course: AP Computer Science
 * Period 3
 * 
 * This program creates an ASCII Art Drawing of a Dagger
 * I use for loops and methods to make my dagger
 * I tried to use a class constant, however, the dagger wouldn't resize properly
 */

public class ASCIIArt {
	
	//prints the dagger method
	public static void main(String[] args) {
		dagger();
	}
	
	//prints all of methods to make sword
	public static void dagger() {
		//Lines breaks to make the shape clearer
		System.out.println();
		System.out.println();
		tip();
		blade();
		handGuard();
		handle();		
	}
	
	//prints the sharp tip of the dagger
	public static void tip() {
			for(int lines = 0; lines<5; lines++) {
				for(int spaces = 1; spaces <= 3*5-lines; spaces++) {
	                System.out.print(" ");
	            }
				for(int panels = 0; panels < 5/2+lines*2; panels++) {
					System.out.print("^");
					
				}
				System.out.println();
				
			}
	}
	
	//prints the blade of the dagger
	public static void blade() {
    	for(int i = 1; i <= 5*3; i++) {
            for(int spaces = 1; spaces <= 3*5-(5-1); spaces++) {
                System.out.print(" ");
            }
            
            System.out.print("|");
            for(int j = 1; j <= 5-2; j++) {
            	System.out.print("/");
            }
            System.out.print("||");
            for(int j = 1; j <= 5-2; j++) {
            	System.out.print("\\");
            }
            System.out.print("|");
            
            System.out.println();
        }
    }

	//prints the hand guard (Its not perfect)
	public static void handGuard() {
			for(int spaces = 1; spaces <= 5; spaces++) {
	            System.out.print(" ");
	        }
            System.out.print("|"); 
            for(int width = 1;  width <= 5*4; width++) {
            	System.out.print("_");
            }
            System.out.println("|"); 
        
	}
	
	//prints the handle where the wielder would hold the dagger
	public static void handle() {
    	for(int lines = 1; lines <= 5*2; lines++) {
    		for(int spaces = 1; spaces <= 5*3-2; spaces++) {
    			System.out.print(" ");
    		}
    		System.out.print("|");
    		for(int innerDesign = 1; innerDesign <= 4; innerDesign++) {
    			System.out.print("_");
    		}
    		System.out.println("|");
    	}
    	
    	//Here it prints out the little design on the bottom which stops the hand from sliding off
    	for(int spaces = 1; spaces <= 5*2; spaces++) {
			System.out.print(" ");
		}
    	System.out.print("(");
    	for(int gaps = 1; gaps <= 5*2; gaps++) {
			System.out.print("_");
		}
    	System.out.println(")");
    	
    	
    	for(int spaces = 1; spaces <= 5*2; spaces++) {
			System.out.print(" ");
		}
    	System.out.print("(");
    	for(int gaps = 1; gaps <= 5*2; gaps++) {
			System.out.print("_");
		}
    	System.out.println(")");
	}
}










