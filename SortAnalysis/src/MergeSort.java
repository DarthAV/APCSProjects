
/**
 * 
 * This class can be used to sort an array using Merge Sort.
 * It implements the ISorter interface and has one method
 * 
 * 
 */

public class MergeSort implements ISorter {
	private int numComparisons = 0;
	private int numMoves = 0;
	
	/**
	 * 
	 * This method uses the Merge Sort algorithm to rearrange 
	 * the array so that it is ordered numerically
	 *
	 * @param  array  The int array that is passed to this method for sorting
	 * 
	 * @return      SortStats object containing statistics on the run operations
	 */
	@Override
	public ISortStats sort(int[] array) {
		
		long start = System.nanoTime();
		
		
		seperate(array, 0, array.length - 1);
		
		
		long end = System.nanoTime();
		long timeNano = end-start;
		SortStats stats = new SortStats(
				"MergeSort", array.length, numComparisons, numMoves, timeNano);
		return stats;
	}

	private void seperate(int[] array, int start, int end) {
		int mid = 0;
		
	    if(start < end) {
	    	numComparisons++;
	    	mid = (start + end) / 2;
	    	seperate(array, start, mid);
	    	seperate(array, mid + 1, end);
	    	merge(array, start, mid, end);
	    }
	    numComparisons++;
	}
	private void merge(int[] array, int start, int mid, int end) {
	    int temp[] = new int[array.length];
	    int l = start;
	    int r = end;
	    int m = mid + 1;
	    int k = l;

	    while(l <= mid && m <= r) {
	    	numComparisons+=2;
	    	if(array[l] <= array[m]) {
	    		numComparisons++;
	    		temp[k++] = array[l++];
	    		numMoves++;
	    	}
	    	else {
	    		temp[k++] = array[m++];
	    		numMoves++;
	    	}
	    	numComparisons++;
	    }
	    numComparisons++;

	    while(l <= mid) {
    		numComparisons++;
	    	temp[k++] = array[l++];
	    	numMoves++;
	    }
	    numComparisons++;
	    
	    while(m <= r) {
    		numComparisons++;
	    	temp[k++] = array[m++];
	    	numMoves++;
	    }
	    numComparisons++;
	    
	    for(int i = start; i <= end; i++) {
	    	array[i] = temp[i];
	    	numMoves++;
	    }
	     

	  }
	
}
