/* Ansh Verma
 * Period 3 APCS
 * 
 * This class for the catalog
 * This holds all the
 */

//imports the ArrayList class
import java.util.ArrayList;

public class Catalog {

	private String name;
	private ArrayList<Item> catalogList;
	
	//constructor sets fields
	public Catalog(String name) {
		this.name = name;
		this.catalogList = new ArrayList<Item>();
	}

	//adds a new item to the catalog
	public void add(Item item) {
		catalogList.add(item);
	}

	//returns the catalog name
	public String getName() {
		return this.name;
	}

	//returns the number of items in the catalog
	public int size() {
		return this.catalogList.size();
	}

	//returns an item from the list based on the index given
	public Item get(int index) {
		return catalogList.get(index);
	}

}
