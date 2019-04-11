package com.company;

public class Circle {

    double radius;
    final double PI_VAL = 3.14159;

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(){
        this.radius = 0.0;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        //double area = PI_VAL * radius * radius;
        return PI_VAL* radius * radius;
    }
    public double getDiameter() {
        //double diameter = radius * 2;
        return radius * 2;
    }
    public double getCircumference() {
        //double circumference = 2 * PI_VAL * radius;
        return 2 * PI_VAL * radius;
    }

}
