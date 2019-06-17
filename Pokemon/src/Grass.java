
public class Grass extends Pokemon {

	
	Grass(String name, int speed, int defense, int hp, Attack[] attacks) {
		super(name, speed, defense, hp, attacks);
	}
	Grass(String name, Attack[] attacks) {
		super(name, 50, 50, 50, attacks);
	}
	
	public boolean isWeak(Pokemon pokemon) {
		if(pokemon instanceof Fire) //should be Fire
			return true;
		return false;
					
	

	}
	public boolean isResistant(Pokemon pokemon) {
		if(pokemon instanceof Water) //should be Water
			return true;
		return false;
	}
}

