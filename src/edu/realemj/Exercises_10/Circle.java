package edu.realemj.Exercises_10;

import edu.realemj.Exercises_09.Matrix2D;

public class Circle {
    private double radius = 1.0;
    private Matrix2D pos = Matrix2D.makePoint2D(0,0);

    public Circle() {
        // Do nothing
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    public Circle(Matrix2D pos) {
        setCenter(pos);
    }

    public Circle(double radius, Matrix2D pos) {
        setRadius(radius);
        setCenter(pos);
    }

    public Circle(Circle other) {
        this.radius = other.radius;
        this.pos = new Matrix2D(other.pos);
    }
    
    public String toString() {
        String s = "Circle with radius " + radius;
        s += " at";
        s += " (" + pos.getValue(0,0);
        s += "," + pos.getValue(1,0) + ")";
        return s;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        if(radius >= 0) {
            this.radius = radius;
        }
    }

    public Matrix2D getCenter() {
        return new Matrix2D(pos);
    }

    public void setCenter(Matrix2D p) {
        pos = new Matrix2D(p);
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }

    public double getPerimeter() {
        return 2.0*Math.PI*radius;
    }
}
