/**
 * 
 * This class can be used to sort an array using Bubble Sort.
 * It implements the ISorter interface and has one method
 * 
 * 
 */
public class BubbleSort implements ISorter {
	private int numComparisons = 0;
	private int numMoves = 0;
	

	/**
	 * 
	 * This method uses the Bubble Sort algorithm to rearrange 
	 * <p>
	 * the array so that it is ordered numerically
	 *
	 * @param  array  The int array that is passed to this method for sorting
	 * 
	 * @return      SortStats object containing statistics on the run operations
	 */
	@Override
	public ISortStats sort(int[] array) {
		
		long start = System.nanoTime();
		
		//set to true to get us through the first gate
		boolean somethingChanged = true;
		//repeats until nothing changed
		while(somethingChanged) {
			//nothing has changed yet
			somethingChanged = false;
			//go through all elements
			for(int i = 0; i < array.length - 1; i++) {
				//if out of order
				if(array[i] > array[i+1]) {
					//swap the two
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
					//we finally changed something
					somethingChanged = true;
					numMoves+=3;
				}
				numComparisons++;
			}
		}
		
		long end = System.nanoTime();
		long timeNano = end-start;
		return new SortStats(
				"BubbleSort", array.length, numComparisons, numMoves, timeNano);
		
	}
}
