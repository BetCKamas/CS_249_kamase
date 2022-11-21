package edu.kamase.Exercises_15.Strategy;

public abstract class Bear {
    protected Moveable mbehavior;

    protected Bear(Moveable m){
        mbehavior = m;
    }
    public void perferomMove(){
        mbehavior.move();
    }
    
}
