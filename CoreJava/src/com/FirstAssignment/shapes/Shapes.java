package com.FirstAssignment.shapes;

public class Shapes {

    public static void main(String[] args) {
        Shapes sh1 = new Shapes();
        sh1.calculateShapeArea(3, 12);
        sh1.calculateShapeArea(4, 15);
        sh1.calculateShapeArea(5, 15);
    }

    public void calculateShapeArea(int numberOfSides, int sideLength) {
        if (numberOfSides == 1) {
            Circle c1 = new Circle(sideLength);
            c1.calculateArea();
        } else if (numberOfSides == 3) {
            Triangle t1 = new Triangle(sideLength);
            t1.calculateArea();
        } else if (numberOfSides == 4) {
            Square s1 = new Square(sideLength);
            s1.calculateArea();
        }else
            {
                System.out.println("No Shapes Present");
            }

    }

}

