
public class Pokemon {
	//fields are defined	
	private String name;
	private int speed;
	private int defense;
	private int hp;
	private Attack[] attacks;
	private int damage;
	private int energy;
	
	//constructors
	Pokemon(String name, int speed, int defense, int hp, Attack[] attacks) {
		int sum = 0;
		
		for(Attack i: attacks) {
			sum+=Math.abs(i.getValue());
		}
		
		//makes sure all conditions are met
		if(name != null && name != "" && speed > 0 && defense > 0 &&
				hp > 0 && attacks.length > 0 && damage >= 0 && energy >= 0 &&
				speed + defense + hp < 150 && attacks.length <= 3 &&
				attacks.length >= 1 && sum <= 150) {
			this.name = name;
			this.speed = speed; 
			this.defense = defense;
			this.hp = hp;
			this.attacks = attacks;
		} else {
			throw new IllegalArgumentException();
		}
	}
	//calls first constructor
	Pokemon(String name, Attack[] attacks) {
		this(name, 50, 50, 50, attacks);
	}
	
	
	//accessor methods for all
	public String getName() { return name; }
	public int getSpeed() { return speed; }
	public int getDefense() { return defense; }
	public int getHp() { return hp; }
	public Attack[] getAttacks() { 	return attacks; }
	public int getDamage() { return damage; }
	public int getEnergy() { return energy; }
	
	
	//mutator methods
	public void setDamage(int damage) {
		if(damage < 0) 
			throw new IllegalArgumentException();
		this.damage = damage;
	}
	public void setEnergy(int energy) {
		if(energy > this.energy + 1 || energy < 0) 
			throw new IllegalArgumentException();
		this.energy = energy;
	}
	public void setSpeed(int speed) {
		if(speed + this.defense + this.hp < 150 && speed > 0)
			this.speed = speed;
		throw new IllegalArgumentException();
	}
	public void setDefense(int defense) {
		if(this.speed + defense + this.hp < 150 && defense > 0) 
			this.defense = defense;
		throw new IllegalArgumentException();
	}
	
	
	//overrides the default toString method
	public String toString() {
		String first = this.name + ", Speed " + this.speed + ", Defense " + this.defense + 
				", HP " + this.hp + ", Damage " + this.damage + ", Energy" + this.energy + "\n";
	
		String second = "";
		for(Attack i : this.attacks) {
			second += "\t" + i.toString() + "\n";
		}
		return first + second;
	}
	
	public boolean isWeak(Pokemon pokemon) {
		return false;

	}
	public boolean isResistant(Pokemon pokemon) {
		return false;
	}
	
	
	
	
	
	
}
