/**
 * 
 * This class can be used to sort an array using Insertion Sort.
 * It implements the ISorter interface and has one method
 * 
 * 
 */
public class InsertionSort implements ISorter {
	private int numComparisons = 0;
	private int numMoves = 0;

	/**
	 * 
	 * This method uses the Insertion Sort algorithm to rearrange 
	 * the array so that it is ordered numerically
	 *
	 * @param  array  The int array that is passed to this method for sorting
	 * 
	 * @return      SortStats object containing statistics on the run operations
	 */
	@Override
	public ISortStats sort(int[] array) {
		
		long start = System.nanoTime();
		
		//for each number in the array
		for(int i = 1; i < array.length; i++) {
			int j = i - 1;
			int temp = array[i];
			numMoves++;
			//go till we find the spot we need to be in
			while(j >= 0 && temp < array[j]) {
				//shift things over
				array[j+1] = array[j];
				j--;
				numMoves++;
				numComparisons++;
				
			}
			numComparisons++;
			//set the proper spot
			if(array[j+1] != temp) {
				array[j+1] = temp;
				numMoves++;
			}
			numComparisons++;
		}
	    
	  
      
		long end = System.nanoTime();
		long timeNano = end-start;
		SortStats stats = new SortStats(
				"InsertionSort", array.length, numComparisons, numMoves, timeNano);
		return stats;
	}

}
