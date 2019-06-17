/* Ansh Verma
 * Period 3 AP Computer Science
 * 
 * Word comparator class implements the comparator interface
 * When passed strings from an array type, 
 * it sorts them so that they are ordered by length, 
 * and then alphabetically within length.    
 */

import java.util.Comparator;
public class WordComparator implements Comparator<String> {
	public int compare(String str1, String str2) {
		//sorts by length if they are different lengths
		if(str1.length() != str2.length()) { 
			return str1.length() > str2.length() ? -1 : 1; 
		}
		//sorts by the default string which sorts alphabetically
		return str1.compareTo(str2);
	}
}