package com.FirstAssignment.shapes;

public class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void calculateArea()
    {
        double area=3.14 *radius * radius;
        System.out.println("The Area of the Circle is " +area);
    }
}
