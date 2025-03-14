//UML DIAGRAM

package com.Inheritance.oops;
 
class Animal {
	void Walk() {
		System.out.println("Animal is Walking");
	}
	void Eat() {
		System.out.println("Animal is Eating");
	}
	void Move() {
		System.out.println("Animal is Moving");
	}
}
class  Dog extends Animal{
	@Override
	void Eat() {
		System.out.println("Dog is Eating a Cat");
	}
	void Makesound() {
		System.out.println("Dog make sounds like bow bow");
	}
}
	class  Cat extends Animal{
		@Override
		void Eat() {
			System.out.println(" Cat is Eating a Mouse");
		}
		void Makesound() {
			System.out.println("Cat make sounds like meow ");
		}
	}
		class Bird extends Animal {
			@Override
			void Eat() {
				System.out.println("Bird is Eating seeds");
			}
			void  Makesound() {
				System.out.println("Bird smake sounds like caw");
			}	
}

public class InheritanceCode4 {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.Walk();
		d.Eat();
		d.Move();
		d.Makesound();
		System.out.println("=================");
		 Cat c = new  Cat();
		 c.Walk();
	     c.Eat();
		 c.Move();
		 c.Makesound();
		System.out.println("=================");
		 Bird b = new  Bird();
		 b.Walk();
		 b.Eat();
		 b.Move();
		 b.Makesound();
		System.out.println("=================");
	
	}

}

