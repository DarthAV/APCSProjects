
public class DefenseAttack extends Attack{
	//constructors
	DefenseAttack(String name, int energy, int value) {
		super(name, energy, value);
	}
	DefenseAttack(String name, int energy) {
		super(name, energy, 1);
	}
	
	//replaces old toString method's Value with Defense
	public String toString() {
		return super.toString().replace("Value", "Defense");
	}
	
	
//	//changes damage amount based on weaknesses
//	public void attack(Pokemon attacker, Pokemon attackee) {
//		if(attackee.isResistant(attacker)) {
//			attackee.setDefense(attackee.getDefense()-(super.getValue()/2));
//		} else if(attackee.isWeak(attacker)) {
//			attackee.setDefense(attackee.getDefense()-(super.getValue()*2));
//		} else {
//			attackee.setDefense(attackee.getDefense()-super.getValue());
//		}
//		
//		if(attackee.getDefense() > 0) {
//			attackee.setDefense(0);
//		}
//		
//	}
}
