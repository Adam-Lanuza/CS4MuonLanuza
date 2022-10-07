import java.util.Scanner;

public class Q1Ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Part 1
		food banana = new food("Banana", "sweet");
		banana.overloadRating(3.00);
		banana.displayAll();

		// Part 2
		song believer = new song("Believer", "Imagine Dragons", 204);
		song radioactive = new song("Radioactive", "Imagine Dragons", 186);
		song rickroll = new song("Never Gonna Give You Up", "Rick Astley", 420);
		
		// Part 3
		singer imagineDragons = new singer("Imagine Dragons");
		singer rickAstley = new singer("Rick Astley");
			
		imagineDragons.changeFavSong(believer);
		rickAstley.changeFavSong(rickroll);
		imagineDragons.displayAll();
		rickAstley.displayAll();
	}
}