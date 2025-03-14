//COMDENCED POLYMORPHISM APROACH

package com.Inheritance.oops;
 
class Animal2 {
	void Walk() {
		System.out.println("Animal2 is Walking");
	}
	void Eat() {
		System.out.println("Animal2 is Eating");
	}
	void Move() {
		System.out.println("Animal2 is Moving");
	}
}
class  Dog2 extends Animal2{
	@Override
	void Eat() {
		System.out.println("Dog2 is Eating a Cat");
	}
	void Makesound() {
		System.out.println("Dog2 make sounds like bow bow");
	}
}
	class  Cat2 extends Animal2{
		@Override
		void Eat() {
			System.out.println("Cat2 is Eating a Mouse");
		}
		void Makesound() {
			System.out.println("Cat2 make sounds like meow ");
		}
	}
		class Bird2 extends Animal2 {
			@Override
			void Eat() {
				System.out.println("Bird2 is Eating seeds");
			}
			void  Makesound() {
				System.out.println("Bird2 smake sounds like caw");
			}	
}
		class Forest {
			void goes (Animal2 ref) {
				ref.Walk();
				ref.Eat();
				ref.Move();			 
			}
		}

public class InheritanceCode6 {
	public static void main(String[] args) {
	    Forest f = new Forest();
		Dog2 d1 = new Dog2();
		f.goes(d1);
		d1.Makesound();
		System.out.println("=================");
		Cat2 c1 = new  Cat2();
		f.goes(c1);
		c1.Makesound();
		System.out.println("=================");
		Bird2 b1 = new  Bird2();
		f.goes(b1);
		b1.Makesound();
		System.out.println("=================");
	
	}

}


