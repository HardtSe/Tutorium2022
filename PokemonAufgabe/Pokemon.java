
public abstract class Pokemon {
	private String name;
	private float hp;
	private int level;
	
	public Pokemon(int hp, int level) {
		this.setHp(hp);
		this.setLevel(level);
	}
	
	public abstract void attack(Pokemon gegner);
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public float getHp() {
		return hp;
	}

	public void setHp(float hp) {
		this.hp = hp;
	}
}
