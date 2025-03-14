// POLYMORPHISM 

package com.Polymorphism;
 

class plane1 {
	void Takeoff() {
		System.out.println("plane1 is Taking off");
	}
	void fly() {
		System.out.println("plane1 is flying");
	}
	void land() {
		System.out.println("plane1 is landing");
	}
}
class Cargoplane1 extends plane1{
	@Override
	void fly() {
		System.out.println("Corgoplane1 is flying");
	}
	void CarryGoods() {
		System.out.println("Corgoplane1 carry goods");
	}
}
	class Passengerplane1 extends plane1{
		@Override
		void fly() {
			System.out.println("Passengerplane1 is flying");
		}
		void CarryHumans() {
			System.out.println("Passengerplane1 carry Humans");
		}
	}
		class Fighterplane1 extends plane1{
			@Override
			void fly() {
				System.out.println("Fighterplane1 is flying");
			}
			void CarryWeapones() {
				System.out.println("Fighterplane1 carry Weapones");
			}	
}

public class PolymorphismCode1 {
	public static void main(String[] args) {
		plane1 ref;
		Cargoplane1 cp = new Cargoplane1();
		ref = cp;
		ref.Takeoff();
		ref.fly();
		ref.land();
		cp.CarryGoods();
		System.out.println("=================");
		Passengerplane1 pp = new Passengerplane1();
		ref = pp;
		ref.Takeoff();
		ref.fly();
		ref.land();
		pp.CarryHumans();
		System.out.println("=================");
		Fighterplane1 fp = new Fighterplane1();
		ref = fp;
		ref.Takeoff();
		ref.fly();
		ref.land();
		fp.CarryWeapones();
		System.out.println("=================");
	
	}

}

