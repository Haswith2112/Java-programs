package com.HasARelationship;

class Heart {
	double Weight;
	double Beats;
	public Heart(double weight, double beats) {
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

	class Brain {
		double Weight;
		double power;
		public Brain(double weight, double power) {
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
	
		class Bike {
			String Company;
			double price;
			public Bike(String company, double price) {
				super();
				this.Company = company;
				this.price = price;
			}
			public String getCompany() {
				return Company;
			}
			public double getPrice() {
				return price;
			}
		}
			
			class Mobile {
				String Company;
				double price;
				public Mobile(String company, double price) {
					super();
					this.Company = company;
					this.price = price;
				}
				public String getCompany() {
					return Company;
				}
				public double getPrice() {
					return price;
				}
				
			}
			
			class Student {
				Heart h = new Heart(0.5,65.5);
				Brain b = new Brain(0.8,1.0);
				void hasBike(Bike b) {
					System.out.println(b.getCompany());
					System.out.println(b.getPrice());
				}
				void hasMobile(Mobile m) {
					System.out.println(m.getCompany());
					System.out.println(m.getPrice());
				}
				
			}
			
public class HasARelationShip {
	public static void main(String[] args) {
		Student s = new Student();
		Bike b = new Bike("Pulsar",60000);
		Mobile m = new Mobile("Infinix",15000);
		System.out.println(s.h.getWeight());
		System.out.println(s.h.getBeats());
		System.out.println("----------------------");
		System.out.println(s.b.getWeight());
		System.out.println(s.b.getPower());
		System.out.println("--------------------------");
		s.hasBike(b);
		System.out.println("--------------------------");
		s.hasMobile(m);
		System.out.println("===================================");
		System.out.println("Without enclosing object");
		s = null;
		System.out.println(b.getCompany());
		System.out.println(b.getPrice());
		System.out.println("--------------------------");
		System.out.println(m.getCompany());
		System.out.println(m.getPrice());
		
		
		 

	}

}
