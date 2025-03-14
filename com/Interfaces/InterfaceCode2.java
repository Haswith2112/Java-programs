package com.Interfaces;

import java.util.Scanner;

interface Shapes {
    void collectData();
    void calculate();
    void display();
}

class Circle implements Shapes {
    private double radius;
    private final double pi = 3.14768;
    private double area;

    @Override
    public void collectData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        radius = sc.nextDouble();
    }

    @Override
    public void calculate() {
        area = pi * radius * radius;
    }

    @Override
    public void display() {
        System.out.println("The area of the circle is: " + area);
    }
}

class Square implements Shapes {
    private double side;
    private double area;

    @Override
    public void collectData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side: ");
        side = sc.nextDouble();
    }

    @Override
    public void calculate() {
        area = side * side;
    }

    @Override
    public void display() {
        System.out.println("The area of the square is: " + area);
    }
}

class Rectangle implements Shapes {
    private double length, breadth;
    private double area;

    @Override
    public void collectData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        length = sc.nextDouble();
        System.out.println("Enter the breadth: ");
        breadth = sc.nextDouble();
    }

    @Override
    public void calculate() {
        area = length * breadth;
    }

    @Override
    public void display() {
        System.out.println("The area of the rectangle is: " + area);
    }
}

class Geometry {
    void useShape(Shapes s) {
        s.collectData();
        s.calculate();
        s.display();
    }
}

public class InterfaceCode2 {
    public static void main(String[] args) {
        Circle c = new Circle();
        Square s1 = new Square();
        Rectangle r = new Rectangle();
        Geometry g = new Geometry();

        System.out.println("Circle based operations");
        g.useShape(c);
        System.out.println("====================");

        System.out.println("Square based operations");
        g.useShape(s1);
        System.out.println("====================");

        System.out.println("Rectangle based operations");
        g.useShape(r);
        System.out.println("====================");
    }
}
