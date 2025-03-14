package com.Polymorphism;

 
class Heart{
	float weigth;
	String Colour;

	public Heart(float weigth, String colour) {
		super();
		this.weigth = weigth;
		Colour = colour;
	}
	public float getWeight() {
		return weigth;
	}
	public String getColour() {
		return Colour;
	}
}
class brain{
	float Weigth;
	int IQ;
	public brain(float weight, int iQ) {
		super();
		Weigth = weight;
		IQ = iQ;
	}
	public float getWeight() {
		return Weigth;
	}
	public int getIQ() {
		return IQ;
	}
}
class bike{
	String name;
	int mileage;
	public bike(String name, int mileage) {
		super();
		this.name = name;
		this.mileage = mileage;
	}
	public String getName() {
		return name;
	}
	public int getMileage() {
		return mileage;
	}
	
}
class Mobile{
	String name;
	int cost;
	public Mobile(String name, int cost) {
		super();
		this.name = name;
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public int getCost() {
		return cost;
	}
}
class Student {
	Heart h = new Heart(1, "red");
	brain b = new brain(0.5f,100);
	void hasBike(bike b) {	 
	System.out.println(b.getName());
	System.out.println(b.getMileage());
		}
	void hasMobile(Mobile m) {
	System.out.println(m.getName());
	System.out.println(m.getCost());
	
}
}
public class Launch1 {
public static void main(String[]args) {
	Student s = new Student();
	bike b = new bike("KTM", 30);
	Mobile m = new Mobile("oppo", 21000);
	System.out.println(s.h.getWeight());
	System.out.println(s.h.getColour());
	System.out.println(s.b.getWeight());
	System.out.println(s.b.getIQ());
	System.out.println(b.getName());
	System.out.println(b.getMileage());
	System.out.println(m.getName());
	System.out.println(m.getCost());
	s=null;
	System.out.println(b.getName());
	System.out.println(b.getMileage());
	System.out.println(m.getName());
	System.out.println(m.getCost());
}
	}

