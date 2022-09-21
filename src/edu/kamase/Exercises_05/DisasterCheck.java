package edu.kamase.Exercises_05;

public class DisasterCheck {
    public static void main(String [] args){
        Disaster d = Disaster.LOST_FOOD;

        switch(d){
            case CHOLERA, DYSENTERY -> System.out.println("You are sick!");
            case WAGON_AXLE_BROKEN, WAGON_WHEEL_BROKEN -> System.out.println("Wagon stuck!");
            case LOST_FOOD -> {
                System.out.println("We are going to starve!");
                System.out.println("What will we do?");
                }
            default -> System.out.println("All good!");
            
        }

        int totalFood = 100;
        String statusReport = switch(d) {
            case DYSENTERY, CHOLERA-> "You are sick!";
            case WAGON_AXLE_BROKEN, WAGON_WHEEL_BROKEN -> "Equipment failure!";
            case LOST_FOOD ->{
                totalFood = totalFood - 10;
                yield "Food lost!";
            } 
            default -> "All good!"; 
        };
        System.out.println(statusReport);


    }
    
}
