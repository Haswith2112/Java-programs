package com.Encapsulation.opps;

class Dog2 {
	private String name;
	private int age;
	private String color;
	private int cost;
	private String breed;
	//generic setters
	void setData(String name, int age, String color, int sodt, String breed) {
		name = name;
		age = age;
		color = color;
		cost = cost;
		breed = breed;
	}
	//generic getters
	void getData() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(breed);	
	}	
	
	//specific setters
		void setName(String name) {
			name = name;
		}
		void setAge(int age) {
			age = age;
		}
		void setColor(String color) {
			color = color;
		}
		void setCost(int cost) {
			cost = cost;
		}
		void setBreed(String breed) {
			breed = breed;
		}
		
		//specific getters
		String getName() {
			return name;
		}
		int getAge() {
			return age;
		}
		String getColor() {
			return color;
		}
		int getCost() { 
			return cost;
		}
		String getBreed() {
			return breed;
		}
}
public class Shadowinpronlem {

	public static void main(String[] args) {
		Dog2 d = new Dog2();	 
		d.setData("Tommy", 10, "White", 5000, "Pug");
		d.getData();
		
		
		Dog2 d1 = new Dog2();
		d1.setName("Rocky");
		d1.setAge(10);
		d1.setColor("Red");
		d1.setCost(7000);
		d1.setBreed("GR");
		System.out.println("===========================");
		System.out.println(d1.getName());
		System.out.println(d1.getAge());
		System.out.println(d1.getColor());
		System.out.println(d1.getCost());
		System.out.println(d1.getBreed());

 

	}

}
