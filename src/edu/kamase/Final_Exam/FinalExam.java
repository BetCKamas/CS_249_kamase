package edu.kamase.Final_Exam;
import java.util.*;
public class FinalExam extends Exception{
    public static void main(String [] args)throws ArithmeticException{
        int barnacleCnt = 9;
        double barnacleWeight = barnacleCnt;
        int i = 7;
    for(i = 0; i < 4; i++) {
        System.out.println("PLUS ULTRA");
    }

    int radaway = 0;   
    int food = 10;

    int radiationLevel = 300;
    int daysStarving = 5;

    boolean deathclaw = false;

    if ((radaway == 0 && radiationLevel > 450)
        || (food == 0 && daysStarving > 14)
        || deathclaw) {
        System.out.println("That's a shame!");
    }
    else {
        System.out.println("Gee whiz!");
    }


    String report = "shields";

    switch(report) {
        case "phasers":
            System.out.println("NO SHOOT!");
            break;
        case "sublight":
        case "warp":
            System.out.println("NO GO!");
            break;
        case "shields":
            System.out.println("NO SHIELD!");
            break;
        default:
            System.out.println("ALL GREEN :)");
            break;
    }
    ArrayList <Double> list = new ArrayList<Double>();

    try {  
        throw new ArithmeticException();          
    }  
    catch(RuntimeException ex) {  
        System.out.println("RUNTIME");  
    }  
    catch(Exception ex) {  
        System.out.println("EXCEPTION");  
    } 
    
    String animal = "SPIDER";

String petName = switch(animal) {
     case "DOG" -> "Fido";
     case "CAT", "HAMSTER" -> "Fuzzball";
     case "FISH" -> {
          System.out.println("Blub.");
          yield "Bubbles";
     }
     default -> "Bob";
};
System.out.println(petName);

try {
    System.out.println("Gohan...");
    return;
 }
 catch(RuntimeException ex) {
    System.out.println("FASTER!");
 } 
 catch(Exception ex) {
    System.out.println("STOP!");
 } 
 finally {
    System.out.println("DODGE!");
 }

    double [] powerLevels = new double[5]; 
    for(double d:powerLevels){
        System.out.println(d);
    }
 
    final int MAX_LEVEL;
    MAX_LEVEL = 9000;
    
    }
}
