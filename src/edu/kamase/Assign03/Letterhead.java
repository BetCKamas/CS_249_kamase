package edu.kamase.Assign03;

public class Letterhead {

    private String [] sloganLines;
    private char boundaryChar;
    private String name;

    public Letterhead(String name, String [] sloganLines, char boundaryChar){
        setName(name);
        setSlogan(sloganLines);
        setBoundaryChar(boundaryChar);
    }

    public String getName(){
        return name;
    }

    public char getBoundaryChar(){
        return boundaryChar;
    }

    public String getSlogan(){
   
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < sloganLines.length; i++){
            sb.append(sloganLines[i] + "\n");
        }
        return sb.toString();
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBoundaryChar(char boundaryChar){
        this.boundaryChar = boundaryChar;
    }

    public void setSlogan(String [] sloganLines){
        this.sloganLines = new String[sloganLines.length];
        for(int i = 0; i < sloganLines.length; i++){
            this.sloganLines[i] = sloganLines[i];
        }

    }

    public String toString(){
        int width = 40;
        int height = 7;
  
        StringBuilder sb = new StringBuilder();

        // first line all boundary chars
        for(int i = 0; i < width; i++){
            sb.append(getBoundaryChar());
        }
        sb.append("\n");
        int curHeight = 1;

        int spaceLength = (width - 3) - name.length();

        // second line starting 
        sb.append(getBoundaryChar() + " " + getName());

        for(int i = 0; i < spaceLength; i++){
            sb.append(" ");
        }

        sb.append(getBoundaryChar() + "\n" + getBoundaryChar());
        curHeight++;

        // third line starting blank except for boundary
        for(int i = 0; i < (width-2); i++){
            sb.append(" ");
        }

        sb.append(getBoundaryChar() + "\n" );
        curHeight++;

        // fourth line starting all slogan lines
        for(int i = 0; i < sloganLines.length; i++){
            sb.append(getBoundaryChar() + " " + sloganLines[i]);

            spaceLength = (width - 3) - (sloganLines[i].length());
            for(int j = 0; j < spaceLength; j++){
                sb.append(" ");
            }
            sb.append(getBoundaryChar() + "\n" );
            curHeight++;
        }

        // filling in with blank lines if less than 4 slogan lines
        while(curHeight < height){
            sb.append(getBoundaryChar());
            for(int i = 0; i < (width-2); i++){
                sb.append(" ");
            }
            sb.append(getBoundaryChar() + "\n");
            curHeight++;
        
        }

        // last line that is all boundary chars
        for(int i = 0; i < width; i++){
            sb.append(getBoundaryChar());
        }

        sb.append("\n");

        return sb.toString();

    }

}



