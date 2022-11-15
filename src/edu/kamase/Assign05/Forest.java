package edu.kamase.Assign05;

public class Forest {
    public Giant createGiant(String name, String typeName){

    }
    public boolean addGiant(String name, String typeName){

    }
    public Giant getGiant(int index){

    }
    public void printAllGiants(){
        System.out.println("ALL GIANTS:");
        for(Giant g: ){
            System.out.println("-" + g.toString());
        }
    }
    public void printAllTrees(){
        System.out.println("ALL TREES:");
        for(Giant t: ){
            System.out.println("-" + t.toString() + t.speak());
        }
    }
    public void printAllTrolls(){
        System.out.println("ALL TROLLS:");
        for(Giant r: ){
            System.out.println("-" + r.toString() + r.cook());
        }
    }
}
