
public class PokemonKampf {

	public static void main(String[] args) {
		Glumanda glumanda = new Glumanda(200, 20, "Glumanda1");
		Glumanda glumanda2 = new Glumanda(180, 18, "Glumanda2");
		System.out.println(fight(glumanda, glumanda2));
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
