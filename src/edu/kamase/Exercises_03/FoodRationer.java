package edu.kamase.Exercises_03;

import java.util.Scanner;

public class FoodRationer {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter total food:");
        int totalFood = input.nextInt();

        System.out.println("Enter people count:");
        int peopleCount = input.nextInt();

        System.out.println("Enter rations:");
        double rations = input.nextDouble();

        double foodPerDay = peopleCount*rations;
        int days = (int)(totalFood/foodPerDay);

        System.out.println("Days Left: " + days);

        input.close();
    }
    
}
