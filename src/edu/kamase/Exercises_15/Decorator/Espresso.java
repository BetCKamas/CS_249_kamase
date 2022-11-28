package edu.kamase.Exercises_15.Decorator;

public class Espresso extends Beverage{
    public Espresso(){
        super("espresso");
    }
    @Override
    public double cost(){
        return 1.99;
    }
    
}
