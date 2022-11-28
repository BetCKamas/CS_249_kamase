package edu.kamase.Exercises_15.Decorator;

public class DarkRoast extends Beverage{
    public DarkRoast(){
        super("Dark Roast");
    }
    @Override
    public double cost(){
        return 0.99;
    }
    
}
