public class food {
    private String name, taste;
    private double rating;
	private int numOfRatings;
    
    public food(String name, String taste) {
        this.name = name;
        this.taste = taste;
        this.rating = 0.00;
    }
	// Getter Methods
	public String getName(){
		return this.name;
	}
	public String getTaste(){
		return this.taste;
	}
	public double getRating(){
		return this.rating;
	}
	
	// Setter Methods
	public void changeName(String newName){
		this.name = newName;
	}
	public void changeTaste(String newTaste){
		this.taste = newTaste;
	}
	public void overloadRating(double newRating){
		// Completely changes the rating based on its input;
		this.rating = newRating;
		this.numOfRatings = 1;
	}
	public void addReview(double review) {
		// Updates the rating by getting the new rating and averaging it out with the old ratings
		this.numOfRatings++;
        this.rating = ((this.rating*(this.numOfRatings-1))+review)/this.numOfRatings;
		// review is multiplied to numOfRatings to get the sum of all previous ratings
		
    }

	// Other Methods
	public void display(String methodTitle, String methodValue){
		System.out.println(methodTitle + ": " + methodValue);
	}
	public void displayAll(){
		this.display("Food", this.getName());
		this.display("Taste", this.getTaste());
		this.display("Rating", Double.toString(this.getRating()));
		System.out.print("\n");
	}
}