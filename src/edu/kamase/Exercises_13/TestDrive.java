package edu.kamase.Exercises_13;

public class TestDrive {
    public static void drive(Car c){
        // if c cannot be null
       /* try{
            System.out.println("I like driving my " + c.getMake());
        }
        catch(Exception e){
            System.out.println("I hate driving");
        }
        */
        
        // if c can be null
        if(c != null){
            System.out.println("I like driving my " + c.getMake());
        }
        else{
            System.out.println("I hate driving");
        }
    
    }
    public static void main(String [] args){
        Car myCar = new Car("Subaru");
        drive(myCar);
        drive(null);

    }
    
}
