package com;

public class Circle {
    /*A class called circle is designed as shown in the following class diagram. It contains:

Two private instance variables: radius (of the type double) and color (of the type String),
with default value of 1.0 and "red", respectively.
Two overloaded constructors - a default constructor with no argument, and a constructor which
takes a double argument for radius.
Two public methods: getRadius() and getArea(), which return the radius and area of this instance, respectively.*/

    private double radius;
    private String color;

    public static void main(String[] args)
    {
        Circle c=new Circle();
        System.out.println(c.getArea());
        System.out.println(c.toString());

    }
    public Circle()
    {    // Default initialization using constructor
        this.radius=1.0;
        this.color="red";
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius =radius;
        this.color = color;
    }
    public double getArea()
    {
        double area=3.15*radius*radius;
        return area;
    }

    public double getRadius() {
        return radius;
    }

        public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
