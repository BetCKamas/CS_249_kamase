package edu.kamase.Exercises_14;

public class Circle extends CircleLike implements Comparable<Circle>{
    private double radius;

    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getRadius(){
        return radius;
    }
    @Override
    public boolean equals(Object other){
        boolean e = false;
        if(other instanceof Circle c){
            double diff = Math.abs(radius - c.radius);
            if(diff < 1e-15){
                e = true;
            }
        }
        return e;
    }
    @Override
    public int compareTo(Circle other){
        if(this.equals(other)){
            return 0;
        }
        else if(radius < other.radius){
            return -1;
        }
        else{
            return +1;
        }
    }
}
