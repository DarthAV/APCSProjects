import java.util.Arrays;

public class MyPokemon extends Fire{
	
	//constructors
	MyPokemon() {
		super("Charzard", 50, 40, 60, new Attack[] {
				new Attack("Fireball", 2, 2), new Attack("HeatWave", 1, 2)});
	}

	
	//attack methods
	public void Fireball(Pokemon pokemon) {
		Arrays.binarySearch(super.getAttacks(), "Fireball");
	}
	
	public void HeatWave(Pokemon pokemon) {
		

	}
	
}