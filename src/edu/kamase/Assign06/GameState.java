package edu.kamase.Assign06;
import edu.kamase.Assign04.CharImage; 

import java.io.PrintWriter;
import java.util.*;

public class GameState implements Loadable {
    private CharImage map = new CharImage(12,30,'.');
    private ArrayList<Loadable> fellows = new ArrayList<>();

    public Loadable createLoadable(String typeName) throws GameFileException{
        if(typeName.equals("Skeleton")){
            return new Skeleton();
        }
        else if(typeName.equals("Rat")){
            return new Rat();
        }
        else if(typeName.equals("Item")){
            return new Item();
        }
        else if(typeName.equals("Book")){
            return new Book();
        }
        else{
            throw new GameFileException("Unknown type: " + typeName);
        }

    }
    public void load(Scanner input) throws GameFileException{
        map.clear();
        fellows.clear();
        int lineNum = input.nextInt();
        for(int i = 0; i < lineNum; i++){
            String typeName = input.next();
            Loadable m = createLoadable(typeName);
            m.load(input);
            fellows.add(m);
            if(m instanceof Drawable d){
                d.draw(map);
            }
        }
    }
    public String toString(){
        String status = "MAP:\n" + map.getMapString() + "\nCREATURES:\n";
        for(Loadable l: fellows){
            if(l instanceof Creature c){
                status += c.toString() + "\n";
            }
        }
        status += "INVENTORY:\n";
        for(Loadable f: fellows){
            if(f instanceof Item i){
                status += i.toString() + "\n";
            }
        }
        return status;
    }
    public void save(String filename)throws GameFileException{
        try{
           PrintWriter writer = new PrintWriter(filename);
           writer.print(this.toString());
           writer.close();
        }
        catch(Exception e){
            throw new GameFileException("Failed to save file!", e);
        }
    }
}
