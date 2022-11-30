package edu.kamase.Assign06;

public class Rat extends Creature{
    public Rat(){
        // do nothing
    }
    public Rat(int row, int col){
        super(row, col);
    }
    public String toString(){
        return "Rat at " + getRow() + "," + getCol();
    }
    public void draw(CharImage map){
        map.setPos(row, col, 'R');
    }
}
