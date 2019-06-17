import java.util.*;
public class ArrayChallenge {

	public static void main(String[] args) {
		int[] array = {3, 4, 1, 1, 2, 0, 4, 5, 1, 4, 7, 0, 3, 6, 1, 4};
		int[] newArray = new int[array.length];
		
		int counter = 0;
		boolean repeat = false;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < newArray.length - (newArray.length - counter); j++) {
				if(newArray[j] == array[i]) {
					repeat = true;
					break;
				}
				
			}
			if(!repeat) {
				newArray[counter] = array[i];
				counter++;
			}
			repeat = false;
		}
		
		int[] finalArray = new int[counter];
		
		for(int i = 0; i < finalArray.length; i++) {
			finalArray[i] = newArray[i];
		}
		
		
		
		
		System.out.println("\nOriginal Array: ");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println("\nNew Array: ");
		for(int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i] + " ");
		}
		
		System.out.println("\nShortened Array: ");
		for(int i = 0; i < finalArray.length; i++) {
			System.out.print(finalArray[i] + " ");
		}
		
		Arrays.sort(finalArray);
		
		System.out.println("\nFinal Array: ");
		for(int i = 0; i < finalArray.length; i++) {
			System.out.print(finalArray[i] + " ");
		}
	}
	
}
