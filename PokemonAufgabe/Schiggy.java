
public class Schiggy extends Pokemon implements Wasser {

	public Schiggy() {
		super(150, 10);
		setName("Schiggy");
	}
	
	public Schiggy(int hp, int level) {
		super(hp, level);
		setName("Schiggy");
	}
	
	public Schiggy(int hp, int level, String name) {
		super(hp, level);
		setName(name);
	}

	@Override
	public String wasserAttacke() {
		return "Aquaknarre";
	}

	@Override
	public void attack(Pokemon gegner) {
		float dmg = 50 + getLevel();
		System.out.println(this.getName() + " führt " + wasserAttacke() + " aus!");
		if(gegner instanceof Feuer) {
			// dmg 150%
			// Glut war sehr effektiv!
			System.out.println(wasserAttacke() + " war sehr effektiv!");
			dmg = (dmg/100) * 150;
		} else if(gegner instanceof Blatt) {
			System.out.println(wasserAttacke() + " war nicht sehr effektiv!");
			dmg = (dmg/100) * 50;
		}
		gegner.setHp(gegner.getHp() - dmg);

	}	
}
