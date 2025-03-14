package com.Encapsulation.opps;
class Dog5 {
	private String name;
	private String color;
	private  int cost;
	private int age;
	private String breed;
	
	//zero parameterized constructor
	public Dog5() {
		 super();
		 System.out.println("showing values after exicuting zero parameterized costructor");
		 System.out.println(name);
		 System.out.println(color);
		 System.out.println(cost);
		 System.out.println(age);
		 System.out.println(breed);
	}
	
	//1 parameterized constructor
	public Dog5(String name) {
		 this("tommy","yellow");
		 this.name = name;
		 System.out.println("showing values after exicuting 1 parameterized costructor");
		 System.out.println(name);
		 System.out.println(color);
		 System.out.println(cost);
		 System.out.println(age);
		 System.out.println(breed);
	}
	
	//2 parameterized constructor
	public Dog5(String name,String color) {
		 this("Rocky","Brown",7000);
		 this.name = name;
		 this.color = color;
		 System.out.println("showing values after exicuting 2 parameterized costructor");
		 System.out.println(name);
		 System.out.println(color);
		 System.out.println(cost);
		 System.out.println(age);
		 System.out.println(breed);
	}
	
	//3 parameterized constructor
	public Dog5(String name,String color,int cost) {
		 this("Shokey","Black",9000,5);
		 this.name = name;
		 this.color = color;
		 this.cost = cost;
		 System.out.println("showing values after exicuting 3 parameterized costructor");
		 System.out.println(name);
		 System.out.println(color);
		 System.out.println(cost);
		 System.out.println(age);
		 System.out.println(breed);
	}
	
	//4 parameterized constructor
		public Dog5(String name,String color,int cost,int age) {
			 this("Bunty","White",8000,6,"GR");
			 this.name = name;
			 this.color = color;
			 this.cost = cost;
			 this.age = age;
			 System.out.println("showing values after exicuting 4 parameterized costructor");
			 System.out.println(name);
			 System.out.println(color);
			 System.out.println(cost);
			 System.out.println(age);
			 System.out.println(breed);
		}
		
		//5 parameterized constructor
				public Dog5(String name,String color,int cost,int age,String breed) {
					 this();
					 this.name = name;
					 this.color = color;
					 this.cost = cost;
					 this.age = age;
					 this.breed = breed;
					 System.out.println("showing values after exicuting 5 parameterized costructor");
					 System.out.println(name);
					 System.out.println(color);
					 System.out.println(cost);
					 System.out.println(age);
					 System.out.println(breed);
				}

				public String getName() {
					return name;
				}

				public String getColor() {
					return color;
				}

				public int getCost() {
					return cost;
				}

				public int getAge() {
					return age;
				}

				public String getBreed() {
					return breed;
				}
}
public class Constructors {
	public static void main(String[] args) {
		
		 Dog5 d = new Dog5("vicky");
		 System.out.println(d.getName());
			System.out.println(d.getColor());
			System.out.println(d.getCost());
			System.out.println(d.getAge());
			System.out.println(d.getBreed());

	}

}
