package edu.kamase.Exercises_15.Observer;

public class Superperson {
    private String name = "";

    public Superperson(String name){
        this.name = name;
    }
    public void update(Subject s){
        if(s instanceof Batsignal b){
            String crime = b.getActiveCrime();
            System.out.println("Not my jurisdiction but, This is "+ name + ", responding to " + crime);
        }
    }
    
}
