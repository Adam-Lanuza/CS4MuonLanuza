package exercise12muonlanuzaadam;

import javax.swing.*;
import java.awt.*;

public class Exercise12MuonLanuzaAdam {
	public static void main(String[] args) {
		Subject math = new Subject("Math", "math.png", 4, 1.75);
		Subject bio = new Subject("Biology", "biology.png", 3, 2.0);
		Subject chem = new Subject("Chemistry", "chemistry.png", 3, 1.5);
		Subject physics = new Subject("Physics", "physics.png", 3, 1.75);
		Subject cs = new Subject("CS", "computer science.png", 1, 1.5);
		
		new SubjectDisplaySwing(Subject.getAllSubjects());
	}
}
