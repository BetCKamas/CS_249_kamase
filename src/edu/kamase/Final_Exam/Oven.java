package edu.kamase.Final_Exam;

public class Oven extends Appliance{

    public Oven(int w){
        super(w);
    }

    public void printType(){
        System.out.println("OVEN");
    }

    public void run(double hours){
        System.out.println("COOKING FOR " + hours + " HOURS!");
        double energy = Appliance.calculateEnergyUsage(getWattage(), hours);
        System.out.println("USED " + energy + " WATT-HOURS!");
    }
    
}
