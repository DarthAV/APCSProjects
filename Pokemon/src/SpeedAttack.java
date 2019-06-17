
public class SpeedAttack extends Attack {
	//constructors
	SpeedAttack(String name, int energy, int value) {
		super(name, energy, value);
	}
	SpeedAttack(String name, int energy) {
		super(name, energy, 1);
	}
	

	//replaces old toString method's Value with Speed
	public String toString() {
		return super.toString().replace("Value", "Speed");
	}
	
//	//changes damage amount based on weaknesses
//	public void attack(Pokemon attacker, Pokemon attackee) {
//		if(attackee.isResistant(attacker)) {
//			attackee.setSpeed(attackee.getSpeed()-(super.getValue()/2));
//		} else if(attackee.isWeak(attacker)) {
//			attackee.setSpeed(attackee.getSpeed()-(super.getValue()*2));
//		} else {
//			attackee.setSpeed(attackee.getSpeed()-super.getValue());
//		}
//		
//		if(attackee.getSpeed() > 0) {
//			attackee.setSpeed(0);
//		}
//		
//	}
}
