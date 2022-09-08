/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1ex1;

public class Q1Ex1 {
    public static void main(String[] args) {
        // Re:Zero
	String anime1Name = "Re: Zero";
	int anime1Release = 2016;
	int anime1Episodes = 50;
        
	// AoT
	String anime2Name = "Attack on Titan";
	int anime2Release = 2013;
	int anime2Episodes = 87;
        
	// JJK
	String anime3Name = "Jujutsu Kaisen";
	int anime3Release = 2020;
	int anime3Episodes = 24;

        // Comparisons
        int totalEpisodes = anime1Episodes + anime2Episodes + anime3Episodes;
	boolean ageCompare = anime3Release < anime1Release;
	boolean lengthCompare = anime2Episodes > anime3Episodes;

        System.out.println("How many episodes are there in total? " + totalEpisodes);
        System.out.println("Is JJK older than Re:Zero? " + ageCompare);
	System.out.println("Is AoT longer than JJK? " + lengthCompare);
    }
    
}
