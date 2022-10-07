public class singer {
	private String name;
	static private int noOfPerformances;
	private double earnings;
	private song favoriteSong;

	public singer(String name) {
		this.name = name;
		this.noOfPerformances = 0;
		this.earnings = 0;
	}

	// Getter Methods
	public String getName() {
		return this.name;
	}
	public int getNoOfPerformances() {
		return this.noOfPerformances;
	}
	public double getEarnings() {
		return this.earnings;
	}
	public song getFavSong() {
		return this.favoriteSong;
	}

	// Setter Methods
	public void changeSinger(String newName) {
		this.name = newName;
		if (this.favoriteSong != null) {
			// Also updates the name of the artist that can be found in favortieSong but only if favoriteSong is set
			this.favoriteSong.changeArtist(newName);
		}
	}
	public void bonusEarnings(double bonus){
		// Adds a bonus instead of manually changing earnings since you don't generally need to hard reset the earning count
		this.earnings += bonus;
	}
	public void changeFavSong(song songTitle) {
		this.favoriteSong = songTitle;
	}
	public void performForAudience(int audience) {
		this.noOfPerformances++;
		this.earnings += (audience * 100);
	}
	public void performForAudience(singer costar, int audience) {
		this.noOfPerformances++;
		this.earnings += (audience * 50);
		costar.earnings += (audience * 50);
	}

	//Other Methods
	public void display(String methodTitle, String methodValue){
		System.out.println(methodTitle + ": " + methodValue);
	}
	public void displayAll(){
		this.display("Name", this.getName());
		this.display("Number of Performances", Integer.toString(this.getNoOfPerformances()));
		this.display("Earnings", Double.toString(this.getEarnings()));
		this.favoriteSong.displayAll();
		System.out.print("\n");
	}
}