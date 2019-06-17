/* Ansh Verma
 * Period 3 APCS
 * 
 * This class is an Item class
 * It holds the type of item, its price, and bulk Quantity/Value
 */

//imports the numberFormat class
import java.text.NumberFormat;

public class Item {
	
	private String name;
	private double price;
	private int bulkQuantity;
	private double bulkPrice;
	
	//constructor sets values of fields
	public Item(String name, double price, int bulkQuantity, double bulkPrice) {
		//price, bulkQuantity, and bulkPrice cannot be less than zero
		if(price < 0 || bulkQuantity < 0 || bulkPrice < 0) 
			throw new IllegalArgumentException();
		
		this.name = name;
		this.price = price;
		this.bulkQuantity = bulkQuantity;
		this.bulkPrice = bulkPrice;
	}
	
	//if bulk values not passed, then set to dummy values
	public Item(String name, double price) {
		this(name, price, 0, price);
	}

	//finds the price of a certain amount of the item
	//also takes into account bulkPrice
	public double priceFor(int quantity) {
		//quantity cannot be less than zero
		if(quantity < 0) { throw new IllegalArgumentException(); }
		//if there is no bulk value for the item then it is a simple calculation
		if(this.bulkQuantity == 0) 
			return this.price * quantity;
		
		//we only count by multiples of the bulk price and 
		//anything left over is calculated normally
		return this.bulkPrice * (quantity - (quantity % 10)) / bulkQuantity +
				this.price * (quantity % 10);
	}
	
	
	//toString method 
	public String toString() {
		//uses NumberFormat to format the string as a price
		NumberFormat formatting = NumberFormat.getCurrencyInstance();
		//if there is no bulk value, just returns the name and formatted price
		if(this.bulkQuantity == 0) 
			return this.name + ", " + formatting.format(this.price);

		//returns the name and formatted price with bulkQuantity and bulkPrice in parentheses
		return this.name + ", " + formatting.format(this.price) + " (" + 
			this.bulkQuantity + " for " + formatting.format(this.bulkPrice) + ")";
	}
}
