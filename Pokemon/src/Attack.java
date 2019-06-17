
public class Attack {
	//create the fields
	private String name;
	private int energy;
	private int value;
	
	//constructors
	Attack(String name, int energy, int value) {
		this.name = name;
		this.energy = energy;
		this.value = value;
	}
	Attack(String name, int energy) {
		this(name, energy, 1);
	}
	
	//accessor methods
	public String getName() {
		return name;
	}
	public int getEnergy() {
		return energy;
	}
	public int getValue() {
		return value;
	}
	
	//overrides default toString 
	public String toString() {
		String strValue = "" + this.value;
		if(this.value > 0) 
			strValue = "+" + this.value;
		return "\t" + this.name + ": Energy " + this.value + ", Value " + strValue;
	}
	
	//creates the attack functionality
	public void attack(Pokemon attacker, Pokemon attackee) {
	
	}
	
	
}
