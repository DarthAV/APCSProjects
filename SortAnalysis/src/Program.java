import java.util.Arrays;

public class Program {
	public static void main(String[] args) {
		
		//for each of the sizes
		for(int r = 2; r <= 4096; r *= 2) {
			
			System.out.println("\nTesting with size of " + r);
			
			
			int[] array = new int[r];
			
			//initialize the starting array in reverse order
			for (int i = 0; i < array.length; i++) {
				array[array.length - i - 1] = i;
			}
			
			//create all the new arrays
			int[] bubbleArray = new int[array.length];
			int[] selectionArray = new int[array.length];
			int[] insertionArray = new int[array.length];
			int[] mergeArray = new int[array.length];
			
			//set all the copies of arrays
			for (int j = 0; j < array.length; j++) { bubbleArray[j] = array[j]; }
			for (int j = 0; j < array.length; j++) { selectionArray[j] = array[j]; }
			for (int j = 0; j < array.length; j++) { insertionArray[j] = array[j]; }
			for (int j = 0; j < array.length; j++) { mergeArray[j] = array[j]; }
			
			
			System.out.println("\n\nReverse Order Test\n");
				
			//runs the tests
			BubbleSort bSort = new BubbleSort();
			SelectionSort sSort = new SelectionSort();
			InsertionSort iSort = new InsertionSort();
			MergeSort mSort = new MergeSort();
			ISortStats bStats = bSort.sort(bubbleArray);
			ISortStats sStats = sSort.sort(selectionArray);
			ISortStats iStats = iSort.sort(insertionArray);
			ISortStats mStats = mSort.sort(mergeArray);

			//prints out the arrays
			if(Check.isInOrder(bubbleArray))
				System.out.println(bStats);
			if(Check.isInOrder(selectionArray))
				System.out.println(sStats);
			if(Check.isInOrder(insertionArray))
				System.out.println(iStats);
			if(Check.isInOrder(mergeArray))
				System.out.println(mStats);
			

			System.out.println("\n\n");
			
			
			System.out.println("Correct Order Test\n");
			
			
			//we don't need to create new arrays because after every test, 
			//the array is still sorted and has not changed
			bSort = new BubbleSort();
			sSort = new SelectionSort();
			iSort = new InsertionSort();
			mSort = new MergeSort();
			bStats = bSort.sort(array);
			sStats = sSort.sort(array);
			iStats = iSort.sort(array);
			mStats = mSort.sort(array);
			
			
			if(Check.isInOrder(bubbleArray))
				System.out.println(bStats);
			if(Check.isInOrder(selectionArray))
				System.out.println(sStats);
			if(Check.isInOrder(insertionArray))
				System.out.println(iStats);
			if(Check.isInOrder(mergeArray))
				System.out.println(mStats);
			
			System.out.println("\n\n");
		
			
			
			
			System.out.println("Random Order Test\n");
			
			//change the numbers to random numbers from 0-1000
			for(int j = 0; j < array.length; j++) {
				array[j] = (int)(Math.random() * 1000);
			}
			
			//we can't simply set them to each other because of reference semantics
			bubbleArray = new int[array.length];
			selectionArray = new int[array.length];
			insertionArray = new int[array.length];
			mergeArray = new int[array.length];		
			
			
			for (int j = 0; j < array.length; j++) { bubbleArray[j] = array[j]; }
			for (int j = 0; j < array.length; j++) { selectionArray[j] = array[j]; }
			for (int j = 0; j < array.length; j++) { insertionArray[j] = array[j]; }
			for (int j = 0; j < array.length; j++) { mergeArray[j] = array[j]; }
			
			
			//runs the tests
			bSort = new BubbleSort();
			sSort = new SelectionSort();
			iSort = new InsertionSort();
			mSort = new MergeSort();
			bStats = bSort.sort(bubbleArray);
			sStats = sSort.sort(selectionArray);
			iStats = iSort.sort(insertionArray);
			mStats = mSort.sort(mergeArray);
			
			//prints out the arrays
			if(Check.isInOrder(bubbleArray))
				System.out.println(bStats);
			if(Check.isInOrder(selectionArray))
				System.out.println(sStats);
			if(Check.isInOrder(insertionArray))
				System.out.println(iStats);
			if(Check.isInOrder(mergeArray))
				System.out.println(mStats);
			

			System.out.println("\n\n\n\n\n\n\n\n");
		}
		
	}
}
