package edu.kamase.Exercises_14;

import edu.kamase.Exercises_09.Matrix2D;

public abstract class Shape {
    protected boolean filled;
    private Matrix2D center = Matrix2D.makePoint2D(0,0);
    
    protected Shape(){}

    protected Shape(boolean filled, Matrix2D center){
        this.filled = filled;
        this.center = new Matrix2D(center);
    }

    public boolean isFilled(){
        return filled;
    }

    public Matrix2D getCenter(){
        return new Matrix2D(center);
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public void setCenter(Matrix2D center){
        this.center = center;
    }

    public String toString(){
        String s = "Shape, ";
        s += center.toCoordString();
        s += ", ";
        if(filled){
            s += "filled";
        }
        else{
            s += "empty";
        }
        return s;
    }

    public static String getNameOfShape(){
        return "Generic Shape";
    }

    public abstract double getArea();

    @Override
    public boolean equals(Object other){
        boolean isEqual = false;
        if( other instanceof Shape os){
            isEqual = true;
        }

        return isEqual;
        
    }
    
}
