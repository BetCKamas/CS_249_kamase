package edu.realemj.Exercises_12;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle() {}

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width*height;
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += ", (" + width + " x " + height + ")";
        return s;
    }    
}
