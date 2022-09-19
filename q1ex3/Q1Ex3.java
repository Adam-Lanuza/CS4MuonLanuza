package q1ex3;

public class Q1Ex3 {
	public static void main(String[] args) {
		// Part 1
		food banana = new food("Banana", "sweet");
		food coffee = new food("Coffee", "bitter");
		food fries = new food("Fries", "salty");

		// Part 2
		song believer = new song("Believer", "Imagine Dragons", 204);
		song radioactive = new song("Radioactive", "Imagine Dragons", 186);
		
		// Part 3
		singer imagineDragons = new singer("Imagine Dragons");

		imagineDragons.changeFavoriteSong(believer);

		imagineDragons.performForAudience(12);

		imagineDragons.changeFavoriteSong(radioactive);
	}
}
