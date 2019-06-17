
public class Check {
	public static boolean isInOrder(int[] input) {
		boolean sorted = true;

		for (int i = 0; i < input.length - 1; i++) {
		    if (input[i] > input[i+1]) {
		        sorted = false;
		        break;
		    }
		}
		
		return sorted;
	}
}
