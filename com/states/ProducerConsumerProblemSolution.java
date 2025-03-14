package com.states;
 
class Producer1 extends Thread{
	Queue1 a;
	Producer1(Queue1 q) {
		a = q;
	}
	 
	@Override
	public void run() {
		 int i =1;
		 while(true) {
			 a.put(i);
			 i++;
		 }
	}
	
}
class Consumer1 extends Thread{
	Queue1 b;
	Consumer1(Queue1 q) {
		b = q;
}
 
@Override
public void run() {
	 while(true) {
		 b.get();
	 }  
	 }
}
class Queue1{
     int x;
     boolean value_of_x = false;
	synchronized public void put(int i) {
		try {
		  if(value_of_x == false) {
		      x = i;
		      System.out.println("The producer has produced the value"+i+" into x");
		      value_of_x = true;
		      notify();
	}
		  else {
			  wait();
		  }
		  }
		catch (Exception e){
			e.printStackTrace();
		}
			
		}
	synchronized public void get() {
		try {
			  if(value_of_x == true) {
			      System.out.println("The consumer has consumed the value"+x+"from x");	
			      value_of_x = false;
			      notify();
		}
			  else {
				  wait();
			  }
			  }
			catch (Exception e){
				e.printStackTrace();
			}
				
			} 
	}
	


public class  ProducerConsumerProblemSolution {
	public static void main(String[] args) {
		Queue1 q = new Queue1();
		Producer1 p = new Producer1(q);
		Consumer1 c = new Consumer1(q);
		
		p.start();
		c.start();
	}

}

 