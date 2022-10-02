package edu.kamase.Assign02;

import java.util.*;

public class VitalStats {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter name:");
        String firstName = input.next();
        String lastName = input.next();

        System.out.println("Enter height in inches:");
        int height = input.nextInt();

        System.out.println("Enter weight in pounds:");

        System.out.println("NAME: " + lastName + ", " + firstName);

        input.close();
        
    }
    
}
