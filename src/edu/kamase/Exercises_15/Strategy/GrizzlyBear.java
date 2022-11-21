package edu.kamase.Exercises_15.Strategy;

public class GrizzlyBear extends Bear {
    public GrizzlyBear(){
        super(new MoveWith4Legs());
    }
    
}
