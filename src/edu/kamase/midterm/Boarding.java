package edu.kamase.midterm;

public class Boarding {
    public static void main(String [] args){
        Boat enterprise = new Boat(301);

        System.out.println("weight of people on the enterprise: " + enterprise.getPeopleWeight());

        System.out.println("weight of 120 people on a boat: " + Boat.computePeopleWeight(120));
    
    }
    
}
