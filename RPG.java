/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpg;
import java.util.Scanner;

/**
 *
 * @author Vuk
 */
public class RPG {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String jobClass;
        String charName;
        System.out.println("Welcome to Vuk's Text-based Adventure!");
        System.out.println("Hope you enjoy the ride!");

        Scanner read = new Scanner (System.in);

        System.out.println("Choose from one of the following job classes:\n");
        System.out.println("Knight - 'k'");
        System.out.println("Sorcerer - 's'");
        System.out.println("Monk - 'm'");

        System.out.println("Enter your character's job class (or 'd' for details):");
        jobClass = read.next();
        
        if (jobClass.equals("k") == true) {
            System.out.println("Enter your character's name:");
            charName = read.next();
            Knight aKnight = new Knight(charName);
            System.out.println("A knight named '" + charName + "'! Solid choice!");
            aKnight.outputStats();
        }
        
        else if (jobClass.equals("s") == true) {
            System.out.println("Enter your character's name:");
            charName = read.next();
            Sorcerer aSorc = new Sorcerer(charName);
            System.out.println("A sorcerer named '" + charName + "'! Solid choice!");
            aSorc.outputStats();
        }
        
        else if (jobClass.equals("m") == true) {
            System.out.println("Enter your character's name:");
            charName = read.next();
            Monk aMonk = new Monk(charName);
            System.out.println("A monk named '" + charName + "'! Solid choice!");
            aMonk.outputStats();
        }
        
        else if (jobClass.equals("d") == true) {
            System.out.println("Class details:\n");
            System.out.println("To be added. Check class source files.\n");
        }
        else {
            System.out.println("You have not entered a valid choice!");
        }
            
    }
    

}