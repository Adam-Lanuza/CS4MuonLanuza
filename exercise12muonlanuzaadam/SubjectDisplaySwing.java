package exercise12muonlanuzaadam;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class SubjectDisplaySwing extends JFrame{
	SubjectDisplaySwing(ArrayList<Subject> subjects) {
		super("Exercise 12: Muon-Lanuza, Adam");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(450,450);

		this.setLayout(new BorderLayout());
		JPanel main = new JPanel();
		JPanel south = new JPanel();
		JPanel subjectInfo = new JPanel();
		
		main.setLayout(new FlowLayout());
		subjectInfo.setLayout(new BoxLayout(subjectInfo, BoxLayout.Y_AXIS));
		south.setLayout(new FlowLayout());
		
		this.add(main, BorderLayout.CENTER);
		this.add(south, BorderLayout.SOUTH);
		
		// SubjectIndex can be changed to get the subject you want to display
		int subjectIndex = 0; 
		
		JLabel subjectLogo = new JLabel();
		ImageIcon logo = new ImageIcon(Exercise12MuonLanuzaAdam.class.getResource(subjects.get(subjectIndex).getImgFileName()));
		subjectLogo.setIcon(logo);
		
		main.add(subjectLogo);
		
		JLabel subjectName = new JLabel("Name: " + subjects.get(subjectIndex).getName());
		JLabel subjectUnits = new JLabel("Units: " + subjects.get(subjectIndex).getUnits());
		JLabel subjectGrade = new JLabel("Grade: " + subjects.get(subjectIndex).getGrade());
		
		int fontSize = 15;
		
		subjectName.setFont(new Font("Sans-Serif", Font.BOLD, fontSize));
		subjectUnits.setFont(new Font("Sans-Serif", Font.BOLD, fontSize));
		subjectGrade.setFont(new Font("Sans-Serif", Font.BOLD, fontSize));
		
		// Details are placed into the subjectInfo panel
		subjectInfo.add(subjectName);
		subjectInfo.add(subjectUnits);
		subjectInfo.add(subjectGrade);
		
		main.add(subjectInfo); // Subject info is only added here so that the image is placed first on the left followed by the information on the right

		JButton nextSubjectButton = new JButton("Next");
		south.add(nextSubjectButton);

		this.setVisible(true);
	}
}
