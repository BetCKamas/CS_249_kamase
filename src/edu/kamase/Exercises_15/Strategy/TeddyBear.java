package edu.kamase.Exercises_15.Strategy;

public class TeddyBear extends Bear {
    public TeddyBear(){
        super(new NoMove());
    }
    
}
