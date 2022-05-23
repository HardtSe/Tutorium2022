
public class Bisasam extends Pokemon implements Blatt {

	public Bisasam() {
		super(150, 10);
		setName("Bisasam");
	}
	
	public Bisasam(int hp, int level) {
		super(hp, level);
		setName("Bisasam");
	}

	@Override
	public String blattAttacke() {
		// TODO Auto-generated method stub
		return "Rasierblatt";
	}

	@Override
	public void attack(Pokemon gegner) {
		float dmg = 50 + getLevel();
		System.out.println(this.getName() + " führt " + blattAttacke() + " aus!");
		if(gegner instanceof Wasser) {
			// dmg 150%
			System.out.println(blattAttacke() + " war sehr effektiv!");
			dmg = (dmg/100) * 150;
		} else if(gegner instanceof Feuer) {
			System.out.println(blattAttacke() + " war nicht sehr effektiv!");
			dmg = (dmg/100) * 50;
		}
		gegner.setHp(gegner.getHp() - dmg);

	}	

}
