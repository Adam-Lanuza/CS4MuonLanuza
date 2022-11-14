class Main {
	public static void main(String[] args) {
		FireType Charmander = new FireType("Charmander", 50, 15);

		System.out.print("\n\nName: " + Charmander.getName() +
				"\nMax HP: " + Charmander.getMaxHP() +
				"\nAttack: " + Charmander.getAtk() +
				"\nDefense: " + Charmander.getDef());

		GrassType Bulbasaur = new GrassType("Bulbasaur", 50, 15);

		System.out.print("\n\nName: " + Bulbasaur.getName() +
				"\nMax HP: " + Bulbasaur.getMaxHP() +
				"\nAttack: " + Bulbasaur.getAtk() +
				"\nDefense: " + Bulbasaur.getDef());

		WaterType Squirtle = new WaterType("Squirtle", 50, 15);

		System.out.print("\n\nName: " + Squirtle.getName() +
				"\nMax HP: " + Squirtle.getMaxHP() +
				"\nAttack: " + Squirtle.getAtk() +
				"\nDefense: " + Squirtle.getDef());

		System.out.print("\n\n----------\n");
		while ((Charmander.getHP() > 0) && (Bulbasaur.getHP() > 0)) {
			Charmander.attack(Bulbasaur);
			if (Bulbasaur.getHP() <= 0) {
				break;
			}
			Bulbasaur.attack(Charmander);
		}

		Charmander.resetHealth();
		Bulbasaur.resetHealth();
		Squirtle.resetHealth();

		System.out.print("\n\n----------\n");
		while ((Charmander.getHP() > 0) && (Squirtle.getHP() > 0)) {
			Charmander.attack(Squirtle);
			if (Squirtle.getHP() <= 0) {
				break;
			}
			Squirtle.attack(Charmander);
		}

		Charmander.resetHealth();
		Bulbasaur.resetHealth();
		Squirtle.resetHealth();

		System.out.print("\n\n----------\n");
		while ((Bulbasaur.getHP() > 0) && (Squirtle.getHP() > 0)) {
			Bulbasaur.attack(Squirtle);
			if (Squirtle.getHP() <= 0) {
				break;
			}
			Squirtle.attack(Bulbasaur);
		}
	}
}