/**
 * 
 * This class can be used to sort an array using Selection Sort.
 * It implements the ISorter interface and has one method
 * 
 * 
 */
public class SelectionSort implements ISorter {
	private int numComparisons = 0;
	private int numMoves = 0;

	/**
	 * 
	 * This method uses the Selection Sort algorithm to rearrange 
	 * the array so that it is ordered numerically
	 *
	 * @param  array  The int array that is passed to this method for sorting
	 * 
	 * @return      SortStats object containing statistics on the run operations
	 */
	@Override
	public ISortStats sort(int[] array) {
				
		long start = System.nanoTime();
		
		for (int i = 0; i < array.length - 1; i++) {
			int smallest = i;
			for(int k = i+1; k < array.length; k++) {
				if(array[k] < array[smallest]) {
					smallest = k;
				}
				numComparisons++;
			}
			if(smallest != i) {
				int temp = array[i];
				array[i] = array[smallest];
				array[smallest] = temp;
				numMoves+=3;
			}
		
		}
		
		
		long end = System.nanoTime();
		long timeNano = end-start;
		SortStats stats = new SortStats(
				"SelectionSort", array.length, numComparisons, numMoves, timeNano);
		return stats;
	}

}
