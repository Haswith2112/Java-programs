package com.HasARelationship;

class Heart2 {
	double Weight;
	double Beats;
	public Heart2(double weight, double beats) {
		super();
		this.Weight = weight;
		this.Beats = beats;
	}
	public double getWeight() {
		return Weight;
	}
	public double getBeats() {
		return Beats;
	}
}

	class Brain2 {
		double Weight;
		double power;
		public Brain2(double weight, double power) {
			super();
			this.Weight = weight;
			this.power = power;
		}
		public double getWeight() {
			return Weight;
		}
		public double getPower() {
			return power;
		}
	}	
	

	class Bike2 {
		String Company;
		double price;
		public Bike2(String company, double price) {
			super();
			this.Company  = company;
			this.price = price;
		}
		public String getCompany() {
			return Company;
		}
		public double getPrice() {
			return price;
		}
	}
		
		class Mobile2 {
			String Company;
			double price;
			public Mobile2(String company, double price) {
				super();
				this.Company  = company;
				this.price = price;
			}
			public String getCompany() {
				return Company;
			}
			public double getPrice() {
				return price;
			}
			
		}
		
		class Human {
			Heart2 h = new Heart2(0.5,65.5);
			Brain2 b = new Brain2(0.8,1.0);
		}
		
		class Student2 extends Human {
			void hasBike2(Bike2 b) {
				System.out.println(b.getCompany());
				System.out.println(b.getPrice());
			}
			void hasMobile2(Mobile2 m) {
				System.out.println(m.getCompany());
				System.out.println(m.getPrice());
			}		
}
		
		
public class HasARelationCOde2 {
	public static void main(String[] args) {
		Student2 s = new Student2();
		Bike2 b = new Bike2("Pulsar",60000);
		Mobile2 m = new Mobile2("Infinix",15000);
		System.out.println(s.h.getWeight());
		System.out.println(s.h.getBeats());
		System.out.println("----------------------");
		System.out.println(s.b.getWeight());
		System.out.println(s.b.getPower());
		System.out.println("--------------------------");
		s.hasBike2(b);
		System.out.println("--------------------------");
		s.hasMobile2(m);
		System.out.println("===================================");
		System.out.println("Without enclosing object");
		s= null;
		System.out.println(b.getCompany());
		System.out.println(b.getPrice());
		System.out.println("--------------------------");
		System.out.println(m.getCompany());
		System.out.println(m.getPrice());
	}
}
