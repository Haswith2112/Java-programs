//FOUR PILLERS USING CODE BASED ON UML DIAGRAM

package com.Abstraction.oops;

import java.util.Scanner;

abstract class Shapes {
	double area;
	
	abstract void CollectData();
	abstract void Calculate();
	void display() {
		System.out.println("The area is = "+area);
	}
}

class Circle extends Shapes {
	private double radius;
	private final double pi =3.14768;
	@Override
	void CollectData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius : ");
		radius= sc.nextDouble();
	}
	void Calculate() {
		area = pi*radius*radius;		
	}
}

class Square extends Shapes {
	private double side;
	@Override
	void CollectData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side : ");
		side= sc.nextDouble();
	}
	void Calculate() {
		area = side*side;	
	}
}

class Rectangle extends Shapes {
	private double length,breadth;
	@Override
	void CollectData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length : ");
		length= sc.nextDouble();
		System.out.println("Enter the breadth : ");
		breadth= sc.nextDouble();
	}
	void Calculate() {
		area = length*breadth;	
	}	
}

class Geometry {
	void useshapes(Shapes s) {
		s.CollectData();
		s.Calculate();
		s.display();		
	}
}

public class AbstractionCode2 {
public static void main(String[] args) {
	Circle c = new Circle();
	Square s = new Square();
	Rectangle r = new Rectangle();
	Geometry g = new Geometry();
	
	System.out.println("Circle based operations");
	g.useshapes(c);
	System.out.println("====================");
	
	System.out.println("Square based operations");
	g.useshapes(s);
	System.out.println("====================");
	
	System.out.println("Rectangle based operations");
	g.useshapes(r);
	System.out.println("====================");
		
}
}
