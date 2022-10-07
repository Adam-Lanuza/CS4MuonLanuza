public class song {
	private String title, artist;
	private int duration;

	public song(String title, String artist, int duration) {
		this.title = title;
		this.artist = artist;
		this.duration = duration;
	}

	// Getter Methods
	public String getTitle(){
		return this.title;
	}
	public String getArtist(){
		return this.artist;
	}
	public int getDuration(){
		return this.duration;
	}

	// Setter Methods
	public void changeTitle(String newTitle){
		this.title = newTitle;
	}
	public void changeArtist(String newArtist){
		this.artist = newArtist;
	}
	public void changeDuration(int newDuration){
		this.duration = newDuration;
	}

	// Other Methods
	public void display(String methodTitle, String methodValue){
		System.out.println(methodTitle + ": " + methodValue);
	}
	public void displayAll(){
		this.display("Title", this.getTitle());
		this.display("Artist", this.getArtist());
		this.display("Duration", Integer.toString(this.getDuration()));
	}
}