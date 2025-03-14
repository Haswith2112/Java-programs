package com.Encapsulation.opps;

class Dog {
	private String name;
	private int age;
	private String color;
	private int cost;
	private String breed;
	//generic setters
	void setData(String a, int b, String c, int d, String e) {
		name = a;
		age = b;
		color = c;
		cost = d;
		breed = e;
	}
	//generic getters
	void getData() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(breed);	
	}	
}
public class EncapsulationGeneric {
	public static void main(String[] args) {
	Dog d1 = new Dog();	 
	d1.setData("Tommy", 10, "White", 5000, "Pug");
	d1.getData();
	}
}
