public class FireType extends Monster {
	public FireType(String n, int h, int base) {
		super(n, "Fire", "Grass", "Water", h, base);
		this.atk = (int)(base*1.3);
		this.def = (int)(base*0.7);
	}

	public void special () {
		this.atk += 2;
		this.hp -= (int)(this.getMaxHP()*0.1);
	}
}