import java.util.ArrayList;

/*
----- All Changes -----
1. Set hp, atk, and def as protected so that special buffs can be easilly added or removed
2. Added getType(), getGuard(), and clearGuard() methods since those are locked behind private access
3. Made m change through methods instead of directly changing it since I can't access m's private variables
*/

public abstract class Monster implements Interactive {
	private final String name, type, strongAgainst, weakAgainst;
	private int maxHP, xp, lvl;
	protected int hp, atk, def; // Set hp, atk, and def as protected so that special buffs can be easilly added or removed
	private boolean guard, charge;
	private static ArrayList<Monster> monsterList = new ArrayList<>();

	public Monster(String n, String t, String s, String w, int m, int base){
		name = n;
		type = t;
		strongAgainst = s;
		weakAgainst = w;
		maxHP = m;
		hp = m;
		atk = base;
		def = base;
		xp = 0;
		lvl = 1;
		monsterList.add(this);
		guard = false;
		charge = false;
	}

	public String getName() {
		return name;
	}
	public int getMaxHP() {
		return maxHP;
	}
	public int getHP() {
		return hp;
	}
	public int getAtk() {
		return atk;
	}
	public int getDef() {
		return def;
	}
	public static ArrayList<Monster> getMonsterList() {
		return monsterList;
	}
	// Added a getType method which returns the monster's type
	public String getType () {
		return this.type;
	}
	// Added a getGuard method since the enemy monster's guard status has private access
	public boolean getGuard() {
		return guard;
	}
	
	public void attack(Monster m){
		int damage = (int) ((atk*atk)/(double)(atk+m.getDef()));
		// damage is calculated as double, then cast as int
		boolean strong = false, weak = false;
		if(strongAgainst.equals(m.getType())){
		// Used m.getType() since m.type is private
			damage *= 2;
			strong = true;
		}
		if(weakAgainst.equals(m.getType())){
			damage *= 0.5;
			weak = true;
		}
		if(m.getGuard()){
			m.clearGuard();
			damage *= 0.7;
		}
		if(charge){
			charge = false;
			damage *= 1.3;
		}
		m.hp -= damage;
		if(m.getHP() < 0) m.hp = 0;
			System.out.println(name  + " attacked " + m.getName() +
			" and dealt " + damage + " damage, reducing it to " + m.getHP() + "HP.");
		if(strong) System.out.println("It was super effective!");
		if(weak) System.out.println("It wasn't very effective...");
		
		gainXP(2); // every attack raises XP by 2

		if(m.getHP() <= 0){
			System.out.println(m.getName() + " fainted.");
			gainXP(10); // defeating a monster raises XP by 10
		}
	}

	public void guard(){
		guard = true;
		System.out.println(name + " put up its guard. It will receive 30% less damage on the next attack.");
	}

	// Added a clearGuard() method since guard can't be resest to false outside of the monster due to private access
	public void clearGuard() {
		guard = false;
	}
	
	public void charge(){
		charge = true;
		System.out.println(name + " charged. Its next attack will do 30% more damage.");
	}

	public void rest(){
		hp += maxHP * 0.15;
		if(hp > maxHP) hp = maxHP;
		System.out.println(name + " rested. It's health is now " + hp + ".");
	}
	
	public abstract void special();

	public void resetHealth(){
		hp = maxHP;
	}

	// handles all increases in XP
	private void gainXP(int i){
		xp += i;
		if(xp >= 100){
			xp %= 100;
			lvl++;
			maxHP += 5;
			hp += 5;
			atk += 2;
			def += 2;
			System.out.println(name + " levelled up to " + lvl + "!");
		}
	}

	// Excercise 7 New Code
	public void interact(){
		System.out.println("Monster Name: " + name + "\nMonster Type: " + type);
	}
}
