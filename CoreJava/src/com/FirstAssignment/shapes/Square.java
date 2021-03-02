package com.FirstAssignment.shapes;

public class Square {
    int sides;

    public Square(int sides) {
        this.sides = sides;
    }

    public void calculateArea()
    {
        double area=sides  * sides;
        System.out.println("The Area of the Square is " +area);
    }
}
