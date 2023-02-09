package exercise12muonlanuzaadam;

import java.util.ArrayList;

public class Subject {
	private String name, imgFileName;
	private double units, grade;
	private static ArrayList<Subject> subjects = new ArrayList<>();

	public Subject(String n, String i, double u, double g) {
		name = n;
		imgFileName = i;
		units = u;
		grade = g;
		subjects.add(this);
	}

	public String getName() {
		return name;
	}
	public String getImgFileName() {
		return imgFileName;
	}
	public double getUnits() {
		return units;
	}
	public static ArrayList<Subject> getAllSubjects() {
		return subjects;
	}
	public double getGrade() {
		return grade;
	}
	
	public void setUnits(double units) {
		units = units;
	}
	public void setGrade(double grade) {
		grade = grade;
	}
}
