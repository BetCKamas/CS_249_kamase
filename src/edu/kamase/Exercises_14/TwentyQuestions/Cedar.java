package edu.kamase.Exercises_14.TwentyQuestions;

public class Cedar extends Plant implements Flammable{
    public String howToIgnite(){
        return "campfire";
    }
    public String howToBurn(){
        return "big bonfire";
    }
    public String howToBurn(double temp){
        double toolong = 5*300/temp;
        return "keep in fire for " + toolong;
    }
    
}
