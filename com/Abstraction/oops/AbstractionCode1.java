package com.Abstraction.oops;


abstract class plane2 {
	void Takeoff() {
		System.out.println("plane2 is Taking off");
	}
	abstract void fly();
	void land() {
		System.out.println("plane2 is landing");
	}
}
class Cargoplane2 extends plane2{
	@Override
	void fly() {
		System.out.println("Corgoplane2 is flying");
	}
	 
}
	class Passengerplane2 extends plane2{
		@Override
		void fly() {
			System.out.println("Passengerplane2 is flying");
		}
		 
	}
		class Fighterplane2 extends plane2{
			@Override
			void fly() {
				System.out.println("Fighterplane1 is flying");
			}
			 
}
		class Airport1 {
			void permit (plane2 ref) {
				ref.Takeoff();
				ref.fly();
				ref.land();
			}
		}

public class AbstractionCode1{
	public static void main(String[] args) {
		Airport1 a1 = new Airport1();
		Cargoplane2 cp = new Cargoplane2();
		a1.permit(cp);
		System.out.println("=================");
		Passengerplane2 pp = new Passengerplane2();
		a1.permit(pp);
		System.out.println("=================");
     	Fighterplane2 fp = new Fighterplane2();
		a1.permit(fp);
		System.out.println("=================");
	
	}

}


