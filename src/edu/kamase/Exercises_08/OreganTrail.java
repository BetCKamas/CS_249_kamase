package edu.kamase.Exercises_08;

import java.util.*;



public class OreganTrail {
    
    public static String [] getPartyNames(Scanner input){
        System.out.println("Enter party count:");
        int cnt = input.nextInt();

        String [] names = new String[cnt];

        System.out.println("Enter names:");
        for(int i = 0; i < cnt; i++){
            names[i] = input.next();
        }

        return names;
        
    }
    public static String pickRandomString(String [] data){
        int randIndex = (int)(Math.random()*data.length);
        return data[randIndex];
   }
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        // Get names from user
        String [] names = getPartyNames(input);

        // Creat Disaster list
        String [] disasters = { "a broken leg",
                                "dystentery",
                                "bitten by zombie",
                                "a gunshot wound"};

        // Pick random person
        int days = 10;
        for(int i = 0; i < days; i++){
            System.out.println("** DAY " + i + " **");
            String currentPerson = pickRandomString(names);

            // Pick random disaster

            String currentDisaster = pickRandomString(disasters);

            // Print results
            System.out.println(currentPerson + " has " + currentDisaster);
        }

        input.close();

    }


    
}
