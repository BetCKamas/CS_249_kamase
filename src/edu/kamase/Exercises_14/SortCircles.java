package edu.kamase.Exercises_14;
import java.util.*;

public class SortCircles {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        Circle [] myCircles = new Circle[5];

        for(int i = 0; i<myCircles.length; i++){
            System.out.println("Enter radius for circle " + i + ":");
        }

        input.close();
    }
    
}
