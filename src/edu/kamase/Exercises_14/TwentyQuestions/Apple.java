package edu.kamase.Exercises_14.TwentyQuestions;

public class Apple implements Edible,Flammable{
    public String howToEat(){
        return "pie";
    }
    public String howToIgnite(){
        return "stove";
    }
    public String howToBurn(){
        return "keep in stove too long";
    }
    public String howToBurn(double temp){
        double toolong = 5*300/temp;
        return "keep in oven for " + toolong;
    }
}
