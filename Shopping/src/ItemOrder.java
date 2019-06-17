/* Ansh Verma
 * Period 3 APCS
 * 
 * This class stores the item and how many of that item are requested.
 * You can request the price of the order
 */


public class ItemOrder {

	private Item item;
	private int quantity;
	
	//constructor assigns values to fields
	public ItemOrder(Item item, int quantity) {
		this.item = item;
		this.quantity = quantity;
	}
	
	//calls the price method for the item
	public double getPrice() {
		return this.item.priceFor(quantity);
	}
	
	//returns the type of item
	public Item getItem() {
		return this.item;
	}
}
