//UML DIAGRAM

package com.Inheritance.oops;
class plane {
	void Takeoff() {
		System.out.println("plane is Taking off");
	}
	void fly() {
		System.out.println("plane is flying");
	}
	void land() {
		System.out.println("plane is landing");
	}
}
class Cargoplane extends plane{
	@Override
	void fly() {
		System.out.println("Corgoplane is flying");
	}
	void CarryGoods() {
		System.out.println("Corgoplane carry goods");
	}
}
	class Passengerplane extends plane{
		@Override
		void fly() {
			System.out.println("Passengerplane is flying");
		}
		void CarryHumans() {
			System.out.println("Passengerplane carry Humans");
		}
	}
		class Fighterplane extends plane{
			@Override
			void fly() {
				System.out.println("Fighterplane is flying");
			}
			void CarryWeapones() {
				System.out.println("Fighterplane carry Weapones");
			}	
}

public class InheritanceCode1 {
	public static void main(String[] args) {
		Cargoplane cp = new Cargoplane();
		cp.Takeoff();
		cp.fly();
		cp.land();
		cp.CarryGoods();
		System.out.println("=================");
		Passengerplane pp = new Passengerplane();
		pp.Takeoff();
		pp.fly();
		pp.land();
		pp.CarryHumans();
		System.out.println("=================");
		Fighterplane fp = new Fighterplane();
		fp.Takeoff();
		fp.fly();
		fp.land();
		fp.CarryWeapones();
		System.out.println("=================");
	
	}

}
