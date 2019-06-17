
public class Fire extends Pokemon {

	
	Fire(String name, int speed, int defense, int hp, Attack[] attacks) {
		super(name, speed, defense, hp, attacks);
	}
	Fire(String name, Attack[] attacks) {
		super(name, 50, 50, 50, attacks);
	}
	
	public boolean isWeak(Pokemon pokemon) {
		if(pokemon instanceof Grass) //should be Grass
			return true;
		return false;
					
	

	}
	public boolean isResistant(Pokemon pokemon) {
		if(pokemon instanceof Water) //should be Water
			return true;
		return false;
	}
}
