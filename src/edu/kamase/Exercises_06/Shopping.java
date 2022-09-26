package edu.kamase.Exercises_06;

import java.util.*;

public class Shopping {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
       
        boolean  keepShopping = true;
        Supplies supplies = new Supplies();

        do {
            System.out.println("What would you like to buy?");
            int cnt = input.nextInt();
            String item = input.next();
            item = item.toLowerCase();

            if(cnt == 0){
                //break;
                keepShopping = false;
            }

            switch(item) {
                case "food" ->{
                    if(!supplies.addFood(cnt)){
                        System.out.println("You do not have enough food!");
                        keepShopping = false;
                    }
                } 
                case "bullet", "bullets" -> {
                    if(!supplies.addBullets(cnt)){
                        System.out.println("You do not have enough bullets!");
                        keepShopping = false;
                    }
                }    
                case "axle", "axles" -> {
                    if(!supplies.addAxles(cnt)){
                        System.out.println("You do not have enough axles!");
                        keepShopping = false;
                    }
                }
                default -> {
                    System.out.println("I'm sorry, we do not carry " + item + "!");
                    keepShopping = false;
                }  
            }

            System.out.println(supplies);
  

        } while (keepShopping);

        input.close(); 
    }

}
