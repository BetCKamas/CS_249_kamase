package edu.kamase.Final_Exam;

public class Kitchen {
    public static void main(String [] args){
       Oven maytag = new Oven(3000);
       System.out.println(maytag.getWattage()); 

       System.out.println(Appliance.calculateEnergyUsage(4000, 2.5));

       Appliance stove = new Oven(5000);
       stove.printType();
    }
}
