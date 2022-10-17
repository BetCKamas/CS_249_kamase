package edu.kamase.midterm;

import java.util.*;

public class midterm {
    public static void main (String [] args){
        int i = 5;
        for(i = 1; i < 8; i++) {
            System.out.println("ROLL THE OLD CHARIOT ALONG");
        }

        int radaway = 3;   
        int food = 0;
    
        int radiationLevel = 800;
        int daysStarving = 5;
    
        boolean deathclaw = true;
    
        if ((radaway == 0 && radiationLevel > 450)
            || (food == 0 && daysStarving > 14)
            || deathclaw) {
            System.out.println("That's a shame!");
        }
        else {
            System.out.println("Gee whiz!");
        }

  //      String firstName = null;
/*
        if(firstName != null && firstName.length() > 3) {
            System.out.println("What a long name!");
        }
 */       

        String report = "sublight";

        switch(report) {
            case "phasers":
                System.out.println("NO SHOOT!");
                break;
            case "sublight":
            case "warp":
                System.out.println("NO GO!");
                break;
            case "armor":
            case "shields":
                System.out.println("NO SHIELD!");
                break;
            default:
                System.out.println("ALL GREEN :)");
                break;
        }

     //   String animal = "FISH";
/* 
String petName = switch(animal) {
     case "DOG" -> "Fido";
     case "CAT", "HAMSTER" -> "Fuzzball";
     case "FISH" -> {
          System.out.println("Blub.");
          yield "Bubbles";
     }
     default -> "Bob";
};
*/
System.out.println("And I WILL WALK " + (5 + 0 + 0) + " MILES");

Scanner input = new Scanner(System.in);
String planet = input.next();
System.out.println(planet);
input.close();

 //   double [] measures = new double[4];

    int [] histogram = new int[100];
    for(int k = 0; k < histogram.length; k++){
        histogram[k] = 1;
    }
 //   for(double j: temperatures){
 //       System.out.println(j);
 //   }
}

}
