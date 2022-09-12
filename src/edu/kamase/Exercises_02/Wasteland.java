package edu.kamase.Exercises_02;

public class Wasteland {
    public static void main(String [] args){
        NPC bob = new NPC();
        NPC sue = new NPC();
        
        bob.setHealth(78);
        sue.setHealth(91);

        System.out.println("Bob: " + bob.getHealth());
        System.out.println("Sue: " + sue.getHealth());
    }
    
}
