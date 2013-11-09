/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpg;

/**
 * The Knight class.
 * @author Vuk
 */
public class Knight {
    String name;
    int hp;
    int mana;
    int strength;
    int vitality;
    int energy;
    
//Knight class constructor.
//Arbitrarily chosen starting stats based on
//what would make sense for this job class
    
    Knight (String cName){
        name = cName;
        hp = 100;
        mana = 20;
        strength = 10;
        vitality = 7;    
        energy = 2;
    }

//output the stats of the user's Knight character
    public void outputStats (){
        System.out.println("Your knight's stats:");
        System.out.println("HP = " + hp);
        System.out.println("Mana = " + mana);
        System.out.println("Strength = " + strength);
        System.out.println("Vitality = " + vitality);
        System.out.println("Energy = " + energy);
    }
}
