package com.company;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[9];
        shapes[0] = new Triangle(10, 11);
        shapes[1] = new Triangle(20, 22);
        shapes[2] = new Triangle(30, 33);
        shapes[3] = new Rectangle(40, 44);
        shapes[4] = new Rectangle(50, 55);
        shapes[5] = new Rectangle(60, 66);
        shapes[6] = new Circle(70);
        shapes[7] = new Circle(80);
        shapes[8] = new Circle(90);

        for(Shape shape : shapes){
            System.out.println(shape.area());
        }
    }
}
