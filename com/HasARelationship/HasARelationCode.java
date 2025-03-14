package com.HasARelationship;

class OS {
	double Version;
	String name;
	public OS(double version, String name) {
		super();
		this.Version = version;
		this.name = name;
	}
	public double getVersion() {
		return Version;
	}
	public String getName() {
		return name;
	}
}

class Charger {
	String Company;
	double Volts;
	public Charger(String company, double volts) {
		super();
		this.Company = company;
		this.Volts = volts;
	}
	public String getCompany() {
		return Company;
	}
	public double getVolts() {
		return Volts;
	}	
}

class Mobile1 {
	OS os = new OS(5.7,"Version-5");
	void hasCharger(Charger c) {
		System.out.println(c.getCompany());
		System.out.println(c.getVolts());
	}	
}


public class HasARelationCode {
	public static void main(String[] args) {
		Mobile1 m = new Mobile1();
		Charger c = new Charger("Samsung",15.5);
		System.out.println(m.os.getName());
		System.out.println(m.os.getVersion());
		System.out.println("---------------------------");
		m.hasCharger(c);
		System.out.println("===============================");
		System.out.println("Without enclosing object");
		m = null;
		System.out.println(c.getCompany());
		System.out.println(c.getVolts());
	}
}
