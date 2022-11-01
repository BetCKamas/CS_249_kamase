package edu.kamase.Assign04;

public class CharImage {

    private int rowCnt;
    private int colCnt;
    private char fillChar;
    private char [][] image;

    public CharImage(int rowCnt, int colCnt, char fillChar){
        this.rowCnt = rowCnt;
        this.colCnt = colCnt;
        this.fillChar = fillChar;
        this.image = new char[rowCnt][colCnt];

        for(int i = 0; i < this.image.length; i++){
            for(int j = 0; j < this.image[0].length; j++){
                this.image[i][j] = this.fillChar;
            }
        }

    }

    public void clear(){
        for(int i = 0; i < image.length; i++){
            for(int j = 0; j < image[0].length; j++){
                image[i][j] = fillChar;
            }
        }

    }

    public int getRowCnt(){
        return rowCnt;
    }
    
    public int getColCnt(){
        return colCnt;
    }

    public boolean isValidPosition(int row, int col){
        return ( row >= 0 && row < rowCnt && col >= 0 && col < colCnt);
    }

    public char getPos(int row, int col){
        char pos = ' ';
        if(isValidPosition(row, col)){
            pos = image[row][col];
        }
        return pos;
    }

    public boolean setPos(int row, int col, char c){
        boolean isValid = false;
        if(isValidPosition(row, col)){
            image[row][col] = c;
            isValid = true;
        }
        return isValid;
    }

    public String toString(){
        return(rowCnt + " x " + colCnt + " CharImage (default: " + fillChar + ")");

    }

    public String getMapString(){
        StringBuilder sb = new StringBuilder();
        for(int k = 0; k < this.image.length; k++){
            for(int m = 0; m < this.image[0].length; m++){
                sb.append(this.image[k][m]);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    
}
