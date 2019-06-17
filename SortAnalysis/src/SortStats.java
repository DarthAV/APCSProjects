
/**
 * 
 * This class is used to hold statistics that occur
 * during runtime of 
 * It implements the ISortStats interface and many accessor methods
 * and toString method which is useful for printing out the statistics
 * 
 * 
 */
public class SortStats implements ISortStats {
	private String algorithm;
	private int numItems;
	private int numComparisons;
	private int numMoves;
	private long numNanoseconds;
	
	public SortStats(String algorithm, int numItems, int numComparisons, 
			int numMoves, long numNanoseconds) {
		this.algorithm = algorithm;
		this.numItems = numItems;
		this.numComparisons = numComparisons;
		this.numMoves = numMoves;
		this.numNanoseconds = numNanoseconds;
	}
	
	/**
	 * Getter method for the private field "algorithm"
	 * 
	 * @return The private String field "algorithm"
	 */
	@Override
	public String getAlgorithm() { return this.algorithm; }
	
	
	/**
	 * Getter method for the private field "numItems"
	 * 
	 * @return The private int field "numItems"
	 */
	@Override
	public int getNumItems() { return this.numItems; }
	
	
	/**
	 * Getter method for the private field "numComparisons"
	 * 
	 * @return The private int field "numComparisons"
	 */
	@Override
	public int getNumComparisons() { return this.numComparisons; }
	
	
	/**
	 * Getter method for the private field "numMoves"
	 * 
	 * @return The private int field "numMoves"
	 */
	@Override
	public int getNumMoves() { return this.numMoves; }
	
	
	/**
	 * Getter method for the private field "numComparisons"
	 * 
	 * @return The private int field "numComparisons"
	 */
	@Override
	public long getNumNanoseconds() { return this.numNanoseconds; }
	
	
	
	
	/**
	 * Compiles the String representation of the statistics 
	 * provided when creating the object, into a single String
	 * 
	 * @return String representation of the statistics provided
	 * 
	 */
	@Override
	public String toString() {
		String statistics = "";
		
		statistics += "\n\"Algorithm\"\t: \"" + this.getAlgorithm() + "\"";
		statistics += "\n\"NumItems\"\t: \"" + this.getNumItems() + "\"";
		statistics += "\n\"NumComparisons\": \"" + this.getNumComparisons() + "\"";
		statistics += "\n\"NumMoves\"\t: \"" + this.getNumMoves() + "\"";
		statistics += "\n\"NumNanoseconds\": \"" + this.getNumNanoseconds() + "\"";
	    
		return statistics;
	}
}
