package edu.kamase.Assign03;

public class Letterhead {

    private String slogan;
    private String [] sloganLines;
    private char boundaryChar;
    private String name;
    private String letterhead;

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
        for(int i = 0; i < 4; i++){
            sb.append(sloganLines[i]);
            sb.append("\n");
        }
        slogan = sb.toString();
        return slogan;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBoundaryChar(char boundaryChar){
        this.boundaryChar = boundaryChar;
    }

    public void setSlogan(String [] sloganLines){
        for(int i = 0; i < 4; i++){
            this.sloganLines[i] = sloganLines[i];
        }

    }

    public String toString(){
        int width = 40;
       // int height = 8;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < width; i++){
            sb.append(boundaryChar);
        }
        sb.append("\n");

        int spaceLength = (width - 3) - name.length();

        sb.append(boundaryChar + " " + name);

        for(int i = 0; i < spaceLength; i++){
            sb.append(" ");
        }

        sb.append(boundaryChar + "\n" + boundaryChar);

        for(int i = 0; i < (width-2); i++){
            sb.append(" ");
        }

        sb.append(boundaryChar + "\n" + boundaryChar + " ");

        for(int i = 0; i < 4; i++){
            sb.append(boundaryChar + " " + sloganLines[i]);

            spaceLength = width - sloganLines[i].length();
            for(int j = 0; j < spaceLength; j++){
                sb.append(" ");
            }
            sb.append(boundaryChar + "\n" );
        }

        for(int i = 0; i < width; i++){
            sb.append(boundaryChar);
        }

        sb.append("\n");

        letterhead = sb.toString();

        return letterhead;
    }

}



