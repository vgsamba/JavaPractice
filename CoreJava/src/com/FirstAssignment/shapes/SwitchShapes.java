package com.FirstAssignment.shapes;

public class SwitchShapes {
    public static void main(String[] args) {
        Shapes sh1 = new Shapes();
        sh1.calculateShapeArea(3, 12);
        sh1.calculateShapeArea(4, 15);
        sh1.calculateShapeArea(5, 15);
    }

    public void calculateShapeArea(int numberOfSides, int sideLength) {
        switch (numberOfSides)
        {
            case 1:
                Circle c1 = new Circle(sideLength);
                c1.calculateArea();
                break;
            case 3:
                Triangle t1 = new Triangle(sideLength);
                t1.calculateArea();
                break;
            case 4:
                Square s1 = new Square(sideLength);
                s1.calculateArea();
                break;
            default:
                System.out.println("No Shapes Present");
        }

    }
}
