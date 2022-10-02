package edu.kamase.Assign02;

import java.util.*;

public class VitalStats {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);

        int feet = 12;
        
        System.out.println("Enter name:"); // Get input for name
        String firstName = input.next();
        String lastName = input.next();

        System.out.println("Enter height in inches:"); // Get input for height
        int totalHeight = input.nextInt();
        int heightFt = totalHeight / feet; // Calculate feet
        int heightInch = totalHeight % feet; // Calculate inches

        System.out.println("Enter weight in pounds:"); // Get input for weight
        double weight = input.nextDouble();
        int BMI = (int)((703 * weight) / (totalHeight * totalHeight)); // Calculate BMI
        
        System.out.println("NAME: " + lastName + ", " + firstName); // Print everything out
        System.out.println("WEIGHT: " + weight + " lbs.");
        System.out.println("HEIGHT: " + heightFt + "'-" + heightInch + "\"" );
        System.out.println("BMI: " + BMI);

        input.close(); // Close scanner object
        
    }
    
}
