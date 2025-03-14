// POLYMORPHISM 

package com.Polymorphism;
 
class Animal1 {
	void Walk() {
		System.out.println("Animal1 is Walking");
	}
	void Eat() {
		System.out.println("Animal1 is Eating");
	}
	void Move() {
		System.out.println("Animal1 is Moving");
	}
}
class  Dog1 extends Animal1{
	@Override
	void Eat() {
		System.out.println("Dog1 is Eating a Cat");
	}
	void Makesound() {
		System.out.println("Dog1 make sounds like bow bow");
	}
}
	class  Cat1 extends Animal1{
		@Override
		void Eat() {
			System.out.println(" Cat1 is Eating a Mouse");
		}
		void Makesound() {
			System.out.println("Cat1 make sounds like meow ");
		}
	}
		class Bird1 extends Animal1 {
			@Override
			void Eat() {
				System.out.println("Bird1 is Eating seeds");
			}
			void  Makesound() {
				System.out.println("Bird1 smake sounds like caw");
			}	
}

public class PolymorphismCode3 {
	public static void main(String[] args) {
		Animal1 ref;
		Dog1 d = new Dog1();
		ref = d;
		ref.Walk();
		ref.Eat();
		ref.Move();
		d.Makesound();
		System.out.println("=================");
		 Cat1 c = new  Cat1();
		 ref = c;
		 ref.Walk();
	     ref.Eat();
		 ref.Move();
		 c.Makesound();
		System.out.println("=================");
		 Bird1 b = new  Bird1();
		 ref = b;
		 ref.Walk();
		 ref.Eat();
		 ref.Move();
		 b.Makesound();
		System.out.println("=================");
	
	}

}


