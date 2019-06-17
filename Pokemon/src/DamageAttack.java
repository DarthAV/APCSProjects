
public class DamageAttack extends Attack{
	//constructors
	DamageAttack(String name, int energy, int value) {
		super(name, energy, value);
	}
	DamageAttack(String name, int energy) {
		super(name, energy, 1);
	}
	
	//replaces old toString method's Value with Damage
	public String toString() {
		return super.toString().replace("Value", "Damage");
	}
	
	
	//changes damage amount based on weaknesses
	public void attack(Pokemon attacker, Pokemon attackee) {
		if(attackee.isResistant(attacker)) {
			attackee.setDamage(attackee.getDamage()-(super.getValue()/2));
		} else if(attackee.isWeak(attacker)) {
			attackee.setDamage(attackee.getDamage()-(super.getValue()*2));
		} else {
			attackee.setDamage(attackee.getDamage()-super.getValue());
		}
		
		if(attackee.getDamage() > 0) {
			attackee.setDamage(0);
		}
		
	}
}
