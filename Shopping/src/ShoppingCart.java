/* Ansh Verma
 * Period 3 APCS
 * 
 * This class is used to hold all the itemOrders that the user has selected.
 * It also can calculate the total price and checks for a discount
 */

//imports the ArrayList class
import java.util.ArrayList;

public class ShoppingCart {
	
	private ArrayList<ItemOrder> itemOrders; //for holding all the itemOrders
	private boolean isDiscount;
	
	//constructor initializes the variables
	public ShoppingCart() {
		this.itemOrders = new ArrayList<ItemOrder>();
		this.isDiscount = false;
	}

	//if the discount is applied set the
	public void setDiscount(boolean isDiscount) {
		this.isDiscount = isDiscount;
	}

	//adds a new itemOrder to the ArrayList
	public void add(ItemOrder itemOrder) {
		//if it is empty, we don't need to check if its a repeat,
		//we can just add the itemOrder
		if(this.itemOrders.isEmpty()) {
			this.itemOrders.add(itemOrder);
			return;
		}
		
		//we go through each of the itemOrders in the list
		for(int i = 0; i < this.itemOrders.size(); i++) {
			//checks if it is a change to a current item
			if(this.itemOrders.get(i).getItem().toString().equals(
							itemOrder.getItem().toString())) {
				//if it is, we replace the old item
				this.itemOrders.set(i, itemOrder);
				return;
			}
		}
		//we reached the end of the list without finding a repeat
		this.itemOrders.add(itemOrder);
		
	}

	//finds the total price of all items and applies discounts
	public double getTotal() {
		double total = 0;
		for(ItemOrder i : this.itemOrders) 
			total += i.getPrice();
		if(this.isDiscount) {
			total *= 0.9	;
		}
		return total;
	}
	
}
