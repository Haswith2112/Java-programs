package com.Interfaces;

interface Calculator {
	int a = 10;
	int b = 20;
	void add();
	void sub();
	default void div() {
		
	}
	static void mul() {
		
	}
	void mod() {
		
	}
	interface Calculatorr {
		void add();
		void sub();
		
	}
	class Test {
		
	}
	interface Test1 {
		
	}
	class Sample extends Test implements Calculator {

		@Override
		public void add() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void sub() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mod() {
			// TODO Auto-generated method stub
			
		}
		
	}
	class Calcy implements Calculatorr, Calculator {

		@Override
		public void mod() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void add() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void sub() {
			// TODO Auto-generated method stub
			
		}
		
	}
	interface Calculator2 implements Calculator {
		
	}
interface Calculator3  extends Calculator {
		
	}
class Calcy1 implements Calculator {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mod() {
		// TODO Auto-generated method stub
		
	}
	
}
	
}

public class InterfaceCode1 {
	public static void main(String[] args) {
	 
		Calculator c2;
		Calculator c1 = new Calculator() {

			@Override
			public void add() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void sub() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mod() {
				// TODO Auto-generated method stub
				
			}
			
		}
	}
	
	
	}


