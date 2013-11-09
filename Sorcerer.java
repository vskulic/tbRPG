/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpg;

/**
 *
 * @author Vuk
 */
public class Sorcerer {
    String name;
    int hp;
    int mana;
    int strength;
    int vitality;
    int energy;
    
//Sorcerer class constructor.
//Arbitrarily chosen starting stats based on
//what would make sense for this job class
    Sorcerer (String cName){
        name = cName;
        hp = 20;
        mana = 100;    
        strength = 2;
        vitality = 4;
        energy = 10;
    }
    
//output the stats of the user's Sorcerer character
    public void outputStats (){
        System.out.println("Your sorcerer's stats:");
        System.out.println("HP = " + hp);
        System.out.println("Mana = " + mana);
        System.out.println("Strength = " + strength);
        System.out.println("Vitality = " + vitality);
        System.out.println("Energy = " + energy);
    }
}
