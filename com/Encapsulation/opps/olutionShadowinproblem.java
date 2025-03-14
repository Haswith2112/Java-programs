package com.Encapsulation.opps;

class Dog3 {
	private String name;
	private int age;
	private String color;
	private int cost;
	private String breed;
	//generic setters
	void setData(String name, int age, String color, int cost, String breed) {
		this.name = name;
		this.age = age;
		this.color = color;
		this.cost = cost;
		this.breed = breed;
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
			this.name = name;
		}
		void setAge(int age) {
			this.age = age;
		}
		void setColor(String color) {
			this.color = color;
		}
		void setCost(int cost) {
			this.cost = cost;
		}
		void setBreed(String breed) {
			this.breed = breed;
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

public class olutionShadowinproblem {

	public static void main(String[] args) {
		Dog3 d = new Dog3();	 
		d.setData("Tommy", 10, "White", 5000, "Pug");
		d.getData();
		
		
		Dog3 d1 = new Dog3();
		d1.setName("Rocky");
		d1.setAge(10);
		d1.setColor("Red");
		d1.setCost(7000);
		d1.setBreed("GR");
		System.out.println("=========================");
		System.out.println(d1.getName());
		System.out.println(d1.getAge());
		System.out.println(d1.getColor());
		System.out.println(d1.getCost());
		System.out.println(d1.getBreed());

 

	}

}
