public class GrassType extends Monster {
	public GrassType(String n, int h, int base) {
		super(n, "Grass", "Water", "Fire", h, base);
	}

	public void special () {
		this.hp += (int)(0.2*this.getMaxHP());
	}

	public void rest () {
		this.hp += 0.5*this.getMaxHP();
		if(this.getHP() > this.getMaxHP()) {
			this.hp = this.getMaxHP();
		}
		System.out.println(this.getName() + " rested. It's health is now " + this.getHP() + ".");
	}
}