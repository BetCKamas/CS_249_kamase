package edu.kamase.Final_Exam;

public abstract class Appliance {
    private int wattage = 0;

    protected Appliance(int wattage){
        this.wattage = wattage;
    }

    public int getWattage(){
        return wattage;
    }

    public void printType(){
        System.out.println("UNKNOWN");
    }

    public static double calculateEnergyUsage(int wattage, double hours){
        return wattage*hours;
    }
    public abstract void run(double hours);
}
