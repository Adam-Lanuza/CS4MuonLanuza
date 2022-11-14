public class WaterType extends Monster {
	public WaterType(String n, int h, int base) {
		super(n, "Water", "Fire", "Grass", h, base);
		this.atk = (int)(base*0.7);
		this.def = (int)(base*1.3);
	}

	public void special () {
		this.def += 2;
		this.hp -= (int)(this.getMaxHP()*0.1);
	}
}