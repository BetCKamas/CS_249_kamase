package edu.kamase.midterm;

import java.util.*;

public class Fang {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("FOR THE EMPEROR");
        System.err.println("Woof.");
        
        System.out.println("Enter seed value: ");
        int seedVal = input.nextInt();
        Random rand = new Random(seedVal);
        double odds = rand.nextDouble();
        System.out.println("odds: " + odds);

        input.close();
    }
    
}
