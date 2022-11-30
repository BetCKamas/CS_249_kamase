package edu.kamase.Assign06;
import java.util.*;

public class Item implements Loadable {
    private int value;
    private String ID = "";

    public Item(){

    }
    public Item(String ID, int value){
        this.ID = ID;
        this.value = value;
    }
    public String getID(){
        return ID;
    }
    public int getValue(){
        return value;
    }
    public void setID(String ID){
        this.ID = ID;
    }
    public void setValue(int value){
        this.value = value;
    }
    public String toString(){
        return ID + " with value " + value;
    }
    public void load(Scanner input) throws GameFileException{

    }

}
