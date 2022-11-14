class Main {
	public static void main(String[] args) {
		Trainer Adam = new Trainer("Adam");
		FireType Charmander = new FireType("Charmander", 50, 15);
		NPC Joe = new NPC("Joe");
		Location Undella = new Location("Undella Town", "Pizza");
	
		Adam.inspect(Charmander);
		Adam.inspect(Joe);
		Adam.inspect(Undella);
	}
}