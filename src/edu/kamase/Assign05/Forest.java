package edu.kamase.Assign05;
import java.util.*;

public class Forest {
    private ArrayList<Giant> tallBoys = new ArrayList<Giant>();
    public Giant createGiant(String name, String typeName){
        Giant boy;

        if(name == ""){
            return null;
        }
        switch(typeName){
            case "GIANT" -> boy = new Giant(name);
            case "TROLL" -> boy = new Troll(name);
            case "TREE" -> boy = new Tree(name);
            case "ENT" -> boy = new Ent(name);
            case "HUORN" -> boy = new Huorn(name);
            default -> boy = null;
        }
        return boy;

    }
    public boolean addGiant(String name, String typeName){
        boolean validGiant = false;
        Giant g = createGiant(name, typeName);
        if(g != null){
            tallBoys.add(g);
            validGiant = true;
        }
        return validGiant;
    }
    public Giant getGiant(int index){
        if(index >= 0 && index < tallBoys.size()){
            return tallBoys.get(index);
        }
        else{
            return null;
        }
    }
    public void printAllGiants(){
        System.out.println("ALL GIANTS:");
        for(Giant g: tallBoys){
            System.out.println("- " + g.toString());
        }
    }
    public void printAllTrees(){
        System.out.println("ALL TREES:");
        for(Giant t: tallBoys){
            if(t instanceof Tree x){
                System.out.println("- " + x.toString() + ": "+ x.speak());
            }
        }
    }
    public void printAllTrolls(){
        System.out.println("ALL TROLLS:");
        for(Giant r: tallBoys){
            if(r instanceof Troll y){
                System.out.println("- " + y.toString() + ": " + y.cook());
            }
        }
    }
}
