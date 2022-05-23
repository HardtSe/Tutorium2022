public class Glumanda extends Pokemon implements Feuer{

	public Glumanda(int hp, int level) {
		super(hp, level);
		setName("Glumanda");
	}
	
	public Glumanda(int hp, int level, String name) {
		super(hp, level);
		setName(name);
	}
	
	public String feuerAttacke() {
		return "Glut";
	}

	@Override
	public void attack(Pokemon gegner) {
		float dmg = 50 + getLevel();
		System.out.println(feuerAttacke() + " wird ausgeführt!");
		if(gegner instanceof Blatt) {
			// dmg 150%
			// Glut war sehr effektiv!
			System.out.println(feuerAttacke() + " war sehr effektiv!");
			dmg = (dmg/100) * 150;
		} else if(gegner instanceof Wasser) {
			System.out.println(feuerAttacke() + " war nicht sehr effektiv!");
			dmg = (dmg/100) * 50;
		}
		gegner.setHp(gegner.getHp() - dmg);
	}

}
