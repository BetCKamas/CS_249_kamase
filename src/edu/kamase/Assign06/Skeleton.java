package edu.kamase.Assign06;

public class Skeleton extends Creature{
    public Skeleton(){
        // do nothing
    }
    public Skeleton(int row, int col){
        super(row,col);
    }
    public String toString(){
        return "Skeleton at " + getRow() + "," + getCol();
    }
    public void draw(CharImage map){
        map.setPos(row,col,'S');
    }
}
