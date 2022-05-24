
public class PokemonKampf {

	public static void main(String[] args) {
		Schiggy schiggy = new Schiggy(200, 20, "Schiggy");
		Bisasam bisasam = new Bisasam(180, 18, "Bisasam");
		System.out.println(fight(schiggy, bisasam));
	}
	
	public static String fight(Pokemon angreifer, Pokemon verteidiger) {
		int i = 0;
		
		while(true) {
			if(i %2 == 0) {
				angreifer.attack(verteidiger);
				if(verteidiger.getHp() <= 0) {
					return angreifer.getName() + " hat gewonnen";
				}
			} else {
				verteidiger.attack(angreifer);
				if(angreifer.getHp() <= 0) {
					return verteidiger.getName() + " hat gewonnen";
				}
			}			
			i++;
		}
	}
}
