//COMDENCED POLYMORPHISM APROACH

package com.Polymorphism;


class plane2 {
	void Takeoff() {
		System.out.println("plane2 is Taking off");
	}
	void fly() {
		System.out.println("plane2 is flying");
	}
	void land() {
		System.out.println("plane2 is landing");
	}
}
class Cargoplane2 extends plane2{
	@Override
	void fly() {
		System.out.println("Corgoplane2 is flying");
	}
	void CarryGoods() {
		System.out.println("Corgoplane2 carry goods");
	}
}
	class Passengerplane2 extends plane2{
		@Override
		void fly() {
			System.out.println("Passengerplane2 is flying");
		}
		void CarryHumans() {
			System.out.println("Passengerplane2 carry Humans");
		}
	}
		class Fighterplane2 extends plane2{
			@Override
			void fly() {
				System.out.println("Fighterplane1 is flying");
			}
			void CarryWeapones() {
				System.out.println("Fighterplane1 carry Weapones");
			}	
}
		class Airport1 {
			void permit (plane2 ref) {
				ref.Takeoff();
				ref.fly();
				ref.land();
			}
		}

public class PolymorphismCode2{
	public static void main(String[] args) {
		Airport1 a1 = new Airport1();
		Cargoplane2 cp = new Cargoplane2();
		a1.permit(cp);
		cp.CarryGoods();
		System.out.println("=================");
		Passengerplane2 pp = new Passengerplane2();
		a1.permit(pp);
		pp.CarryHumans();
		System.out.println("=================");
		Fighterplane2 fp = new Fighterplane2();
		a1.permit(fp);
		fp.CarryWeapones();
		System.out.println("=================");
	
	}

}


