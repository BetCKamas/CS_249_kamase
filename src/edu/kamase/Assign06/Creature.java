package edu.kamase.Assign06;
import java.util.*;

public abstract class Creature implements Drawable,Loadable{
    protected int row = 0;
    protected int col = 0;
    protected Creature(){

    }
    protected Creature(int row, int col){
        this.row = row;
        this.col = col;
    }
    public int getRow(){
        return row;
    }
    public int getCol(){
        return col;
    }
    public void setRow(int row){
        this.row = row;
    }
    public void setCol(int col){
        this.col = col;
    }
    public void load(Scanner input)throws GameFileException{

    }    
}
