/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1ex2;
import java.util.Scanner;
/**
 *
 * @author MUON
 */
public class Q1Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Configure settings Variables
        int minValue = 1;
        int maxValue = 10;
        int range = maxValue - minValue + 1;
        int tries = 3;
        
        int random = (int) Math.floor(Math.random()*range) + minValue;
        
        while (true) {
            System.out.print("Welcome to Higher or Lower! What will you do? \n"
                    + "-Start game \n"
                    + "-Configure settings \n"
                    + "-End application \n");
            
            String playerGameChoice = sc.nextLine();
            
            if (playerGameChoice.equalsIgnoreCase("start game")) {
                String continueGame = "n";
                do {
                    System.out.print("Play again? ");
                    continueGame = sc.nextLine();
                } while(continueGame.equalsIgnoreCase("y"));
            }
            else if (playerGameChoice.equalsIgnoreCase("change settings")) {
                System.out.println("Change settings");
            }
            else if (playerGameChoice.equalsIgnoreCase("end application")){
                System.out.println("End application");
                break;
            }
            else {
                System.out.println("Please try again");
            }
        }
    }
    
}
